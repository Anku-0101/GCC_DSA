#include<stdio.h>

void BubbleShort(int arr[], int n)
{
    for(int i=0; i<n-1; i++)
    {
        for(int j = 0; j<n-1-i; j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}

int main()
{
    int n, l;
    scanf("%d%d",&n,&l);
    int arr[n];
    for(int i =0; i<n; i++)scanf("%d",&arr[i]);

    BubbleShort(arr,n);
    //for(int i=0; i<n; i++)printf("%d  ",arr[i]);

    
    double max = 0.0000000000000;
    for(int i=0; i<n-1; i++)
    { 
        double maxm = (arr[i+1] - arr[i])/2.0000000000000;
        if(max < maxm) max = maxm;
    }

    double max1 = (double)arr[0];
    double max2 = (double)(l-arr[n-1]);
    double ans = max1>max2 ? max1 : max2;
    ans = max > ans ? max : ans;
    printf("%f", ans); 
    return 0;
}