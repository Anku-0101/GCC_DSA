#include<stdio.h>

//11 13 16 19 22 4 6 7 8 9 

int CircularArraySearch(int arr[], int n, int x)
{
    int start = 0;
    int end  = n-1;
    
    while(start <= end)
    {
        int mid = start + (end - start)/2;

        if(arr[mid] == x) return mid;

        else if(arr[mid] >= arr[start]) // Left side i.e from start till mid is sorted
        {
            if((x <= arr[mid]) && (x >= arr[start])) end = mid -1;
            else start = mid +1;
        }

        else if(arr[mid] <= arr[end]) // Right side i.e from mid till end is sorted
        {
            if((x <= arr[end]) && (x >= arr[mid])) start = mid +1;
            else end = mid -1;
        }
    }

    return -1;
}

int main()
{
    int arr[] = {12,13,14,15,16,17,18,2,3,4,5,6,7,8,9,10,11};
    printf("Enter the element to searh \n");
    int x; scanf("%d",&x);
    int n = sizeof(arr)/sizeof(arr[0]);

    int index = CircularArraySearch(arr, n, x);
    if(index == -1) printf("Number %d is not present in array \n",x);
    else printf("Number %d is present at index %d \n", x, index);
    
    return 0;
}