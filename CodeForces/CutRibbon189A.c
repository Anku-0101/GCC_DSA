#include<stdio.h>

int main()
{
    int n,a,b,c;
    scanf("%d%d%d%d",&n,&a,&b,&c);
    //printf("Value of a = %d, b = %d and c = %d \n", a,b,c);
    // x*a + y*b + z*c = n
    int res = 0;
    int minm,mid,max;

    if(a <= c && a <= b)
    {
        minm = a;
        if(b >= c)
        {
            max = b;
            mid = c;
        }
        else
        {
            max = c;
            mid = b;
        }
    }
    else if(b<=c && b<=a)
    {
        minm = b;
        if(c>=a)
        {
            max = c;
            mid = a;
        }
        else
        {
            max = a;
            mid = c;
        }
    }
    else 
    {
        minm = c;
        if(a>=b)
        {
            max = a;
            mid = b;
        }
        else
        {
            max = b;
            mid = a;
        }
    }
    a = max;
    b = mid;
    c = minm;
    //printf("Value of a = %d, b = %d and c = %d \n", a,b,c);
    int itr;
    if(minm != 0) itr = n/minm;

    for(int i = 0; i<=itr; i++)
    {
        for(int j =0; j<=itr; j++)
        {
            //printf("A");
            if(((n-(a*i+b*j))%minm == 0) && (n-(a*i+b*j)>=0))
            {
                int k = (n-(a*i+b*j))/minm;
                
                //printf("Value of result for i = %d and j = %d and k = %d is %d \n", i,j,k,res);
                if((i+j+k) > res)res = i+j+k;
                break;
            }
            // for(int k =0; k<=itr; k++)
            // {
            //     if((a*i + b*j + c*k)==n)
            //     {
            //         if((i+j+k) > res)res = i+j+k;
            //     }
            // }
        }
    }
    printf("%d",res);
    return 0;
}