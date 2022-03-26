#include<stdio.h>

#define MAX_SIZE 101
int A[MAX_SIZE];
int top = -1;

void push(int x){
    if(top == MAX_SIZE-1){
        printf("Stack Overflow \n");
        return;
    }
    A[++top] = x;
}

void pop()
{
    if(top == -1){
        printf("Empty stack can't pop \n");
        return;
    }
    top--;
}

int Top()
{
    return A[top];
}

void print(){
    for(int i = 0; i <= top; i++)
        printf("%d ", A[i]);
    
    printf("\n");
}
int main(){
    push(3); print();
    push(2); print();
    push(8); print();
    pop(); print();
    push(13); print();
    push(0); print();
    pop(); print();
    return 0;
}