#include <stdio.h>

int main()
{
    char str[1001];
    scanf("%s", str);

    int i = 0;
    int val = (int)str[0];
    if(val > 96) val = val - 32;

    while (str[i] != '\0')
    {
        if( i == 0 )printf("%c",(char)val);
        else printf("%c", str[i]);
        i++;
    }
    return 0;
}