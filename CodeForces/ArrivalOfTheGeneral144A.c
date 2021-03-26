#include<stdio.h>

int main()
{
    int n;
    scanf("%d",&n);
    int arr[n];
    
    int maxHeight = -1, maxHeightIndex;
    int minHeight = 200, minHeightIndex = -1;

    for(int i =0; i<n; i++)
    {
        scanf("%d",&arr[i]);

        if(arr[i] > maxHeight)
        {
            maxHeight = arr[i];
            maxHeightIndex = i;
        }

        if(arr[i] <= minHeight && minHeightIndex < i)
        {
            minHeight = arr[i];
            minHeightIndex = i;
        }
    }
    // printf("maxHeight = %d \n", maxHeight);
    // printf("maxHeightIndex = %d \n", maxHeightIndex);
    // printf("minHeight = %d \n", minHeight);
    // printf("minHeightIndex = %d \n", minHeightIndex);

    int res;
    res = maxHeightIndex+n - minHeightIndex-1;
    if(maxHeightIndex > minHeightIndex)printf("%d", res-1);
    else printf("%d",res);
    return 0;
}