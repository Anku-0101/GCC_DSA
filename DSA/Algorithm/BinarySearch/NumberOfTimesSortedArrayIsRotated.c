#include<stdio.h>

//  The given array is Circularly Sorted
//  Contains distinct elements
//  Find the number of times array is circularly rotated if given array is sorted in ascending order
//  The answer will be the index of minimum element

int NumberOfRotations(int arr[], int n)
{
    int start = 0;
    int end = n-1;

    while(start <= end)
    {
        int mid = start + (end - start)/2;
        
        printf("start = %d\n",start);
        printf("mid = %d\n",mid);
        printf("end = %d\n",end);

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
    int index = NumberOfRotations(arr, sizeof(arr)/sizeof(arr[0]));
    if(index == -1) printf("Array is not circularly sorted \n");
    else printf("Number of times array is circularly sorted is %d \n", index);
    return 0;
}