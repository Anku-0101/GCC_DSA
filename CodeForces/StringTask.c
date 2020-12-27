#include<stdio.h>

int StringLen(char *inp)
{
    char *ptr = inp;
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
    //char *ptr; --> This gives runtime error
    char ptr[101];
    
    scanf("%s", ptr);
    int len = StringLen(ptr);
    //printf("Length of the input string is %d \n", len);
    //char arr[len];

    for(int i = 0; i < len; i++)
    {
        if(ptr[i] == 'a' || ptr[i] == 'e' || ptr[i] == 'i' 
            || ptr[i] == 'o' || ptr[i] == 'u' || ptr[i] == 'y') continue;
        else if(ptr[i] == 'A' || ptr[i] == 'E' || ptr[i] == 'I' || 
                ptr[i] == 'O' || ptr[i] == 'U'|| ptr[i] == 'Y') continue;
        else 
        {
            int val = (int)ptr[i];
            if(val >= 65 && val <= 90)printf("%c%c", '.', (char)(val+32));
            else printf("%c%c",'.',ptr[i]);
        }
    }

    return 0;
}