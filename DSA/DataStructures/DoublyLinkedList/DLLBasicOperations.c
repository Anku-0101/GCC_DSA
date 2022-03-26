#include<stdio.h>
#include<stdlib.h>

struct Node{
    int data;
    struct Node* next;
    struct Node* prev;
};

struct Node* InsertAtHead(int x, struct Node *head)
{
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));

    newNode->data = x;
    newNode->prev = NULL;
    
    if(head == NULL)
    {
        newNode->next = NULL;
    }
    else
    {
        head->prev = newNode;
        newNode->next = head;
    }
    head = newNode;
    return head;
}
struct Node* InsertAtTail(int x, struct Node *head)
{
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = x;
    newNode->next = NULL;

    if(head == NULL)
    {
        newNode->prev = NULL;
        head = newNode;
        return head;
    }
    else
    {
        struct Node* temp = head;
        while(temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = newNode;
        newNode->prev = temp;
        return head;
    }
}

void Print(struct Node* head)
{
    while(head != NULL)
    {
        printf(" %d ", head->data);
        head = head->next;
    }
    printf("\n");
}

void ReversePrint(struct Node* head)
{
    if(head == NULL)
    {
        return;
    }
    while(head->next != NULL)
    {
        head = head->next;
    }
    while(head != NULL)
    {
        printf(" %d ", head->data);
        head = head->prev;
    }
    printf("\n");
}

int main()
{
    struct Node *head = NULL;
    head = InsertAtHead(4,head);
    head = InsertAtHead(1,head);
    head = InsertAtHead(9,head);
    head = InsertAtHead(0,head);

    head = InsertAtTail(7,head);
    head = InsertAtTail(12,head);

    Print(head);
    ReversePrint(head);

    return 0;
}