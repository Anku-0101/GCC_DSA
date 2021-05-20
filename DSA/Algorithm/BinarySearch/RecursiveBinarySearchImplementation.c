#include<stdio.h>

// Method to perform Searching of sorted array in ascending order
// arr[] array to perform search
// Start : Start index of the array
// End : End index of the array
// x : element needs to be searched
 
int BinarySearch(int arr[], int start, int end, int x)
{
    int mid = start + (end - start)/2;
    // printf("Start = %d \n", start);
    // printf("Mid = %d \n", mid);
    // printf("End = %d \n", end);

    if(arr[mid] == x) return mid;
    if(start >= end) return -1;
    else if(x < arr[mid]) return BinarySearch(arr,start, mid-1, x);
    else BinarySearch(arr,mid+1, end, x);
}

int main()
{
    int A[] = {2,3,5,6,11,18,34,40,47,53};
    int x;
    printf("Enter the number to search in the array \n"); 
    scanf("%d", &x);
    
    int index = BinarySearch(A, 0, 9,x);

    if(index != -1) printf("Number %d is present at index %d\n", x, index);
    else printf("Number %d is not present in the array \n", x);

    return -1;
}