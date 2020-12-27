#include<stdio.h>

int main()
{
    int n;
    scanf("%d", &n);

    int val = 0;
    int t = n;
    char operation[4];
    
    while(t > 0)
    {
        scanf("%s", operation);
        //printf("%s", operation);
        if(operation[0] == '+' || operation[1] == '+') val++;
        else val--;
        t --;
    }
    printf("%d", val);
    return 0;
}