#include<stdio.h>

int main()
{
    int arr[4];
    int max = -1;

    for(int i = 0; i<4; i++)
    {
        int num;  
        scanf("%d", &num);
        arr[i] = num;
        
        if(num > max)
        {
            max = num;
        }
    }

    for(int i = 0; i<4; i++)
    {
        if(max - arr[i] != 0)
            printf("%d ", max - arr[i]);
    }
    

    
    return 0;
}