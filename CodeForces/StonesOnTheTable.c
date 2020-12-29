#include<stdio.h>

int main()
{
    int num;
    scanf("%d", &num);
    
    char stone[num+3];
    scanf("%s", stone);
    stone[num] = '@';
    stone[num+1] = '$';
    stone[num+2] = '\0';
    //printf("%s \n",stone);
    int res = 0, i = 1;

    while (stone[i] != '\0')
    {
        if(stone[i] == stone[i-1]) res++;
        i++;
    }

    if( i == 2 )printf("%d", 1);
    else 
    {
        printf("%d", res);
    }
    return 0;
}