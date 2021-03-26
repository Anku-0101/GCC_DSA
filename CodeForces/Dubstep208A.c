#include<stdio.h>

int main()
{
    char str[201];
    scanf("%s",str);
    char res[201];
    
    int len =0, flag = 0, count = 0;
    for(int i =0; str[i] != '\0'; i++)len++;
    
    for(int i =0; i<len; i++)
    {
        flag = 0;

        if(i+2 <len)
        {
            if(str[i] == 'W' && str[i+1] == 'U' && str[i+2] == 'B')
            {
                count++;
                if(i!=0 && count <2)printf(" ");
                i = i +2;
                flag = 1;
            }
        }
        if(flag ==0)
        {
            printf("%c",str[i]);
            count = 0;
        }
    }
    return 0;
}