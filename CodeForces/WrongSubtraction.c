#include<stdio.h>

int main()
{
    int n, k;
    scanf("%d%d",&n, &k);

    while(k>0)
    {
        if(n%10 == 0) n = n/10;
        else n = n - 1;
        k --;
    }

    printf("%d",n);
    return 0;
}