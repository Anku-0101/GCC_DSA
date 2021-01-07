#include<stdio.h>
#include<stdlib.h>

/*
            Applications' Memory

        
        HEAP             --> Free pool of memory or free store of memory or dynamic memory [Not to be confused with heap data structure, both are different]


        STACK            --> Function calls / local variable [Works same as stack data structure]


        Static/Global    --> Global 


        Code (Text)      --> Instructions

*/
int main()
{
    /*
        Functions for dynamic memory allocation in C
            malloc
            calloc
            realloc
            free
        
        in c++
          Along with the above functions (As c++ is backward compatible)
          new
          delete
    */

   int a; //goes to stack
   int *p;
   p = (int *)malloc(sizeof(int));  // Allocates memory for 1 integer on heap

    free(p); //Should reclaim the heap memory once the use is over

   int b = 10;
   int *ptr1;
   int *ptr2;

   ptr1 = &b;
   ptr2 = ptr1;

   printf("%d\n", ptr2);
   printf("%d\n", &ptr2);
   printf("%d\n", *ptr2);

   printf("%d\n", ptr1);
   printf("%d\n", &ptr1);
   printf("%d\n", *ptr1);

   int *arr;
   arr = (int*)malloc(20*sizeof(int)); //Allocates 20X4 bytes of memory on heap for arr


    return 0;
}