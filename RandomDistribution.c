#include<time.h>
#include<stdlib.h>
#include<stdio.h>

int main()
{
    srand(time(NULL));
    int arr[23];
    
    for(int i =0; i<23; i++)arr[i] = 0;

    int x = 0;
    while(arr[x] == 0)
    {
        int flag  = 0;
        int num = rand()%46 + 1;
        for(int i = 0; i<x+1; i++)
        {
            if(arr[i] == num)
            {
                flag = 1;
                break;
            }
        }

        if(flag == 0)
        {
            arr[x] = num;
            x++;
        }    
    }

    FILE *ftr;
    ftr = fopen("seq1.txt", "a");

    for(int i =0; i<23; i++)fprintf(ftr, "%d\t", arr[i]);

    fprintf(ftr, "\n");
    fclose(ftr);
    return 0;
}