#include<stdio.h>

int main()
{
    int a,b,c,d;
    scanf("%d%d%d%d",&a,&b,&c,&d);
    int arr[4];
    arr[0] = a;
    arr[1] = b;
    arr[2] = c;
    arr[3] = d;
    int res =1;

    for(int i =1; i<4; i++)
    {
        int j = 0;
        for(j = 0; j<i; j++)
        {
            if(arr[i] == arr[j]) break;
        }
        if(i == j)res++;
    }

    printf("%d",4-res);
    return 0;
}