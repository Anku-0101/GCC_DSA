#include<stdio.h>

int main()
{
    int n,h;
    scanf("%d%d", &n, &h);

    int arr[n];
    int res = 0;

    for(int i =0; i < n; i++)
    {
        scanf("%d", &arr[i]);
        
        if(arr[i] > h)res +=2;
        else res++;
    }
    printf("%d", res);
    return 0;
}