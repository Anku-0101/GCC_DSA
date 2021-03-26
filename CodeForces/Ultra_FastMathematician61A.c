#include<stdio.h>

int main()
{
    char str1[101], str2[101];
    scanf("%s%s",str1,str2);
    
    int i = 0;

    while (str1[i]!='\0')
    {
        if(str1[i] != str2[i])str1[i]='1';
        else str1[i] = '0';

        i++;
    }
    
    printf("%s", str1);
    return 0;
}