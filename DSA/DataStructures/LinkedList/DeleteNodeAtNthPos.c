#include<stdio.h>
#include<stdlib.h>

struct Node
{
    int data;
    struct Node* next;
};

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

void DeleteAtNthPosition(int n, struct Node** head)
{
    struct Node* temp = *head;
    int count =0;
    while(temp !=0)
    {
        count++;
        temp = temp->next;
    }
    temp = *head;

    if(n>count || n < 1)
    {
        printf("No data to delete at position = %d \n", n);
    }
    else
    {
        if(n == 1)
        {
            *head = temp -> next;
            free(temp);
            return;
        }
        
        temp = *head;
        n--;
        while(n>1)
        {
            temp = temp->next;
            n--;
        }
        struct Node* temp2 = temp ->next;
        temp->next  = temp->next->next;
        free(temp2);
        return;
        
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
    InsertAt(2,12,&head);
    InsertAt(4,2,&head);
    InsertAt(1,2,&head);
    InsertAt(2,63,&head);
    InsertAt(3,41,&head);
    Traverse(head);
    InsertAt(4,11,&head);
    InsertAt(3,19,&head);
    InsertAt(2,49,&head);
    InsertAt(5,12,&head);
    Traverse(head);
    DeleteAtNthPosition(1,&head);
    DeleteAtNthPosition(3,&head);
    Traverse(head);
    DeleteAtNthPosition(13,&head);
    DeleteAtNthPosition(-1,&head);
    DeleteAtNthPosition(5,&head);
    Traverse(head);
    return 0;
}