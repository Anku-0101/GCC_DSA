#include<stdio.h>

int main()
{
    int n; 
    scanf("%d", &n);
    int t = n;
    int CurrentPolarity, LastPolarity;
    int groups = 0;
    while (t > 0)
    {
        scanf("%d", &CurrentPolarity);
        
        if(t == n)
        {
            groups++;
            LastPolarity = CurrentPolarity;
        }
        
        if(LastPolarity != CurrentPolarity) groups++;

        LastPolarity = CurrentPolarity;
        t--;
    }
    printf("%d", groups);
    return 0;
}