#include <stdio.h>

int main()
{
    int n;
    int count = 0;
    printf("Enter Number whose prime factors needs to be computed \n");
    scanf("%d", &n);

    for(int i = 2; i * i <= n; i++)  // If the number is divisible it should be on or before sqrt(n)
    {
        if(n%i == 0)
        {
            while(n%i == 0)
            {
                n = n/i;
                count++;
            }
            printf("Prime %d occurs %d times \n", i, count);
            count = 0;
        }
    }

    if(n != 1) printf("Prime %d occurs %d times \n", n, 1);

    return 0;
}