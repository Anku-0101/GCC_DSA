#include <stdio.h>

int main()
{
    char str1[101];
    char str2[101];
    scanf("%s", str1);
    scanf("%s", str2);

    int i = 0;
    int val1, val2;
    int flag = 0;

    while(str1[i] != '\0')
    {
        val1 = (int)str1[i];
        val2 = (int)str2[i];

        if(val1 >= 97) val1 = val1 - 32;
        if(val2 >= 97) val2 = val2 - 32;

        if(val1 > val2)
        {
            printf("%d", 1);
            flag = 1;
            break;
        }

        if(val1 < val2)
        {
            printf("%d", -1);
            flag = 1;
            break;
        }
        i++;
    }

    if(flag == 0) printf("%d", 0);
    return 0;
}