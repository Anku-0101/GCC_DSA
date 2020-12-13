#include<stdio.h>

int main()
{
    int i = 100;
    int* ptr;
    ptr = &i;
    printf("i = %d\n", i);
    printf("&i = %d\n", &i);
    printf("ptr = %d\n", ptr);
    printf("&ptr = %d\n", &ptr);
    printf("*ptr = %d\n", *ptr);
    printf("*(&i) = %d\n", *(&i));
    printf("*(&i) = %d\n", *(&i));
    printf("&(*ptr) = %d\n", &(*ptr));
    printf("*(&ptr) = %d\n", *(&ptr));
   // printf("*i = %d\n", *i); // SYNTAX ERROR, Can’t use unary operator with one value
    return -1;
}