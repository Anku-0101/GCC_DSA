#include<stdio.h>

void PrintPattern(int n);

/*
for n = 3 
*
* * *
* * * * *
*/

int main()
{
    int num;
    printf("Enter the number of levels of pattern %d \n", num);
    scanf("%d", &num);
    PrintPattern(num);
}

void PrintPattern(int n)
{
    if(n == 1)
    {
        printf("*\n");
        return;
    }

    PrintPattern(n-1);

    for(int i = 0; i < (2*n -1); i++)
    {
        printf("*");
    }

    printf("\n");
}