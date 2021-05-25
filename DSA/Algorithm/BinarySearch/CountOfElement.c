#include<stdio.h>

// Time complexicity for this is O(log n) + O(n) ~ O(n)
int CountOfElementInSortedArray(int arr[], int n, int x)
{
    int start = 0;
    int end = n-1;
    int count = 0;

    while(start <= end)
    {
        int mid = start + (end - start)/2;
        if(arr[mid] == x)
        {
            count++;
            int index = mid;

            while(--index >-1 && arr[index] == x) count++;
            index = mid;
            while(++index <n && arr[index] == x) count++;
            
            return count;
        }
        else if(arr[mid] > x) end = mid - 1;
        else start = mid + 1;
    }

    return 0;
}

int main()
{
    int arr[] = {2,2,2,3,3,3,3,3,5,5,5,6,6,7,7,8,8,8,8,8,11,11,11};
    printf("Enter the number to search \n"); 
    int x;
    scanf("%d", &x);
    int result = CountOfElementInSortedArray(arr,23,x);
    printf("The number %d is present in array %d number of time(s)\n", x,result);
    return 0;
}