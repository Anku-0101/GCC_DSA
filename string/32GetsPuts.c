#include<stdio.h>


// 
int main()
{
    char st[30];
    gets(st); //Entered string including spaces if present will be stored in st 
    printf("Entered string is %s", st); // Prints the entered string 
    puts(st); // Prints the entered string and puts cursor in new line 
    return 0;
}