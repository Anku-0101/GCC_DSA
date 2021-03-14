#include<stdio.h>

int main()
{
    int  x;
    scanf("%d", &x);

    int a, b, res=0,ans =0;
    
    while(x-- > 0)
    {
        scanf("%d%d", &a, &b);
        ans = ans + b - a;
        if(ans > res) res = ans;
        //printf("%d\n",res);
    }
    printf("%d", res);
    return 0;
}