#include<stdio.h>

int main()
{
    int x;
    scanf("%d",&x);
    int numOfSteps = 0 ;
    
    numOfSteps = (x%5==0)?x/5: x/5 + 1;

    printf("%d", numOfSteps);

    return 0;
}