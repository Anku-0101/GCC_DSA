#include<stdio.h>
#include<stdlib.h>

/*
    malloc stands for memory allocation. It takes number of bytes as an input and 
    returns a pointer of type void. So type casting is required to get the desired type
    
    If malloc fails to allocate the memory it returns a null pointer

    Syntax: [Example to allocate memory for int data type]
    ptr = (int*) malloc (30*sizeof(int))
*/
int main()
{
    int *ptr;
    
    printf("The size of int in this machine is %d\n", sizeof(int));
    ptr = (int *)malloc(6*sizeof(int)); // use 'sizeof' operator as different architecture has different size for int
    
    for(int i = 0; i<6; i++)
    {
        printf("Enter the value of number %d element \n", i+1);
        scanf("%d", &ptr[i]);
    }

    for(int i = 0; i<6; i++)
    {
        printf("Element at index %d is %d \n", i, ptr[i]);
    }


    return 0;
}