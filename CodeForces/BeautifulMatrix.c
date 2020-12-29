#include<stdio.h>

int main()
{
    int arr[5][5];

    int row, col;

    for(int i = 0 ; i < 5*5; i++)
    {
        scanf("%d", &arr[i/5][i%5]);
        
        if(arr[i/5][i%5] == 1)
        {
            row = i/5;
            col = i%5;
            //printf("%d and %d",row, col );    
        }
    }

    int rowM = (row - 2) > 0 ? (row -2) : (2 - row);
    int colM = (col - 2) > 0 ? (col -2) : (2 - col);
    
    //printf("%d and %d",rowM, colM);    

    int res = rowM + colM;
    printf("%d",res);    

    return 0;
}