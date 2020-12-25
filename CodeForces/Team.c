#include<stdio.h>

int main()
{
    int cases;
    scanf("%d", &cases);
    int res  = 0;

    while (cases > 0)
    {
        int a, b, c;
        scanf("%d %d %d", &a, &b, &c);
        
        if(a == 1 && b == 1) res++;
        else if(b == 1 && c == 1) res++;
        else if(c == 1 && a == 1) res++;
        cases --;
    }
    printf("%d", res);
}