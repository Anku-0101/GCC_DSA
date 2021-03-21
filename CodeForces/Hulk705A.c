#include<stdio.h>

int main()
{
    int n;
    scanf("%d", &n);
    int k = n;

    int first = 1;
    while(k > 1)
    {
        if(k>1) printf("I hate that ");
        k--;
        if(k>1)printf("I love that ");
        k--;
    }
    if(n%2 != 0)printf("I hate it");
    else printf("I love it");
    
    return 0;
}