#include<stdio.h>
int arr[101];

int Fib(int n)
{
    if(n<2)return n;
    else if(arr[n] !=0 ) return arr[n];
    else
    {
        arr[n] = Fib(n-1) + Fib(n-2);
        return arr[n];
    }
}

int main()
{
    int n;
    scanf("%d", &n);
    
    for(int i = 0; i<101; i++)arr[i] = 0;
    int res = Fib(n);
    printf("%d", res);
    return 0;
}