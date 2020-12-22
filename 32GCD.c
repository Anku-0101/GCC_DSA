#include <stdio.h>

// Time complexity of Euclids Algorithm can be proved as the number 
// of digits in smaller number among a and b 
// if a >= b
// ~ O(log10 b) ~ O(log b)
int euclid_gcd(int a, int b)
{
    int divident = a >= b ? a : b;
    int divisor  = a >= b ? b : a;

    // D printf("divident = %d divisor = %d \n", divident, divisor);
    while(divisor != 0)
    {
        int remainder = divident % divisor;

        divident = divisor;
        divisor = remainder;
        // D printf("divident = %d divisor = %d \n", divident, divisor);
    }
    // D printf("divident final res = %d \n", divident);
    return divident;
}

int main()
{
    printf("Enter two numbers whose GCD is required \n");
    int a, b;
    scanf("%d %d", &a, &b);
    int gcd = euclid_gcd(a,b);; 
    
    printf("GCD of %d %d = %d \n", a, b, gcd);
    return 0;

}