#include<stdio.h>

int main()
{
    int n, k ;
    scanf("%d%d",&n,&k);
    int remTime = 240 - k;
    int ans = 0, itr = 1;
    
    while((remTime > -1) && (n>0))
    {
        if(n > 0)
        {
            remTime -= 5*itr;
            itr++;
            n--;
            if(remTime > -1)ans++;
        }
    }
    printf("%d",ans);
    return 0;
}