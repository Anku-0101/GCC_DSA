#include<stdio.h>

int main()
{
    int t;
    scanf("%d",&t);
    int a,b;

    while(t--)
    {
        scanf("%d %d",&a,&b);
        if(t >= 1)
        {
            if(a%b == 0)printf("0\n");
            else 
            {
                printf("%d\n",b - a%b);
            }
        }
        else
        {
            if(a%b == 0)printf("0");
            else 
            {
                printf("%d",b - a%b);
            }
        }  
    }
    return 0;
}