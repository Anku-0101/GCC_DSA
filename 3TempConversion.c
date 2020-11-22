#include <stdio.h>

// C to F
// F to C
int main()
{
    printf("press 1 for C to F \n");
    printf("press 2 for F to C \n");
    int i;
    scanf("%d", &i);

    float temperature;
    
    switch (i)
    {
    case 1: 
        printf("Enter Temp in C \n");
        scanf("%f",&temperature);
        printf("Temperature in F is %f \n",((9*temperature)/5) + 32);
        break;
    case 2:
        printf("Enter Temp in C");
        scanf("%f",&temperature);
        printf("Temperature in F is %f \n",(((temperature - 32)*5)/9));
        break;

    default:
        printf("Incorrect Response \n");
        break;
    }

    printf("Value of remainder when 5 is divided by -2 \n %d\n", -5%2);

    int a =5, b = a;
    printf("%d", b);
    return 0;
}