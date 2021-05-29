#include<stdio.h>
int count = 0;

int Fib(int n)
{
    if(n < 2) return n;
    if(n == 2) count++;
    return Fib(n-1) + Fib(n-2);
}

int main()
{
    int n;
    scanf("%d",&n);
    int res = Fib(n);
    printf("Result is %d\n", res);
    printf("Count is %d\n", count);
    return 0;
}