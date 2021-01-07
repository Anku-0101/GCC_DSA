#include<stdio.h>
#include<stdlib.h>

int main()
{
    int a; //goes to stack
    int *p;
    p = new int;
    *p = 10;
    delete p;

    p = new int[20];
    delete[] p;
}