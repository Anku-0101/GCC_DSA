#include<stdio.h>
#include<stdlib.h>

/*
    We can use free() function to de allocate the memory.
    The memory allocated using calloc/malloc is not deallocated automatically
*/
int main()
{
    int *ptr;
    int *ptr2;
    
    printf("The size of int in this machine is %d\n", sizeof(int));
    
    int n;
    printf("How many integer do you want to store \n");
    scanf("%d", &n);
    ptr = (int*)calloc(n , sizeof(int)); // use 'sizeof' operator as different architecture has different size for int
    
    // for(int i = 0; i<n; i++)
    // {
    //     printf("Enter the value of number %d element \n", i+1);
    //     scanf("%d", &ptr[i]);
    // }

    for(int i = 0; i<n; i++)
    {
        ptr2 = (int*)malloc(500000*sizeof(int));
        printf("Enter the Element at index %d  \n", i);
        scanf("%d",&ptr[i]);
        free(ptr2); // Without freeing memory for ptr2 allocated above, after each iteration of 
        //the loop the memory consumption keeps on increasing 
    }

    

    return 0;
}