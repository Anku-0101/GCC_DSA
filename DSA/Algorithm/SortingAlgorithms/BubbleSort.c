#include<stdio.h>

void Swap_(int *x, int *y)
{
    int temp = *x;
    *x = *y;
    *y = temp;
}

void BubbleSort(int arr[], int n)
{
    int flag; 
    // To improve the running time of the code, 
    // if the swap didn't occur even once then we can say that array is already sorted and we can come out of it
    for(int i = 0; i<n; i++)
    {
        flag = 0;
        for(int j = 0; j<n-i-1; j++)
        {
            if(arr[j] > arr[j+1])
            {
                Swap_(&arr[j], &arr[j+1]);
                flag = 1;
            }
        }
        if(flag == 1)
            break;
    }
}



int main()
{
    int arr[] = {3, 5, 1, 23, 4, 55, 11, 3, 4, 7};

    BubbleSort(arr, sizeof(arr)/sizeof(arr[0]));
    for(int i = 0 ; i< sizeof(arr)/sizeof(arr[0]); i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
}