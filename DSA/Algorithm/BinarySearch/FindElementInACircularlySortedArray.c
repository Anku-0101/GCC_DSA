#include<stdio.h>

int BinarySearch(int arr[], int n, int x, int start, int end)
{
    while(start <= end)
    {
        int mid = start + (end-start)/2;

        if(arr[mid] == x) return mid;
        else if(arr[mid] > x)end = mid -1;
        else start = mid +1;
    }
    return -1;
}

int FindPivotElementInCircularlySortedArray(int arr[], int n)
{
    int start = 0; 
    int end = n-1;
    int result;

    while(start<=end)
    {
        int mid = start + (end-start)/2;
        
        if(arr[start] <= arr[end]) return start; //Case 1
        
        int next = (mid+1)%n;
        int previous = (mid-1+n)%n;
        if((arr[mid] <= arr[previous]) && (arr[mid] <= arr[next])) //Case 2
        {
            return mid;
        }
        
        else if(arr[mid] >= arr[start])start = mid+1;  //Case 3
        else if(arr[mid] <= arr[start]) end = mid -1; //Case 4
    }
    return -1;
}
int main()
{
    int arr[] = {12,13,14,15,16,17,18,2,3,4,5,6,7,8,9,10,11};
    printf("Enter the element to searh \n");
    int x; scanf("%d",&x);
    int n = sizeof(arr)/sizeof(arr[0]);
    int pivotIndex = FindPivotElementInCircularlySortedArray(arr,n);
    
    if(pivotIndex == -1)
    {   
        printf("Array is not circularly sorted \n", x);
        return 0;
    }
    if(arr[pivotIndex] == x)
    {
        printf("Number %d is found at index %d \n", x, pivotIndex);
        return 0;
    } 
    else if(BinarySearch(arr,n,x,0,pivotIndex-1) != -1) 
    {
        int result = BinarySearch(arr,n,x,0,pivotIndex-1);
        
        printf("Number %d is found at index %d \n", x, result);
        return 0;
    }
    else if(BinarySearch(arr,n,x,pivotIndex+1,n-1) != -1)
    {
        int result = BinarySearch(arr,n,x,pivotIndex+1,n-1);
        
        printf("Number %d is found at index %d \n", x, result);
        return 0;
    }
    return 0;
}