#include<stdio.h>

int main()
{
    char str[101];
    scanf("%s", str);
    int len = 1;
    int count = 1;
    
    for(len = 1; str[len]!='\0'; len++) if(str[len] >= 65 && str[len] <= 90)count++;
    
    if(count == len)
    {
        if(str[0]>90)str[0] -= 32;
        else str[0] += 32;
        
        for(int i =1; i<len; i++)
        {
            if(str[i]<=90) str[i] += 32;
        }
        printf("%s", str);
    }
    else 
    printf("%s", str);
    return 0;
}