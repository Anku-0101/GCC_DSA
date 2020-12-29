#include <stdio.h>

int StringLen(char *inp)
{
    char *ptr = inp;
    int i = 0;

    while (*ptr != '\0')
    {
        ptr++;
        i++;    
    }
    
    return i;
}

int main()
{
    char str[101];
    scanf("%s", str);
    
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    int i = 0;

    while (str[i] != '\0')
    {
        if(str[i] == '1') count1 ++;
        if(str[i] == '2') count2 ++;
        if(str[i] == '3') count3 ++;
        i++;    
    }

    char res[101];
    i = 0;
    while (count1 > 0 || count2 > 0 || count3 > 0)
    {
        while (count1 > 0)
        {
            res[i++] = '1';
            res[i++] = '+';
            count1 --;
        }

        while (count1 == 0 && count2 > 0)
        {
            res[i++] = '2';
            res[i++] = '+';
            count2--;
        }

        while (count2 == 0 && count1 == 0 && count3 > 0)
        {
            res[i++] = '3';
            res[i++] = '+';
            count3--;
        }
    }
    res[i++] = '\0';
    //int len = StringLen(res);
    //printf("%d and i = %d", len, i);   
    for(int j = 0; j <= (i-3); j++)
    {
        printf("%c", res[j]);
    }
    
    return 0;
}