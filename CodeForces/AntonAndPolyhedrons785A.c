#include<stdio.h>

int main()
{
    int n;
    scanf("%d",&n);
    char str[25];
    int res = 0;

    for(int i =0; i<n; i++)
    {
        scanf("%s",str);
        if(str[0] == 'T') res +=4;
        else if(str[0] == 'C')res += 6;
        else if(str[0] == 'O')res += 8;
        else if(str[0] == 'D')res += 12;
        else if(str[0] == 'I')res += 20;
    }
    printf("%d",res);
    
    return 0;
}