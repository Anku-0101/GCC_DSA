#include<stdio.h>

// Using EOF : End of file constant keyword to identify end of any file
int main()
{
    FILE *ptr;
    ptr = fopen("abc.txt", "r");
    char c = fgetc(ptr);

    while (c != EOF)
    {
        printf("%c", c);
        c = fgetc(ptr);
    }
    
    return 0;
}