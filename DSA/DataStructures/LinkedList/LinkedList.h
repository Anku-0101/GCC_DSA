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
    while(head!=NULL)
    {
        printf("Value of element at position = %d is = %d \n", count++, head->data);
        head = head -> next;
    }
}

void InsertAt(int n, int value, struct Node** head_)
{
    struct Node* temp = *head_;
    int count = 0;

    while(temp != NULL)
    {
        ++count;
        temp = temp->next;
    }
    if(n > count+1)
    {
        printf("Position = %d is more than the size of LL = %d \n", n, count);
        return;
    }
    else
    {
        struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
        newNode -> data = value;
        
        struct Node* temp = NULL;
        
        if(n==1)
        {
            newNode -> next = *head_;
            *head_ = newNode;
        }
        else
        {
            temp = *head_;
            n--;
            
            while(n > 1)
            {
                temp = temp ->next;
                n--;
            }
            
            newNode -> next = temp->next;
            temp->next = newNode;
        }
    }        
}