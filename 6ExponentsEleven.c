#include<stdio.h>

int main()
{
    unsigned long x = 11;
    for(int i =0 ; i < 20; i++)
    {
        printf("%lu \n",x);
        x = x*11;
    }   
    return 0;
}
