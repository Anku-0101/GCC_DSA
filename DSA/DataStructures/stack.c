#include<stdio.h>
#include<stdlib.h>

#define CAPAITY 6
int capacity = 5;
int stack[CAPAITY], top = -1;

void Push(int x);
int Pop();
int Peek();
int GetSize();
void Traverse();
int IsEmpty();
int IsFull();

int main()
{
    while (1)
    {
        printf("1. push element to stack \n");
        printf("2. pop element from stack \n");
        printf("3. Peek stack \n");
        printf("4. Number of elements in stack \n");
        printf("5. Traverse element of stack \n");
        printf("6. Quit \n");
        
        int ch,item;
        scanf("%d",&ch);
        switch (ch)
        {
        case 1: 
            printf("Enter Element to be pushed in stack \n");
            scanf("%d",&item);
            Push(item);
            break;
        
        case 2:
            item = Pop();
            printf("Popped element is %d \n",item);
            break;
        
        case 3:
            item = Peek();
            printf("Top element is %d \n",item);
            break;
        case 4:
            item = GetSize();
            printf("Number of elements present in the stack is %d \n", item);
            break;
        case 5:
            Traverse();
            break;
        case 6:
            exit(0);

        default:
            printf("Invalid input \n");
            break;
        }
    }
    return 0;
}

void Push(int x)
{
    if(IsFull())
    {
        printf("Stack is Full, can't push more elements \n");
    }
    else
    {
        stack[++top] = x;
        printf("Element %d pushed to the stack \n", x);
    }
    
}
int Pop()
{
    if(IsEmpty())
    {
        printf("Stack is empty thus returning -1 \n");
        return -1;
    }
    else
    {
        int x = stack[top];
        top--;
        return x;
    }
}
int Peek()
{
    if(IsEmpty())
    {
        printf("Stack is empty thus returning -1 \n");
        return -1;
    }
    else
    {
        return stack[top];
    }
}
int GetSize()
{
    return(top+1);
}
void Traverse()
{
    if(IsEmpty())
    {
        printf("Stack is empty \n");
    }
    else    
    {
        printf("Contents of the stack is/are \n");
        for(int i = top; i>-1; i--)printf("%d \n",stack[i]);
    }
}
int IsEmpty()
{
    if(top == -1)return 1;
    else return 0;
}
int IsFull()
{
    if(CAPAITY == top+1) return 1;
    else return 0;
}