#include<stdio.h>

int main()
{
    int n;
    scanf("%d", &n);

    int p, q, ans = 0;
    while (n--)
    {
        scanf("%d%d", &p, &q);
        if(q-p > 1)ans++;
    }
    
    printf("%d", ans);
    return 0;
}