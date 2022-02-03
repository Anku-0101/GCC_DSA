#include<stdio.h>

/*
    Recursion is a very powerful programming concept,
    When we can write function in a simpler form of itself, we call such a function as Recursive function


*/

// Works as a normal stack function call in memory

/*
        ||APPLICATION MEMORY||

        HEAP                    --> Free memory : dynamic   

        STACK                   --> Function call, local variable

        STATIC/GLOBAL VARIABLE  --> GLOBAL / STATIC VARIABLE

        CODE                    --> Instructions

*/
int factorial(int n)
{
    if(n == 0)
        return 1;
    
    else
        return n*factorial(n-1);
}

// DEMO of how memory is allocated in stack, one over other depending on occurance
int FACTORIAL(int n)
{
    printf("Calculating factorial F(%d) \n", n);
    if(n==0)
        return 1;
    
    int F = n*FACTORIAL(n-1);

    printf("Factorial computed for f(%d) = %d \n",n,F);
    return F;
    

}

int main()
{
    FACTORIAL(5);
    return 0;
}