#include<stdio.h>

int main()
{
    int  n; 
    printf("Enter the number of students \n");
    scanf("%d", &n);

    int marks[n];
    int *ptr;
    ptr = &marks[0]; // Equivalent to : ptr = marks ; as name of the array is the 
                     // pointer to the first element of the array
                    

    for(int i = 0 ; i < n ; i++)
    {
        printf("Enter the mark of %d student \n", i+1);
        scanf("%d", ptr);
        ptr ++;
    }

    for(int i = 0 ; i<n ; i++)
    {
        printf("Marks of %d student = %d \n", i+1, marks[i]);
    }
    
    return 0;
}