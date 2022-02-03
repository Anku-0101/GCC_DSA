#include<stdio.h>

/*
(a*b)%M = ((a%M)*(b%M))%M
*/

// finds (x^n)%M
int Mod(int x, int n, int M)
{
    if(n == 1)
        return x%M;
    
    if(n%2 == 0)
    {
        int res = Mod(x,n/2,M);
        return (res*res)%M;
    }
    else
        return ((x%M)*(Mod(x,n-1,M)%M))%M;
}

int main()
{
    int x,n,M;
    printf("Enter vaues of  x, n and M\n");
    scanf("%d%d%d", &x,&n,&M);

    int ans = Mod(x,n,M);

    printf("(%d^%d)%%%d = %d\n",x,n,M,ans);
}