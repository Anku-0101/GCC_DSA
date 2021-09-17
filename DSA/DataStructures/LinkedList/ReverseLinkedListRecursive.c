#include "LinkedList.h"

void Reverse(struct Node** head)
{
    if((*head)->next == NULL)return;
    Reverse(&(*head)->next);
    (*head)->next->next = (*head);
    (*head) = (*head) ->next;
    (*head)->next = NULL;
}

int main()
{
    struct Node* head = NULL;
    Insert(5,&head);
    Insert(1,&head);
    InsertAt(3,21,&head);
    Insert(11,&head);
    Traverse(head);
    Reverse(&head);
    Traverse(head);
    return 0;
}