#include<stdio.h>

int main()
{
    unsigned long long m, n, a;
    scanf("%llu %llu %llu", &m , &n, &a);

    unsigned long long len, bre, res;
    
    if(m%a == 0)len += m/a;
    else len += m/a + 1;

    if(n%a == 0)bre += n/a;
    else bre += n/a + 1;

    res = len * bre;
    printf("%llu",res);
    return 0;
}