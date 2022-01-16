#include<stdio.h>

int main()
{
    int k,r;
    scanf("%d%d",&k,&r);

    int flag = 1;
    for(int i = 1; i<10; i++)
    {
        int t = k*i;
        if(t%10 == r || t%10 == 0)
        {
            flag=0;
            printf("%d", i);
            break;
        }
    }

    if(flag == 1)
    {
        printf("10");
    }
    return 0;
}