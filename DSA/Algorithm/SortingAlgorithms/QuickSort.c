#include<stdio.h>

void Swap(int *x, int*y);

int Partition(int arr[], int start, int end)
{
    //int mid = start + (end-start)/2;
    int pivot = arr[end]; // To improve the complexity use RandomPivot(arr, start, end){ pivotIndex = Random(start, end); Swap(arr[pivotIndex], arr[end]); Pivot(arr,start,end);}
    int pivotIndex = start;
    //printf("Value of Pivot = %d\n", pivot);

    for(int i = start; i <= end; i++)
    {
        if(arr[i] < pivot)
        {
            Swap(&arr[i], &arr[pivotIndex]);
            pivotIndex++;

        }

    }
    Swap(&arr[pivotIndex], &arr[end]);
    // printf("Start Index = %d\n", start);
    // printf("End Index = %d\n", end);
    // printf("Mid Index = %d\n", mid);
    // printf("Pivot Index = %d\n", pivotIndex);

    // for(int i = 0; i<10; i++)
    //     printf("%d ", arr[i]);
    // printf("\n");
    return pivotIndex;
}

void QuickSort(int arr[], int start, int end)
{
    if(start >= end)
        return;
    
    int pivotIndex = Partition(arr, start, end);

    QuickSort(arr, start, pivotIndex-1);
    QuickSort(arr, pivotIndex+1, end);
}

int main()
{
    int arr[] = {3,4,5,7,9,10,1,2,6,8};

    int length = sizeof(arr)/sizeof(arr[0]);
    //int PivotIndex = Partition(arr, 0,length-1);
    
    // printf("Pivot Index = %d \n", PivotIndex);
    

    /*
        P = 8
        4, 3, 2, 8, 7, 6, 5, 1 ; i = 0, PI = 0 :: PI = 1
        4, 3, 2, 8, 7, 6, 5, 1 ; i = 1, PI = 1 :: PI = 2
        4, 3, 2, 8, 7, 6, 5, 1 ; i = 2, PI = 2 :: PI = 3
        4, 3, 2, 8, 7, 6, 5, 1 ; i = 3, PI = 3 :: PI = 3
        4, 3, 2, 7, 8, 6, 5, 1 ; i = 4, PI = 3 :: PI = 4
        4, 3, 2, 7, 8, 6, 5, 1 ; i = 5, PI = 4 :: PI = 4

    */
    // int length = sizeof(arr)/sizeof(arr[0]);
    QuickSort(arr,0,length-1);

    for(int i = 0; i < length; i++)
        printf("%d ",arr[i]);
    
    printf("\n");
}

void Swap(int *x, int *y)
{
    int temp = *x;
    *x = *y;
    *y = temp;
}