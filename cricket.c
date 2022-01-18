#include<stdio.h>

int main()
{
    int x = 173;

    while(x > 0)
    {
        printf("Enter the run scored \n");
        int run;
        scanf("%d",&run);
        x -= run;
        printf("Runs remaining = %d \n", x);
    }
    return 0;
}
