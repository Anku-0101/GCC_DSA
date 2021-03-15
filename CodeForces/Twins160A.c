#include<stdio.h>

void swap(int *num1, int *num2)
{
    int temp = *num1;
    *num1 = *num2;
    *num2 = temp;
}

// Implementing bubble sort
void sort(int n, int data[])
{
    for(int i =0; i < n-1; i++)
    {
        for(int j = 0 ; j < n-i-1; j++)
        {
            if(data[j] < data[j+1])swap(&data[j], &data[j+1]);
        }
    }
}

int main()
{
    int n;
    scanf("%d", &n);
    int arr[n];
    int sum = 0;

    for(int i =0; i<n; i++)
    {
        scanf("%d", &arr[i]);
        sum += arr[i];
    } 
    
    sort(n, arr);

    //for(int i =0; i<n; i++) printf("%d\n", arr[i]);

    int i = 0, sumleft = 0 ;

    for(; i < n ; i++)
    {
        sumleft += arr[i];
        if(sumleft > sum - sumleft) break;

    }
    
    printf("%d", i+1);

    return 0;
}