#include<stdio.h>

// Method to perform Searching of sorted array in ascending order
// arr[] array to perform search
// n : number of elements in the array
// x : element needs to be searched
int BinarySearch(int arr[], int n, int x)
{
    int start = 0;
    int end = n-1;

    while(start <= end)
    {
        int mid = start + (end - start)/2; // To prevent overflow, better than (start + end)/2
        
        if(x == arr[mid]) return mid;
        else if(x < arr[mid]) end = mid -1;
        else start = mid + 1;
    }

    return -1;
}

int main()
{
    int A[] = {2,3,5,6,11,18,34,40,47,53};
    int x;
    printf("Enter the number to search in the array \n"); 
    scanf("%d", &x);
    int index = BinarySearch(A, 10,x);

    if(index != -1) printf("Number %d is present at index %d\n", x, index);
    else printf("Number %d is not present in the array \n", x);

    return 0;
}