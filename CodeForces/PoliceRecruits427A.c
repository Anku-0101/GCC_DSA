#include<stdio.h>

int main()
{
    int n;
    scanf("%d", &n);
    
    int ans = 0;
    int sum = 0;

    while(n--)
    {
        int input;  
        scanf("%d", &input);
        
        if(input == -1)
        {
            sum--;

            if(sum < 0)
            {
                sum = 0;
                ans++;
            }
        }
        else
        {
            sum += input;
        }

    }
    
    printf("%d", ans);
    return 0;
}