#include<stdio.h>
#include<limits.h>


// Find minimum index and put it in the array where it belongs, 
// 1st minimum at index = 0
// 2nd minimum at index = 1 and so on
void SelectionSort(int arr[], int num)
{
    //int sorted[num]; NOT REQUIRED
    

    for(int i = 0; i < num; i++)
    {
        int min = INT_MAX; // can be improved if min just stores index instead of values
        int k;
        for(int j = i; j<num; j++)
        {
            if(arr[j] <= min)
            {
                min = arr[j];
                k = j;
            }                
        }

        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
    }
}


int main()
{
    int n;
    printf("Enter the number of elements present in the array \n");
    scanf("%d", &n);

    int arr[n];

    for(int i = 0; i <n; i++)
    {
        printf("Enter the element at index  = %d ", i);
        scanf("%d", &arr[i]);
    }


    SelectionSort(arr,n);

    for(int i = 0; i < n; i++)
        printf("arr[%d] = %d \n", i, arr[i]);

}