#include<stdio.h>
#include<stdlib.h>

struct Node
{
    int data;
    struct Node* next;
};

// using Node* poineterToHead(head_) just copies head from main and does no modification to head present 
// in main method
// So pointer to pointer variable is used to perform the operation
void Insert(int num, struct Node** head_)
{
    if(*head_ == NULL)
    {
        struct Node* node = (struct Node*)malloc(sizeof(struct Node));
        node -> data = num;
        node -> next = NULL;
        *head_ =  node;
    }
    else
    {
        struct Node* node = (struct Node*)malloc(sizeof(struct Node));
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
    printf("vlaue of address of HEAD node is = %d and Value of head node is = %d \n", head, head->data);
    head ->data = 2*head->data;
    while(head != NULL)
    {
        printf("value of data at node = %d = %d \n", count++, head->data);
        printf("vlaue of address of current node is = %d and next node is = %d\n", head, head->next);
        head = head -> next;

    }
    
    //printf("vlaue of address of HEAD node is = %d and Value of head node is = %d \n", head, head->data);
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
    printf("vlaue of address of HEAD node is = %d and Value of head node is = %d \n", head, head->data);
    return 0;
}