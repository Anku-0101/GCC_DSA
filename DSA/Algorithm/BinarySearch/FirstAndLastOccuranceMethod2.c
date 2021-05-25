#include<stdio.h>

// To find first occurance in a sorted array
// To find the index of last occurance, start = mid +1; instead of end = mind -1;
// Time complexicity is in this case is  O(log n)
int BinarySearchFirstOccurance(int arr[], int n, int x)
{
    int start = 0;
    int end = n-1;
    int result = -1;

    while(start <= end)
    {
        int mid  = start + (end - start)/2;
        

        if(arr[mid] == x)
        {
            result = mid;
            end = mid -1;
        }
        else if(arr[mid] > x) end = mid -1;
        else start = mid +1;
    }
    return result;
}

int main()
{
    int A[] = {2,4,9,11,11,11,11,40,47,53};
    int x;
    printf("Enter the number to search in the array \n"); 
    scanf("%d", &x);
    int index = BinarySearchFirstOccurance(A, 10,x);

    if(index != -1) printf("Number %d Occured first at index = %d\n", x, index);
    else printf("Number %d is not present in the array \n", x);

    return 0;
}