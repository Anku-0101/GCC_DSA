#include<stdio.h>

int arr[50] ={0};

int Fib(int n)
{
    if(n <= 1)
        return n;
    
    if(arr[n] != 0)
        return arr[n];
    
    int F = Fib(n-1) + Fib(n-2);
    arr[n] = F;
    return arr[n];
    
}

int main()
{
    arr[1] = 1;
    int n;
    printf("Enter n \n");
    scanf("%d", &n);
    printf("Value of Fib(%d) = %d \n",n,Fib(n));
    return 0;
}