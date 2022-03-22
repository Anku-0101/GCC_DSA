#include<stdio.h>

long GetSum(long num)
{
    long sum = 0;
    while(num > 0)
    {
        sum += num%10;
        num = num/10;
    }

    return sum;
}

long Product(long num)
{
    long pro = 1;
    while(num > 0)
    {
        pro = pro*(num%10);
        num = num/10;
    }

    return pro;
}

int main()
{
    int t;
    scanf("%d", &t);
    int itr = t;

    while(itr--)
    {
        long x,y;
        scanf("%ld", &x);
        scanf("%ld", &y);

        int count = 0;
        for(long val = x; val <= y; val++)
        {
            long sum, pro;
            int unitDigit; 

            if(val == x)
            {
                sum = GetSum(val);
                pro = Product(val);
                
            }
            else
            {
                sum++;
                pro = Product(val);
                 
            }

            //unitDigit = val%10;

            if(pro % sum == 0)
                count++;
        }
        printf("Case #%d: %d\n", t-itr, count);
    }

}