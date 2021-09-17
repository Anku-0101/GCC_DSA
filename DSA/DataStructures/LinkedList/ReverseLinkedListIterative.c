
#include "LinkedList.h"

//  5 -> 11 -> 19 -> 53 -> 65
void Reverse(struct Node** head)
{
    struct Node* prev = NULL;
    struct Node* next = NULL;
    struct Node* curr = *head;

    // 3->5->8->2
    while(curr->next != NULL)
    {
        next = curr -> next;
        curr -> next = prev;
        prev = curr;
        curr = next;
    }
    curr ->next = prev;
    *head = curr;

}

int main()
{
    struct Node* head;
    head  = NULL;
    Insert(5,&head);
    Insert(11,&head);
    Insert(53,&head);
    Insert(65,&head);
    InsertAt(3,19,&head);
    Traverse(head);
    Reverse(&head);
    printf("After reversing the linked list \n");
    Traverse(head);
    return 0;
}