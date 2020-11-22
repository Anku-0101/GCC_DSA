#include <stdio.h>

int main()
{
    int a,b;
    printf("Enter values of first integers \n");
    // %d,%f,%c are format specifiers
    // &a , means address of a
    scanf("%d", &a);

    printf("Enter values of second integers \n");
    scanf("%d", &b);
    
    printf("Value of sum is %d", a + b);
    return 0;
}