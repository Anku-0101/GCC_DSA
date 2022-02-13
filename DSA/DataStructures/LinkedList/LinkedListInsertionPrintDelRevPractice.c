#include<stdio.h>
#include<stdlib.h>

struct Node
{
    int data;
    struct Node* next;
};

// Insert at end of Linked List
struct Node* Insert(struct Node *head, int value)
{   
    struct Node* temp = (struct Node*)malloc(sizeof(struct Node));;
    
    if(head == NULL)
    {
        temp->data = value;
        temp->next = NULL;
        head = temp;
        return head;
    }
    struct Node* temp1 = head;
    while(temp1->next != NULL)
    {
        temp1 = temp1->next;
    }
 
    temp -> data = value;
    temp -> next = NULL;
    temp1->next = temp;
    return head;    
}

struct  Node* Insert_(struct Node *head, int value, int index)
{
    int size = 0;
    struct Node* temp = head;
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    while (temp!=NULL)
    {
        size++;
        temp = temp->next;   
    }

    //printf("Size is = %d\n", size);

    if(size < index)
    {
        printf("can't add element as index is more than size of LL\n");
        return head;
    }
    if(index == 0)
    {
        newNode -> data = value;
        newNode ->next = head;

        head = newNode;
        
        return head;
    }
    int itr = index-1;
    temp = head;
    while(itr > 0)
    {
        temp = temp->next;
        itr--;
    }
    
    newNode->data = value;
    newNode -> next = temp->next;
    temp->next = newNode;

    return head;
}

void print(struct Node *head)
{
    printf("Content of LindedList \n");
    // In this method head will be a local variable
    while (head != NULL)
    {
        printf("%d ", head->data);
        head = head->next;
    }
    printf("\n");
}

struct Node* Delete(struct Node* head, int index)
{
    int size = 0;
    struct Node* temp = head;

    while (temp != NULL)
    {
        size++;
        temp = temp->next;
    }
    
    temp = head;
    if(index == 0)
    {
        head = temp->next;
        free(temp);
        return head;
        // if(size == 1)
        // {
        //     free(head);
        //     return NULL;
        // }
        // else
        // {
        //     temp = head->next;
        //     free(head);
        //     return temp;
        // }
    }
    else       
    {
        // 0(3) 1(5) 2(4) 3(22) 4(12)  
        // index = 3
        // itr = 2; temp = 1 // itr = 1; temp = 2 // itr =  
        temp = head;
        int itr = index-1;
        while (itr > 0)
        {
            temp = temp->next;
            itr--;
        }
        struct Node* temp2 = temp->next;
        temp->next = temp->next->next;
        free(temp2);
        return head;
    }
}

// Reversing a LL by iterative approach 
struct Node* ReverseIterative(struct Node* head)
{
    // 3-> 14 -> 11 -> 9 -> 7 
    struct Node* previous = NULL;
    struct Node* current = head;
    struct Node* next = head ->next;

    while (current!=NULL && next!=NULL)
    {
        current->next = previous;
        previous = current;
        current = next;
        next = next->next;
        
        // current->next = previous;
        // previous = current;
        // current  = next;
        // next     = current->next;
        // current->next = previous;
    }
    current->next = previous;

    return current;
}

struct  Node* ReverseRecursive(struct Node* head)
{
    if(head->next == NULL)
        return head;
    
    struct Node* second = ReverseRecursive(head->next);
    
    //second->next = head;
    head->next->next = head;
    head->next = NULL;
    return second;

}

int main()
{
    struct Node* head = NULL;
    // for(int i = 0; i<6; i++)
    // {
    //     int val, index;
    //     printf("Enter Element to be inserted in LinkedList \n");
    //     scanf("%d", &val);
    //     printf("Enter Index at which new node to be inserted\n");
    //     scanf("%d",&index);
    //     head = Insert_(head, val,index);
    //     print(head);
    // }
    head = Insert_(head, 3,0);
    head = Insert_(head, 5,0);
    head = Insert_(head, 32,0);
    head = Insert_(head, 11,0);
    head = Insert_(head, 6,0);
    head = Insert_(head, 16,2);
    head = Insert_(head, 9,2);

    print(head);

    // for(int i = 0 ; i<1; i++)
    // {
    //     printf("Enter the index which needs to be deleted \n");
    //     int index;
    //     scanf("%d", &index);
    //     head = Delete(head, index);
    //     print(head);
    // }

    printf("Print in reverse ITerative\n");
    head = ReverseIterative(head);
    print(head);
    printf("Print in reverse Recursive\n");
    head = ReverseRecursive(head);
    print(head);
    return 0;
}