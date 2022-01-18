#include<stdio.h>

// Find smallest number and keep it in the beginning and repeat the same for higher index
void SelectionSort(int arr[], int num)
{
    for(int i = 0 ; i < num; i++)
    {
        // Setting 101 as Maximum as input <=100 
        int min = 101;
        int k;

        for(int j = i; j < num; j++)
        {
            if(arr[j] < min)
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
    int t;
    scanf("%d", &t);
    while(t--)
    {
        int n;
        scanf("%d", &n);
        int arr[n];

        for(int i =0; i<n; i++)
            scanf("%d", &arr[i]);

        SelectionSort(arr, n);

        // printf("Sorted array\n");
        // for(int i =0; i<n; i++)
        //     printf("%d\n", arr[i]);

        int flag = 1;
        for(int i = 0; i<n-1; i++)
        {
            int diff = arr[i] - arr[i+1];
            
            if(diff>1 || diff <-1)
            {
                printf("NO\n");
                flag = 0;
                break;
            }
        }

        if(flag == 1)
        {
            printf("YES\n");
        }
        
    }
    return 0;
}