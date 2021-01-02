#include<stdio.h>

int main()
{
    int k, n, w;
    scanf("%d%d%d", &k, &n, &w);

    int totalCost = 0;

    for(int i = 1; i <= w; i++)
    {
        totalCost = totalCost + k*i;
    }

    int res = totalCost - n;
    if(res <= 0) printf("0");
    else printf("%d", res);

    return 0;
}