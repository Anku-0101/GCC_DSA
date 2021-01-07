#include<stdio.h>

/*
    &    : Refrencing 
    *    : Derefrencing
    []   : Derefrencing
    &[]  : Refrencing []
*/
void Func1(int *A) // Argument : 1-D array of integers can also be written as A[]
{

}

void Func2(int (*A)[3]) // Argument : 1-D array of integers can also be written as A[][3]
{

}

void Func3(int (*A)[2][2]) // Argument : 1-D array of integers can also be written as (*A)[2][2]
{

}
int main()
{   
    int c[3][2][2] = {{{2, 5}, {7, 9}},
                      {{3, 0}, {-5, 4}},
                      {{11, 14}, {8, 1}}};  

    /*
        c and &c[0]                      -> return base address of 3D dimensional array of type int*[2][2]
        *c and c[0] and &c[0][0]         -> return base address of 3D dimensional array of type int*[2]
        **c and c[0][0] and &c[0][0][0]  -> return base address of 3D dimensional array of type int*

    */

   printf("c = %d  , *c = %d  , c[0] = %d  , &c[0][0] = %d \n", c, *c, c[0], &c[0][0]);
   printf("*(c[0][0]+1) = %d \n", *(c[0][0]+1));

   // Passing Arrays to a function
   int A[] = {1,2};
   Func1(A);
   
   int  B[2][3]  = {{5, 7, 6},
                     {3, 9, 1}};
   Func2(B);
   Func3(c);
   return 0;
}