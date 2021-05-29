/*
The point to note is that realloc() 
should only be used for dynamically allocated memory. 
If the memory is not dynamically allocated, then behavior is undefined.
For example, program 1 demonstrates incorrect use of 
realloc() and program 2 demonstrates correct use of realloc().
*/



/*
The below code will give an error
#include <stdio.h>
#include <stdlib.h>
int main()
{
   int arr[2], i;
   int *ptr = arr;
   int *ptr_new;
     
   arr[0] = 10; 
   arr[1] = 20;      
     
   // incorrect use of new_ptr: undefined behaviour
   ptr_new = (int *)realloc(ptr, sizeof(int)*3);
   *(ptr_new + 2) = 30;
     
   for(i = 0; i < 3; i++)
     printf("%d ", *(ptr_new + i));
  
  
   return 0;
}
*/


#include <stdio.h>
#include <stdlib.h>
int main()
{
   int *ptr = (int *)malloc(sizeof(int)*2);
   int i;
   int *ptr_new;
     
   *ptr = 10; 
   *(ptr + 1) = 20;
     
   ptr_new = (int *)realloc(ptr, sizeof(int)*3);
   *(ptr_new + 2) = 30;
   for(i = 0; i < 3; i++)
       printf("%d ", *(ptr_new + i));
  
   
   return 0;
}