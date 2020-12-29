#include<stdio.h>
#include<stdlib.h>

/*
realloc() function :
Sometimes the dynamically allocated memory is insufficient or more than required or less than required

realloc is ised to allocate memory of new size using previous pointer and new size

syntax :
    ptr = realloc(ptr, NewSize);
*/
int main()
{
    int *ptr;
    ptr = (int*)malloc(5*sizeof(int));

    for(int i = 0 ; i< 5; i++)
    {
        printf("Enter the number %d \n", i+1);
        scanf("%d", &ptr[i]);
    }

    ptr = realloc(ptr, 10*sizeof(int));

    for(int i = 5; i<10; i++)
    {
        printf("Enter the number %d \n", i+1);
        scanf("%d", &ptr[i]);
    }

    for(int i = 0; i<10; i++)
    {
        printf("The number at %d  is = %d \n", i+1, ptr[i]);
    }

    return 0;
}