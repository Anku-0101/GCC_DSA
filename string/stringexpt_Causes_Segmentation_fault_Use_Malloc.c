#include <stdio.h>

int main()
{
    
    char *ptr;
    int i = 0 ;
    ptr[i++] = 'A';
    ptr[i++] = 'B';
    ptr[i++] = 'A';
    ptr[i++] = 'C';
    ptr[i++] = '\0';

    printf("%s", ptr);
    return 0;
}