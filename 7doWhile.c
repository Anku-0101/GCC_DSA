// Write first n natural number using do while loop

#include<stdio.h>

int main()
{
    printf("Enter the natural number N \n");
    int n;
    scanf("%d",&n);
    int i = 1;
    do
    {
        printf("%d \n",i);
        i++;
    }
    while(n >= i);

    return 0;
}