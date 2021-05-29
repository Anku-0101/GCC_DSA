#include<stdio.h>

// If flag == 0 return the min index
// If flag == 1 return the max index
int BinarySearchMinAndMaxIndices(int arr[], int n, int x, int flag)
{
    int start = 0;
    int end  = n-1;
    int result = -1;
    
    while(start <= end)
    {int 
        int mid = start + (end - start)/2;
        if(arr[mid] == x)
        {
            result = mid;
            if(flag == 0) end = mid -1;
            else start = mid + 1; 
        }
        else if(arr[mid] > x) end = mid -1;
        else start = mid +1;
    }
    return result;
}

int main()
{
    int arr[] = {1,1,1,1,2,2,3,4,5,5,5,5,6,6,11,11,11,23,33,33,33};
    printf("Enter element whose count is required \n");
    int x;
    scanf("%d",&x);
    //printf("%d\n", sizeof(arr)/sizeof(arr[0]));
    int minIndex = BinarySearchMinAndMaxIndices(arr,sizeof(arr)/sizeof(arr[0]),x,0);
    if(minIndex == -1) printf("%d is not present in array \n",x);
    else
    {
        int maxIndex = BinarySearchMinAndMaxIndices(arr,sizeof(arr)/sizeof(arr[0]),x,1);
        printf("The count of %d is %d \n", x, maxIndex-minIndex+1);
    }
}