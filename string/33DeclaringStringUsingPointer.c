#include <stdio.h>

/*
We can declare string using pointers
    char *ptr = "Harry";

This tells the compiler to store the string in memory and assigned address is stored
in a char pointer

NOTE:
1. Once a string is defined using char st[] = "Harry", it cannot be reinitialized
to something else.
2. A string defined using pointers can be reinitialized *ptr = "ABC" ; *ptr = "PQR";
*/
int main()
{
    char *ptr;
    char str[30];
    printf("Enter string denoted by ptr \n");
    gets(ptr); // Using scanf will ignore text on or after spaces, to include spaces using gets
    printf("Printing string denoted by ptr %s \n",ptr);
    
    printf("Enter string denoted by str[30] \n");
    scanf("%s", str); // Using scanf will ignore text on or after spaces
    printf("Printing string denoted by str[30] %s \n",str);

    // Trying to input again(reinitialization) for array initialization, not allowed
    char name[] = "My name is name";
    //name[] = "My name is not a name";

    return 0;
}