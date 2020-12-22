#include<stdio.h>

int main()
{
    long n;
    printf("Enter the number n whose factors needs to be computed \n");
    scanf("%ld", &n);

    long arr[n];
    int count = 0;

    for(long i = 1; i*i <= n; i++)
    {
        if(n%i == 0)
        {
            arr[count++] = i;

            if(n/i != i)
            {
                arr[count++] = n/i;
            }
        }
    }
    
    for(long int i = 0; i < count; i++)
    {
        printf("Factor  = %d \n", arr[i]);
    }

    return 0;
}