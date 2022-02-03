#include<stdio.h>

// Example to demonstrate why Recursion is not always good way to solve a problem
// 1. Computing same function multiple times
// 

int F_2TIME = 0; // To calculate how many times Fib(2) is computed in recursion 

// Recursive approach , it'll form a recursive tree
int Fibonacci(int n)
{
    if(n == 2)
        F_2TIME++;  
    if(n==0 || n==1)
        return n;
    
    return Fibonacci(n-1) + Fibonacci(n-2);
}

// Recursive Implementation 
int FIBONACCI(int n)
{
    if( n <= 1)
        return n;
        
    int f1 = 0;
    int f2 = 1;
    int f;
    for(int i = 2; i<=n; i++)
    {
        f = f1+f2;
        f1 = f2;
        f2 = f;
    }

    return f;
}
int main()
{
    printf("Enter n \n");
    int n;
    scanf("%d", &n);

    printf("By Iterative approach Fib(%d) = %d\n", n, FIBONACCI(n));
    
    printf("By Recursive approach Fib(%d) = %d\n", n, Fibonacci(n));
    printf("number of times Fib(2) is computed = %d\n", F_2TIME);
}