#include<stdio.h>

int main()
{
    FILE *ptr;
    ptr = fopen("abc.txt", "r");
    char c = fgetc(ptr);
    printf("The value of my character is %c \n", c);

    printf("The value of my character is %c \n", fgetc(ptr));
    printf("The value of my character is %c \n", fgetc(ptr));
    printf("The value of my character is %c \n", fgetc(ptr));
    printf("The value of my character is %c \n", fgetc(ptr));
    printf("The value of my character is %c \n", fgetc(ptr));
    fclose(ptr);

    ptr = fopen("putcdemo.txt","w"); //Creating a new file to demonstrate putc
    putc('c',ptr);
    putc('z',ptr);
    putc('e',ptr);
    fclose(ptr);

    return 0;
}