#include<stdio.h>

int main()
{
    int n;
    scanf("%d",&n);
    int res = 0;
    int num, maxNum, minNum;
    scanf("%d",&num);
    maxNum = num;
    minNum = num;
    while(n>1)
    {
        scanf("%d",&num);
        if(num > maxNum)
        {
            maxNum = num;
            res++;
        }
        if(num < minNum)
        {
            minNum = num;
            res++;
        }
        n--;
    }
    printf("%d",res);
    return 0;
}