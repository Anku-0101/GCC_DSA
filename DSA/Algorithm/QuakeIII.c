/*
Quake III algorithm is used to compute inverse square root in the fastest way.

It makes use of address of stored number and performs bit operation, 
on float data type by first converting them to int data type,
the algorithm makes use of the way value is stored in float and how it can be
used by int to find the inverse square root

finally it makes use of newton's iterative way to compute roots, 
0 = y  - 1/sqrt(x)
*/

#include<stdio.h>

float Q_rsqrt(float number)
{
    int i;                              // 32-bit number
    float x2, y;                        // 32-bit decimal number
    const float threehalfs = 1.5f;       

    x2 = number *0.5f;
    
    y  = number;

    i = *(long *) &y;                 // Floating point bit hack
    i = 0x5f3759df - (i >> 1);        // Highly calculative computation, refer youtube for explanation
    y = * (float *) &i;
    
    y = y * (threehalfs - (x2 * y * y ));   // 1st iteration
    y = y * (threehalfs - (x2 * y * y ));   // 2nd iteration

    return y;

}

int main()
{
    float num;
    printf("Enter the number whose inverse square root needs to be computed \n");
    scanf("%f", &num);

    float res = Q_rsqrt(num);
    printf("Answer is %f\n", res);
    return 0;
}