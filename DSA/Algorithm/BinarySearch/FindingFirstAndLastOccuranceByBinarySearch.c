#include<stdio.h>
int array[2] = {0,0};

int* FirstAndLastIndex(int arr[],int n, int x)
{
    //int array[2] = {0,0};
    
    int start = 0;
    int end = n-1;
    printf("entering while Loop \n");

    while(start <= end)
    {
        printf("Entered While Loop \n");
        int mid = start + (end - start)/2;

        if(x == arr[mid])
        {
            int minIndex= mid, maxIndex = mid;

            while(arr[minIndex] == x)
            {
                minIndex = minIndex -1;
            }
            minIndex++;

            while(arr[maxIndex] == x)
            {
                maxIndex = maxIndex +1;
            }
            maxIndex--;

            array[0] = minIndex;
            array[1] = maxIndex;

            return array;
        }
        else if (x < arr[mid]) end = mid -1;
        else start = mid +1;
    }

    return array;
}

int main()
{
    int A[] = {2,3,5,6,11,11,11,11,47,53};
    int x;
    printf("Enter the number to search in the array \n"); 
    scanf("%d", &x);
    int* index = FirstAndLastIndex(A, 10,x);
    //printf("processing input, return expected \n");
    if(index[1] == 0) printf("Number is not found \n");
    printf("Start Index where Number %d is found = %d and End index = %d ", x, index[0], index[1]);
    return 0;
}