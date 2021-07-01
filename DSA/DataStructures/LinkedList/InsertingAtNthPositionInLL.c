#include<stdio.h>
#include<stdlib.h>

struct Node
{
    int data;
    struct Node* next;
};

void InsertAtEnd(struct Node** head_, int num)
{
    if(*head_ == NULL)
    {
        struct Node* newNode = (struct Node*)malloc(sizeof(struct Node*));
        newNode -> data = num;
        newNode -> next = NULL;
        (*head_) = newNode;
    }
    else
    {
        struct Node* newNode = (struct Node*)malloc(sizeof(struct Node*));
        newNode -> data = num;
        (*newNode).next = NULL;
        struct Node* temp = *head_;
        
        while(temp->next != NULL)temp = temp->next;
        temp->next = newNode;
    }
}

void insertAt(int n, int value, struct Node** head_)
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
    }
    else
    {
        struct Node* newNode = (struct Node*)malloc(sizeof(struct Node*));
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

void Traverse(struct Node* head)
{
    int count = 0;
    while(head!=NULL)
    {
        printf("Value of element at position = %d is = %d \n", count++, head->data);
        head = head -> next;
    }
}

int main()
{
    struct Node* head = NULL;
    insertAt(1, 5, &head);
    insertAt(3, 19, &head);
    insertAt(2, 21, &head);
    InsertAtEnd(&head, 34);
    InsertAtEnd(&head, 31);
    insertAt(2,98, &head);
    insertAt(1,11,&head);
    insertAt(2,71,&head);
    Traverse(head);
    return 0;
}