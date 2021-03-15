#include<stdio.h>

int main()
{
    char str[20];
    scanf("%s", str);

    int count = 0;
    int luckyNum[14] = {4, 7, 47, 74, 44, 77,  444, 447, 474, 744, 477, 747, 774, 777 };
    
    for(int i=0; str[i] != '\0'; i++)
    {
        if(str[i]=='4' || str[i] == '7') count++;
    }

    int flag = 0;
    int size = sizeof(luckyNum)/sizeof(luckyNum[0]);

    for(int i =0; i < size; i++)
    {
        if(count == luckyNum[i] ) 
        {
            flag = 1;
            printf("YES");
            break;
        }
    }

    if(flag == 0) printf("NO");

    return 0;
}