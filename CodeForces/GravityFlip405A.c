#include<stdio.h>
void sort (int arr[], int n)
{
    for(int i = 0; i<n-1; i++)
    {
        for(int j = 0; j<n-i-1; j++)
        {
            if(arr[j] > arr[j+1])
            {
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
int main()
{
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i =0; i<n;i ++)scanf("%d",&arr[i]);
    sort(arr, n);
    for(int i =0; i<n;i ++)printf("%d ",arr[i]);

    return 0;
}