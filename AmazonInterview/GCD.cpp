#include<bits/stdc++.h>

using namespace std;

// GCD of m and n
// 36 8
int GCD(int m, int n)
{
    while(m%n != 0)
    {
        int rem = m%n;
        m = n;
        n = rem;
    }

    return n;
}

int GCDRecursive(int m, int n)
{
    if(m%n == 0)
        return n;
    
    return (n, m%n);
}

int GCDUtil(int m, int n)
{
    if(m < n)
    {
        int temp = m;
        m = n;
        n = temp;
    }
    return GCD(m,n);
    //return GCDRecursive(m,n);

}

int main()
{
    cout<<GCDUtil(12,27)<<" ";

    return 0;
}

