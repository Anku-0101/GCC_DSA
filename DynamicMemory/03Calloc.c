#include<stdio.h>
#include<stdlib.h>

/*
    calloc() function
    calloc stands for continuous allocation. It takes 2 argument, 1st is number of elements 
    and 2nd is size of data type
    It initializes each memory block with a default value of 0
    If the space is not sufficient, memory allocation fails and a NULL pointer is returned.

    Syntax:
    ptr = (float*)calloc(30, sizeof(float));
*/
int main()
{
    int *ptr;
    
    printf("The size of int in this machine is %d\n", sizeof(int));
    
    int n;
    printf("How many integer do you want to store \n");
    scanf("%d", &n);
    ptr = (int *)calloc(n , sizeof(int)); // use 'sizeof' operator as different architecture has different size for int
    
    // for(int i = 0; i<n; i++)
    // {
    //     printf("Enter the value of number %d element \n", i+1);
    //     scanf("%d", &ptr[i]);
    // }

    for(int i = 0; i<n; i++)
    {
        printf("Element at index %d is %d \n", i, ptr[i]);
    }


    return 0;
}