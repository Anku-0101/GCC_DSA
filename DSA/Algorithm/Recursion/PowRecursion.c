#include<stdio.h>

// Time Complexity = O(n)
// Space Complexity = O(n)
int power(int x, int n)  
{
    if(n == 1)
        return x;
    
    return x*power(x,n-1); 
}


int PowerF(int x, int n)
{
    if( n == 1)
        return x;
    
    if(n%2 == 0)
    {
        int res = PowerF(x,n/2);
        return res*res;
    }
    else
    {
        return x*power(x,n-1);
    }
        

}

int main()
{
    int x,n;
    scanf("%d%d", &x, &n);

    int res = power(x,n);
    printf("%d ^ %d = %d \n", x,n,res);

    return 0;
}