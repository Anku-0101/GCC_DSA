#include<stdio.h>

int main()
{
    int n;
    scanf("%d", &n);
    int arr[n];
    
    for(int i=0; i<n; i++) scanf("%d", &arr[i]);
    int res[n];

    for(int i =0; i<n; i++)
    {
        res[arr[i]-1] = i+1;
    }

    for(int i = 0; i < n ; i++)
    {
        printf("%d ", res[i]);
    }
    
    return 0;
}