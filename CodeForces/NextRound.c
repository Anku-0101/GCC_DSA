#include<stdio.h>

int main()
{
    int n, k ;
    scanf("%d %d", &n, &k);
    int arr[n];
    
    for(int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    int cutoff = arr[k-1];
    //printf("Cutoff is %d", cutoff);
    //if(cutoff == 0 && arr[n-1]== 0) printf("0");
    
    int res = 0;
    for (int i = 0; i < n; i++)
    {
        if(arr[i] >= cutoff && arr[i] > 0) res++;
    }
    printf("%d",res);    
    
    
    
    return 0;
}