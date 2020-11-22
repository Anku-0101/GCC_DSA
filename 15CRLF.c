#include<stdio.h>

int main()
{
    printf("This is CR \r now this will appear at the start as it is proceeded by CR, \n");
    printf("\tTesting CR \r begin \n");
    printf("Testing CR and New Line \r\n this should go in new line \r\n this should go in the third line \n");
    printf("Testing vertical tab \v this should come in 2nd line just below the first \v and so on\n");
    return 0;
}