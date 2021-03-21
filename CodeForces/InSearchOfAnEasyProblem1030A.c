#include<stdio.h>

int main()
{
    int n; 
    scanf("%d", &n);
    int arr[n];

    for(int i =0; i<n; i++) scanf("%d", &arr[i]);
    int flag = 0;
    
    for(int i =0; i<n; i++)
    {
        if(arr[i] == 1)
        {
            printf("HARD");
            flag  = 1;
            break;
        }
    }

    if(flag == 0)printf("EASY");
    
    
    return 0;

}