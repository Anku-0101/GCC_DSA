#include<stdio.h>

void Merge(int left[], int sizeL, int right[], int sizeR, int arr[])
{
    int i,j,k; 
    i =0; j = 0; k = 0;

    while(i < sizeL && j < sizeR)
    {
        if(left[i] < right[j])
            arr[k++] = left[i++];
        
        else
            arr[k++] = right[j++];
            
    }

    while(i < sizeL)
        arr[k++] = left[i++];
    
    while(j < sizeR)
        arr[k++] = right[j++];

}

void MergeSort(int arr[], int n)
{
    if(n<2)
        return;

    int mid = n/2;
    int left[mid];
    int right[n-mid];

    for(int i = 0; i<mid; i++)
        left[i] = arr[i];
    for(int i = 0; i<n-mid; i++)
        right[i] = arr[mid+i];

    MergeSort(left, mid);
    MergeSort(right, n-mid);

    Merge(left, mid, right, n-mid, arr); 
}



int main()
{
    int arr[] = {9, 7, 8, 0, -1, 81, 22, 12, -5, 7, 2};
    MergeSort(arr, sizeof(arr)/sizeof(arr[0]));

    for(int i = 0 ; i <sizeof(arr)/sizeof(arr[0]); i++)
        printf("%d ",arr[i]);

    printf("\n");
}