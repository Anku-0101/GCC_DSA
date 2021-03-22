#include<stdio.h>

long long int arr[100001];
void calculate()
{
    long long int res = 0;
    for(int i = 1; i <=1000000; i++)
    {
        if(i % 2 == 0)res += i;
        else res += -1*i;
        arr[i] = res;
    }
}
    

long long int function(long long int n)
{
    if(n == 1) return -1;
    if(n %2 == 0) return n + function(n-1);
    else return -1*n + function(n-1);
    
}

int main()
{
    long long int n;
    scanf("%lld", &n);
    //calculate();
    // long long int res = function(n);
    

    
    if(n%2 == 0)    printf("%lld", n/2);
    
    else            printf("%lld", -1*(n/2 + 1));
    
    return 0;
}