/*
Call By Reference :
When we pass address of variables to the function as arguments.
Now since the address are passed to the function, the function can now modify the value of a 
variable in calling function using * and & operators

*/

#include<stdio.h>

void swap_by_ref_method(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}

void swap_by_value(int a, int b)
{
    int temp = a;
    a = b;
    b = temp;
}

int main()
{
    int a,b;
    printf(" Enter two numbers to swap \n");
    scanf("%d", &a);
    scanf("%d", &b);

    printf("Vaue of a = %d and b = %d before swap \n", a, b);
    swap_by_value(a, b);
    printf("Vaue of a = %d and b = %d after swap_by_val  \n", a, b);
    swap_by_ref_method(&a, &b);
    printf("Vaue of a = %d and b = %d before swap_by_ref \n", a, b);

    return 0;
}

