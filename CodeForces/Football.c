#include<stdio.h>

int main()
{
    char str[101];
    scanf("%s", str);

    int count0 = 0;
    int count1 = 0;
    int i = 0;
    int ans = 0;

    if(str[1] == '\0') printf("NO");
    else 
    {
        while(str[i] != '\0')
        {
            if((str[i] == str[i+1]) && str[i] == '0') count0++;
            if((str[i] == str[i+1]) && str[i] == '1') count1++;
            
            if(count0 == 6 || count1 == 6)
            {
                ans = 1;
                break;
            }

            if(str[i] != str[i+1])
            {
                count0 = 0;
                count1 = 0;
            }

            i++;
        }
    }

    if(ans == 1 ) printf("YES");
    if(ans == 0 ) printf("NO");
    return 0;
}