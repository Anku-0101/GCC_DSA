#include<stdio.h>
/*
n'+r-1Cr-1
n' = n-2 [can't be 0]
n'+1C1 = n'+1 = n-2+1 = n-1
ANS = n-1/2

*/
int main()
{
    int t,n;
    scanf("%d",&t);
    
    while (t--)
    {
        scanf("%d",&n);
        if(n<3)
        {
            if(t!=0)printf("0\n");
            else printf("0");
        }
        else
        {
            if(t!=0)printf("%d\n",(n-1)/2);
            else printf("%d",(n-1)/2);
        }
    }
    
    return 0;
}