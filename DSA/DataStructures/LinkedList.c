#include<stdio.h>
#include<stdlib.h>

struct Node
{
    int data;
    struct Node* next;
};

// using Node* poineterToHead(head_) just copies head from main and does no modification to head present 
// in main method
// So double pointer variable is used to perform the operation
void Insert(int num, struct Node** head_)
{
    if(*head_ == NULL)
    {
        struct Node* node = (struct Node*)malloc(sizeof(struct Node*));
        node -> data = num;
        node -> next = NULL;
        *head_ =  node;
    }
    else
    {
        struct Node* node = (struct Node*)malloc(sizeof(struct Node*));
        node -> data = num;
        struct Node* tmp = *head_;
        while(tmp -> next != NULL)tmp = tmp -> next;
        tmp -> next = node;
        node -> next = NULL;
        
    }
}

void Traverse(struct Node* head)
{
    int count = 0;
    struct Node* temp = head;

    while(temp->next != NULL)
    {
        printf("value of data at node = %d = %d \n", count++, temp->data);
        printf("vlaue of address of current node is = %d and next node is = %d\n", temp, temp->next);
        temp = temp -> next;

    }
    
    printf("value of data at node = %d = %d \n", count++, temp->data);
    printf("vlaue of address of current node is = %d and next node is = %d \n", temp, temp->next);
    printf("Total number of elements in linkedlist = %d \n", count);
}

int main()
{
    
    struct Node* head; 
    head = NULL; 
    
    Insert(2, &head);
    printf("After inserting 2 head == NULL = %d \n", head == NULL);
    Insert(11, &head);
    Insert(15, &head);
    Insert(31, &head);
    Traverse(head);
    printf("vlaue of address of head node is = %d and next node is\n", head, head->next);
    return 0;
}