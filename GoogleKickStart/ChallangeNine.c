#include<stdio.h>

int GetSumOfDigits(int x)
{
    int sum = 0;
    while(x > 0)
    {
        sum += x%10;
        x = x/10;
    }

    return sum;
}


int GetSmallest(int num)
{
    int numDigit = 0;
    int x = num;

    while(x>0)
    {
        numDigit++;
        x = x/10;
    }

    x = num;
    int arr[numDigit];

    for(int i = numDigit-1; i>=0; i--)
    {
        arr[i] = x%10;
        x = x/10;
    }

    for(int i = numDigit-1; i>0; i--)
    {
        if(arr[i] < arr[i-1])
        {
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }
        else
        {
            break;
        }
    }
    x = 0;
    for(int i = 0; i < numDigit; i++)
    {
        x = x*10;
        x = x + arr[i];
    }

    return x;
}


int main()
{
    int t;
    scanf("%d",&t);
    int itr = t;

    while(itr--)
    {
        int x;
        scanf("%d",&x);
        
        int sumDigit = GetSumOfDigits(x);
        //printf("Sum of digit = %d \n", sumDigit);

        if(sumDigit %9 == 0)
        {
            printf("Case #%d: %d\n", t-itr, x*10);
            continue;
        }

        int num = 1;

        while((num+sumDigit)%9 != 0)
        {
            num++;
        }

        int modified = x*10 + num;

        int res = GetSmallest(modified);

        printf("Case #%d: %d\n", t-itr, res);

    }
    return 0;
}