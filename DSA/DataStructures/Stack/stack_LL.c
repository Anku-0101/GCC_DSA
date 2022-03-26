#include<stdio.h>
#include<stdlib.h>

struct Node{
    int data; 
    struct Node* next;
};

struct Node* head = NULL;

void push(int x){
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    
    newNode->data = x;
    newNode->next = head;
    head = newNode;
}

void pop(){
    if(head == NULL){
        printf("Stack is empty \n");
        return;
    }

    struct Node* temp = head->next;
    free(head);
    head=temp;
}

int Top()
{
    return head->data;
}
void print(){
    struct Node* temp = head;
    
    while(temp != NULL){
        printf("%d ",temp->data);
        temp = temp->next;
    }
    printf("\n");
}

int main(){
    push(4); print();
    printf("Top = %d \n", Top());
    push(1); print();
    printf("Top = %d \n", Top());
    push(0); print();
    printf("Top = %d \n", Top());
    pop(); print();
    printf("Top = %d \n", Top());
    push(11); print();
    printf("Top = %d \n", Top());
    push(21); print();
    printf("Top = %d \n", Top());
    pop(); print();
    printf("Top = %d \n", Top());
    return 0;
}
