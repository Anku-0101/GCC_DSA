#include<stdio.h>

int power(int number, int power)
{
    int ans = 1;
    while (power > 0)
    {
        ans = ans*number;
        power--;
    }

    return ans;
}

int main()
{
    int t;
    scanf("%d", &t);

    while (t--)
    {
        int num;  
        scanf("%d", &num);

        int nonZeroDigits = 0;
        int copy = num;
        
        while(copy > 0)
        {
            int digit = copy%10;
            
            if(digit != 0)
                nonZeroDigits++;
            
            copy /= 10;
        }
        printf("%d\n",nonZeroDigits);
        copy = num;
        int placeValue = 1;
        
        while (copy > 0)
        {
            int digit = copy%10;
            
            if(digit !=0)
            {
                int factor = power(10, placeValue);
                printf("%d ", digit*factor/10);
            }
            placeValue++;
            copy /= 10;
        }
        printf("\n");
    }
    return 0;
}