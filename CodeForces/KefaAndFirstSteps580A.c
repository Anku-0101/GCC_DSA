#include<stdio.h>

int main()
{
    int n;
    scanf("%d", &n);
    int arr[n];

    for(int i =0; i<n; i++)scanf("%d", &arr[i]);

    int res = 1, maxResult = -1;

    for(int i = 1; i<n; i++)
    {
        if(arr[i-1] <= arr[i])res++;
        else res = 1;
        
        if(res > maxResult) maxResult = res;
    }

    maxResult==-1 ? printf("1") : printf("%d", maxResult);
    return 0;
}
/*
2 2 9 
i = 1
res = 2 maxres =2
i = 2
res = 
*/