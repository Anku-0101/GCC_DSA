#include<stdio.h>

void Swap(int* x, int *y)
{
    int temp = *x;
    *x = *y;
    *y = temp;
}

// 4, 5, 2 
void InsertionSort(int arr[], int n)
{
    for(int i = 1; i<n; i++)
    {
        int value = arr[i];
        for(int j = i-1; j>=0; j--)
        {
            if(value < arr[j])
            {
                Swap(&arr[j], &arr[j+1]);
                // int temp = arr[j+1];
                // arr[j+1] = arr[j];
                // arr[j]   = temp;
            }
                
            
            else
                break;
        }
    }
}


int main()
{
    int arr[] = {9, 7, 8, 0, -1, 81, 22, 12, -5, 7, 2};
    InsertionSort(arr, sizeof(arr)/sizeof(arr[0]));

    for(int i = 0 ; i <sizeof(arr)/sizeof(arr[0]); i++)
        printf("%d ",arr[i]);

    printf("\n");
    return 0;
}