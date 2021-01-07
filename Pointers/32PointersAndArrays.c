#include<stdio.h>
/*
            A[n] --> Array of size n
        
        Address  -> &A[i]       or      (A + i)
        Value    -> A[i]        or     *(A + i)

*/
int main()
{
    int A[] = {2, 4, 5, 8, 1};

    for(int i = 0; i < 5; i++)
    {
        printf("Address  = %d \n", &A[i]);
        printf("Address  = %d \n", A + i);
        printf("Value = %d \n", A[i]);
        printf("Value = %d \n", *(A+i));
    }
    return 0;
}