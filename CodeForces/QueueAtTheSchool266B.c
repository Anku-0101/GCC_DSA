#include<stdio.h>

int main()
{
    int n, t;
    scanf("%d%d",&n,&t);
    char str[n];
    scanf("%s", str);

    while(t--)
    {
        for(int i =0; i < n-1; i++)
        {
            if(str[i]=='B' && str[i+1]== 'G')
            {
                str[i] = 'G';
                str[i+1] = 'B';
                i++;
            }
        }
    }
    
    printf("%s", str);
    return 0;
}