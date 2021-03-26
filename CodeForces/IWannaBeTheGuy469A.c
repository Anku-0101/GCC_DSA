#include<stdio.h>

int main()
{
    int n;
    scanf("%d",&n);
    int arr[n+1];
    for(int i =0; i<=n; i++)arr[i] = 0;
    
    int p;
    scanf("%d",&p);
    int x[p];
    for(int i =0; i<p; i++)
    {
        scanf("%d",&x[i]);
        arr[x[i]]++;
    }
    
    int q;
    scanf("%d",&q);
    int y[q];
    for(int i=0; i<q; i++)
    {
        scanf("%d",&y[i]);
        arr[y[i]]++;
    }

    int flag  =0;
    for(int i =1; i<=n; i++)
    {
        if(arr[i] == 0)
        {
            printf("Oh, my keyboard!");
            flag=1;
            break;
        }
    }
    if(flag == 0) printf("I become the guy.");
    

    return 0;
}