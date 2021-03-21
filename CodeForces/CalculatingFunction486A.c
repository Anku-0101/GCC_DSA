#include<stdio.h>

int arr[1001];
void calculate()
{
    long long int res = 0;
    for(int i = 1; i <=1000; i++)
    {
        if(i % 2 == 0)res += i;
        else res += -1*i;
        arr[i] = res;
    }
}
    

long long int function(long long int n)
{
    if(n<=1000) return arr[n];
    if(n %2 == 0) return function(n)- function(n-1);
    else return -1*function(n-1) + function(n);
    
}

int main()
{
    long long int n;
    scanf("%lld", &n);
    calculate();
    long long int res = function(n);
    
    
    printf("%lld", res);
    return 0;
}