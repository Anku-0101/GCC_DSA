#include <stdio.h>

int main()
{
    char s[34];
    printf("Enter your name: \n");
    // Here anything after on or after spaces is ignored 
    // To include spaces we use gets() and puts()
    
    scanf("%s", s); // s stands for base address of char array s so no need to pass &s
    
    
    printf("Your name is : %s", s);

}