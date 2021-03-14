#include<stdio.h>

int length(char *ptr)
{
    int len = 0 ;
    while (*ptr != '\0')
    {
        len++;
        ptr++;
    }
    return len;
}

int main()
{
    char str[101];
    scanf("%s", str);
    int len = length(str);
    int lowerCase = 0;
    int upperCase = 0;
    int val;
    
    for(int i = 0 ; i< len; i++)
    {
        val = (int)str[i];
        if(val >= 65 && val <=90)upperCase++;
        else lowerCase++;
    }

    if(upperCase > lowerCase)
    {
        for(int i = 0 ; i < len; i++)
        {
            val = (int)str[i];
            if(val >= 97) str[i] = str[i] - 32;    
        }
    }
    else
    {
        for(int i = 0 ; i < len; i++)
        {
            val = (int)str[i];
            if(val >= 65 && val <= 90) str[i] = str[i] + 32;    
        }
    }
    printf("%s",str);
}