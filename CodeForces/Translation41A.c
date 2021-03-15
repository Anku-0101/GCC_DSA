#include<stdio.h>

int len(char *ptr)
{
    int len = 0;
    while (*ptr != '\0')
    {
        len++;
        ptr++;
    }
    return len;
}

int main()
{
    char word1[101];
    char word2[101];
    scanf("%s", word1);
    scanf("%s", word2);

    int len1 = len(word1);
    int len2 = len(word2);

    if(len1 != len2) printf("NO");
    else 
    {
        int flag  = 0;
        for(int i = 0; i< len1; i++)
        {
            if(word1[i] != word2[len1-i-1])
            {
                flag = 1;
                printf("NO");
                break;
            }
        }
        if(flag == 0) printf("YES");
    }
    

    return 0;
}