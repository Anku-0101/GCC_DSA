#include<stdio.h>

int main()
{
    //Print multiplication order of 10 in reverse order
    int n;
    printf("Enter any multiple of 10 \n");
    scanf("%d",&n);
    while(n%10 !=0)
    {
        printf("Entered number is not a multiple of 10, please try again \n");
        scanf("%d",&n);
    }

    for(int i= n ; i >= 10; i -= 10)
    {
        printf("%d \n",i);
    }

    return 0;
}