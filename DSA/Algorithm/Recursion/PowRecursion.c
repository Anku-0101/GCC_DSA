#include<stdio.h>

int power(int x, int n)
{
    if(n == 1)
        return x;
    
    return x*power(x,n-1); 
}

int main()
{
    int x,n;
    scanf("%d%d", &x, &n);

    int res = power(x,n);
    printf("%d ^ %d = %d \n", x,n,res);

    return 0;
}