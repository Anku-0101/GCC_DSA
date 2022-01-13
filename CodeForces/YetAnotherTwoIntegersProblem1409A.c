#include<stdio.h>

int main()
{
    int t;
    scanf("%d", &t);

    while (t--)
    {
        int a,b;
        scanf("%d%d",&a,&b);
        
        int diff = a - b;
        
        if(diff < 0)
            diff *= -1;
        
        if(diff%10 == 0)
            printf("%d\n",diff/10);
        else
            printf("%d\n", diff/10 +1);
    }
    
    return 0;
}