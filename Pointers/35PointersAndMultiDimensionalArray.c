#include<stdio.h>

/*
    Example:
    int A[5]
    A[0], A[1] .. are int
    

    int B[2][3]
    B[0], B[1] are 1-D array of three integers ; B[0] and B[1] both will be 12 bytes, considering 
    integres to be 4 bytes each  
    
*/
int main()
{
    int B[2][3] = {5, 7, 6, 3, 9, 1};
    
    /*
    Can also be initialized as 
    int  B[2][3]  = {{5, 7, 6},
                     {3, 9, 1}};
    */

    // int *p = B; // This will return an compilation error as B now returns an pointer to one dimensional array comprising of 3 integers
    int *p = (int *)B;  // Typecasting to get the base address of array B
    int (*ptr)[3] = B;  // Correct syntax to point 2D array B having 2 1D array of 3 integers

    // B or &B[0] returns base address of 2D array of type 1D array i.e int*[3]
    // &B returns base address of 2D array of type 2D array i.e int*[2][3]
    printf("B = %d   &B[0] = %d      &B = %d   \n", B, &B[0], &B);
    int (*ptr1)[3] = &B[0];
    int (*ptr6)[2][3] = &B;
    
    // *B, B[0] and &B[0][0] returns base address 2D array  of type int*
    printf("*B = %d   B[0] = %d      &B[0][0] = %d   \n", *B, B[0], &B[0][0]);
    int *ptr2 = *B;
    
    // B+1 or &B[1] returns base address of 2nd 1D array in B[2][3] of type int*[3]
    printf("B+1 = %d      &B[1] = %d  \n", B+1, &B[1]);
    int (*ptr3)[3] = B+1;

    // *(B+1) or B[1] or &B[1][0] returns base address of 2nd 1D array in B[2][3] of type int*
    printf("*(B+1) = %d    B[1] = %d  &B[1][0]\n", *(B+1), B[1], &B[1][0]);
    int *ptr4 = &B[1][0];
    
    printf("*(B+1) + 2 = %d    B[1] + 2 = %d   &B[1][2] = %d \n", *(B+1)+2, B[1] + 2, &B[1][2]);
    
    // B -> int* [3]
    // *B -> B[0] -> int*
    // *B + 1 -> &B[0][1] -> address of next element
    // *(*B +1) -> B[0][1]
    printf("*(*B+1) = %d \n", *(*B+1));
    
    /*
        B[i][j] = *(B[i] + j)
                = *(*(B+i) +j)
    */ 





    // Little Detour to 1D array to clarify the concepts
    int arr[4] = {9, 8, 0, 7};
    printf("arr = %d , *arr = %d , &arr = %d, &arr[0] = %d , arr[0] = %d", arr, *arr, &arr, &arr[0], arr[0]);

    int *pointer1  = &arr[0]; // valid
    //int *pointer2  = &arr; // Invalid as &arr returns base address of arr of type int*[4]
    int (*pointer3)[4]  = &arr; 
    return 0;
}