#include<stdio.h>

void Sum_Average(int a, int b, int  *sum_, float *avg_)
{
    *sum_ = a + b;
    *avg_ = (a+b)/2.00; // OR *avg_ = (float)(a+b)/2
    
}

int main()
{
    int a, b;
    printf("Enter two integers a and b \n");
    scanf("%d", &a);
    scanf("%d", &b);

    int sum;
    float avg;
    
    Sum_Average(a, b , &sum, &avg);
    
    printf("Value of sum is = %d \n", sum);
    printf("Value of average is = %9.6f \n", avg);
    return 0;
}