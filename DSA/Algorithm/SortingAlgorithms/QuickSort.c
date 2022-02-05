#include<stdio.h>

void Swap(int *x, int*y);

int Partition(int arr[], int start, int end)
{
    int pivot = arr[end]; // To improve the complexity use RandomPivot(arr, start, end){ pivotIndex = Random(start, end); Swap(arr[pivotIndex], arr[end]); Pivot(arr,start,end);}
    int pivotIndex = start;

    for(int i = start; i<end; i++)
    {
        if(arr[i] < pivot)
        {
            Swap(&arr[i], &arr[pivotIndex]);
            pivotIndex++;
        }
    }
    Swap(&arr[pivotIndex], &arr[end]);

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
    int arr[] = {4,3,2,8,7,6,5,1};
    int length = sizeof(arr)/sizeof(arr[0]);
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