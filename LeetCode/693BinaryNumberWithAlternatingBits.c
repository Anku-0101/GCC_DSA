#include<stdio.h>
#include <stdbool.h>

bool hasAlternatingBits(int n)
{
    int count =0;
    printf("Entering the method \n");
    while(n>0)
    {
        printf("Inside the loop iteration number = %d and n = %d \n",count++, n);
        
        //printf("value of n&1 = %d \n", x);
        if((n&1) == 0)
        {
            printf("Entering first if statement \n");
            n = n >> 1;
            if((n&1) == 0) return false;
        }
        else if((n&1) == 1)
        {
            printf("Entering 2nd if statement \n");
            n = n >> 1;
            if((n&1) == 1)return false;     
        }
        
    }
    return true;
}

int main()
{
    int x; 
    scanf("%d",&x);
    printf("n << 1 = %d \n", x >> 1);
    printf("value of n = %d \n", x);
    printf("n&1 = %d \n", x&1);
    if(hasAlternatingBits(x))printf("%d has alternating bits \n", x);
    else printf("%d doesn't have alternating bits \n", x);
    return 0;
}