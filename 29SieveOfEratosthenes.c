#include<stdio.h>
#include <time.h> 

void SeiveofEratosthenesSimple(long primes[], long n)
{
    // Seive of Eratosthenes Simple
    for(long i = 2; i < n+1; i++)
    {
        if(primes[i] == 1)
        {
            for(long j = 2; j*i < n+1; j++)
            {
                primes[i*j] = 0;
            }
        }
    }
}

// Time complexity 
// for initialization it is O(n) in main method 
// for outer loop it is sqrt(n)
// for inner loop it is O(n/2 + n/5 + n/7 + n/11 + n/13 ....... ) ~ O(n loglogn)
void SeiveofEratosthenesOptimized(long primes[], long n)
{
    // Seive of Eratosthenes optimized
    for(long i = 2; i*i < n+1; i++)
    {
        if(primes[i] == 1)
        {
            for(long j = 2; j*i < n+1; j++)
            {
                primes[i*j] = 0;
            }
        }
    }
}

void PrintIntArray(long arr[], long n)
{
    for(long i = 0 ; i <= n; i++)
    {
        printf("Prime test for %ld is = %ld \n", i, arr[i]);
    }
}
int main()
{
    // Calculate the time taken by fun() 
    clock_t t; 
    
    long n;
    printf("Enter the number n till where prime is required \n");
    scanf("%ld", &n);

    //Taking an array of size n+1, 0 and 1 are marked as non primes
    //All the other numbers starting 2 are maked as prime
    long primes[n+1];
    primes[0] = 0;
    primes[1] = 0;

    for(long i = 2; i <= n; i++)
    {
        primes[i] = 1;
    }

    t = clock(); 
    SeiveofEratosthenesSimple(primes, n);
    t = clock() - t; 
    double time_taken = ((double)t)/CLOCKS_PER_SEC; // in seconds
    printf("Time taken by Simple Seive of Eratosthenes is %f \n", time_taken);

    //PrintIntArray(primes, n);
    
    t = clock(); 
    SeiveofEratosthenesOptimized(primes, n);
    t = clock() - t; 
    time_taken = ((double)t)/CLOCKS_PER_SEC; // in seconds
    printf("Time taken by Optimized Seive of Eratosthenes is %f ", time_taken);
    //PrintIntArray(primes, n);

    return 0;
}