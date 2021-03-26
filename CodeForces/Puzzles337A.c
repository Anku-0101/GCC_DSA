#include<stdio.h>
void Sort(int arr[], int n)
{
    for(int i =0; i<n-1; i++)
    {
        for(int j =0; j<n-i-1; j++)
        {
            if(arr[j] < arr[j+1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}
int main()
{
    int n,m;
    scanf("%d%d",&n,&m);
    int arr[m];

    for(int i =0; i<m; i++)scanf("%d",&arr[i]);

    Sort(arr,m);
    int minRes = 50000;
    
    for(int i =0; i<m; i++)
    {
        if(i+n-1 < m)
        {
            if((arr[i] - arr[i+n-1])< minRes)
            {
                minRes = arr[i] - arr[i+n-1];
            }
        }
    }

    printf("%d",minRes);
    return 0;
}