#include<stdio.h>
/*
Program to compute x^n
*/

int Power(int x, int n)
{
    if(n == 0) return 1;
    if(n == 1) return x;
    return x*Power(x,n-1);    
}
// Efficient Solution
int PowerF(int x, int n)
{
    if(n == 0)return 1;
    if(n%2 == 0)
    {
        int y = PowerF(x,n/2);
        return y*y;
    }
    else    return x*PowerF(x,n-1);
    
}
int main()
{
    int x,n;
    scanf("%d%d",&x,&n);
    int res  = Power(x,n);
    int res1 = PowerF(x,n);
    printf("%d\n",res);
    printf("%d\n",res1);
    return 0;
}