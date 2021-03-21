#include<stdio.h>

/*
n=7 1 3 5 7 2 4 6
Tn = 1 + (m-1)2

n=6 1 3 5 2 4 6
Tn = 2 + (m-1)2
*/
int main()
{
    long long int n,k, res;
    scanf("%lld", &n);
    scanf("%lld", &k);

    if(n%2 == 0)
    {
        if(k <= n/2)    res = 1 + (k-1)*2;
        else            res = 2 + (k- n/2 -1)*2; 
    }
    else
    {
        if(k <= n/2+1)    res = 1 + (k-1)*2;
        else              res = 2 + (k - n/2 -2)*2; 
        
    }
    printf("%lld", res);
    return 0;
}