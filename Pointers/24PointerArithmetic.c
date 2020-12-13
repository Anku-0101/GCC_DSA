/*
Pointer Arithmetic
A pointer can be incremented to point to the next memory location of that type.

Example:
int i  = 32;
int *a = &i; => here a = 87994 , address of i
a++; or  a = a + 1        => now  a = 87998 , or next memory location

Following Operations can be performed on pointers:
1. Addition of 
*/
#include<stdio.h>

int main()
{
    int a = 45;
    int *ptr_old  = &a;
    int *ptr = &a;
    printf("The value of ptr is %u\n", ptr);
    ptr++;
    printf("The value of ptr is %u\n", ptr);
    ptr = ptr + 1;
    printf("The value of ptr is %u\n", ptr);
    ptr--;
    printf("The value of ptr is %u\n", ptr);
    ptr = ptr + 4;
    printf("The value of ptr is %u\n", ptr);
    ptr = ptr - 3;
    printf("The value of ptr is %u\n", ptr);

    char ch = 'q';
    char *ch_ptr;
    ch_ptr = &ch;
    printf("The value of char ptr is %u\n", ch_ptr);
    ch_ptr++;
    printf("The value of char ptr is %u\n", ch_ptr);
    int val  = ptr - ptr_old;
    printf("The value of ptr - ch_ptr is = %d", val);
    return 0;
}

