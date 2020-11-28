/*
Passing arrays to functions:
Arrays can be passed to the function like this:
    printArray(arr, n); //Function call

    void printArray(int *ptr, int n); => function prototype
    void printArray(int ptr[], int n); => function prototype

    // Learn more : https://www.geeksforgeeks.org/multidimensional-pointer-arithmetic-in-cc/
    https://www.geeksforgeeks.org/pass-2d-array-parameter-c/
*/
#include<stdio.h>

void PrintArray_ptr(int *ptr, int n)
{
    for(int i = 0 ; i < n; i++)
    {
        printf("The value of element %d is %d \n", i+1, *(ptr+i)); 
        //*(ptr + i) is a very basic derefrencing, 
        
    }
}

void PrintArray_arr(int ptr[], int n)
{
    for(int i = 0 ; i < n; i++)
    {
        printf("The value of element %d is %d \n", i+1, ptr[i]); // can also be written as *(ptr+i)
    }
}

int main()
{
    int arr[] = {1, 2, 47, 78, 98, 10, 5, 6};
    PrintArray_ptr(arr, 8); //Here we are passing array by reference (passing arr) so value of array
    //will be changed if we make any changes
    PrintArray_arr(arr, 8);

    return 0;
}