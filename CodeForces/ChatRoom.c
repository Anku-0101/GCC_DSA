#include<stdio.h>

int main()
{
    char str[101];
    scanf("%s",str);
    int res  = 0;
    int h = 0, e = 0, l = 0, o = 0;


    for(int i = 0; str[i] != '\0'; i++)
    {
        if(str[i] == 'h') h++;
        if(str[i] == 'e' && h>0) e++;
        if(str[i] == 'l' && e>0) l++;
        if(str[i] == 'o' && l>0) o++;

        res++;

    }

    if(h>0 && e>0 && l>1 && o>0)printf("YES");
    else printf("NO");
    return 0;
}