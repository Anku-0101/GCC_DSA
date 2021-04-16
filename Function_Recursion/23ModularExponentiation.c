#include<stdio.h>

/*
    Program to compute : (x^n % M)
*/

int ModularExponentiation(int x, int n,int M)
{
    if(n == 0) return 1;
    if(n%2 == 0)
    {
        int y = ModularExponentiation(x, n/2, M);
        return (y*y)%M;
    }
    else
    {
        return ((x % M)*(ModularExponentiation(x,n-1,M)))%M;
    }
}
int main()
{
    int x,n,M;
    scanf("%d%d%d", &x, &n, &M);
    int res = ModularExponentiation(x,n,M);
    printf("%d",res);
    return 0;
}