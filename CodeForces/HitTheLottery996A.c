#include<stdio.h>

int main()
{
    int n;
    scanf("%d",&n);

    int res  = 0;
    
    
        if(n>99)
        {
            res += n/100;
            n = n%100;
        }

        if(n>19)
        {
            res += n/20;
            n = n%20;
        }

        if(n>9)
        {
            res += n/10;
            n = n%10;
        }

        if(n>4)
        {
            res += n/5;
            n = n%5;
        }

        if(n>0)
        {
            res += n;
        }
    
    printf("%d", res);
    return 0;
}