#include<stdio.h>

//Array is passed as reference
// int *A or int A[] both are same
int SumOfElements(int A[], int size) 
{
    int sum = 0;

    // Here sizeof(A) will return 4 bytes as A here is a pointer reference containg the 
    // address of first element of Array A[5] i.e A[0]
    // int size_ = sizeof(A)/sizeof(A[0]);
    // printf("SOE - Size of A = %d, size of A[0] = %d \n", sizeof(A), sizeof(A[0]));

    for(int i = 0; i < size; i++)
    {
        sum = sum + A[i]; // A[i] can be replaced with *(A + i)
    }

    return sum;
}

int main()
{
    int A[] = {9, 3, 3, 4, 6};
    int size = sizeof(A)/sizeof(A[0]); // Here sizeof(A) will return 5*4 = 20 bytes as A is an array of 5 elements
    int total = SumOfElements(A, size); // A can be used for &A[0]
    printf("Sum of elements = %d \n", total);
    printf("Main - Size of A = %d, size of A[0] = %d \n", sizeof(A), sizeof(A[0]));
    return 0;
}