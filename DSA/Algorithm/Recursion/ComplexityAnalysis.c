
// FOR FACTORIAL PROBLEM

int factorial(int n)
{
    if(n == 0) // 1 unit
        return 1;
    
    return n*factorial(n-1); // 1 unit for multiplication and 1 unit for subtraction i.e n-1 in factorial(n-1)
}

/*
T(n)    = T(n-1) + 3; n > 0  ..... (i)
T(0) = 1                     ..... (ii)

    T(n)    = T(n-1) + 3;
    T(n)    = T(n-2) + 3 + 3 = T(n-2) + 6;
    T(n)    = T(n-3) + 3 + 6 = T(n-3) + 9;
    T(n)    = T(n-k) + 3k;   
    n-k = 0 -> k = n;
    T(n) = T(0) + 3n = 3n + 1
    T(n) = O(n);
*/

int Fibonacci(int n)
{
    if(n <= 1)            // 1 unit for comparision 
        return 1;
    
    else 
        return Fibonacci(n-1) + Fibonacci(n-2); // total 3 units, 2 for subtaction n-1, n-2 and 1 for addition 
}

/*
T(0) = 1;
T(1) = 1
T(n) = T(n-1) + T(n-2) + 4 , n>1

        

        take, T(n-1) ~ T(n-2) to compute Lower bound
        and take T(n-2) ~ T(n-1) to compute Upper bound
*/