/*
Recursion :
A function which calls itself, a function calling itself is also called 'recursive function'.

Example : factorial(n) = 1 X 2 X 3 X .......... X n
          factorial(n) = n X factorial(n-1)
*/

#include<stdio.h>

int factorial(int x);
int fibonachi(int x);

int main()
{
    int num;
    printf("Enter the number for factorial \n");
    scanf("%d", &num);
    printf("The value of factorial %d is %d \n", num, factorial(num));

    int num1;
    printf("Enter the nth term of Fibonacci Sequence \n");
    scanf("%d", &num1);
    printf("The %d th term of Fibonacci Sequence is %d", num1, fibonachi(num1));
    return 0;
}

int factorial(int x)
{
    if(x == 0 || x == 1)
    {
        return 1;
    }
    else return (x)*factorial(x-1);
}

// f(n) = f(n-1) + f(n-2)
int fibonachi(int n)
{
    if(n == 1)
    {
        return 0;
    }

    if(n == 2)
    {
        return 1;
    }
    else 
    {
        return (fibonachi(n-1) + fibonachi(n-2));
    }
}

/*
Important Notes:
1. Recursion is sometimes the most direct way to code an algorithm
2. The condition which doesn't call the function any further in a recursive function is
    called as the base condition.
3. Sometimes due to a mistake a recursive function can keep running without returning 
    resulting in a memory error
*/