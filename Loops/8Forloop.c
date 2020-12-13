#include<stdio.h>

int main()
{
    // Print n natural number in reverse order
    printf("Enter the value of N \n");
    int n;
    scanf("%d",&n);
    for(int i=n; i>0; i--)
    {
        printf("%d \n",i);
    }
    
    return 0;
}