#include<stdio.h>

int main()
{
    int n,m;
    scanf("%d%d",&n,&m);

    int flag = 1;
    while(m*n > 0)
    {
        m--;
        n--;
        flag *= -1;
    }

    if(flag < 0)printf("Akshat");
    else printf("Malvika");

    return 0;
}