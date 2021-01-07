#include <stdio.h>

/*
ASCII Value of NULL character '\0' is 0. 
A string in C has to be terminated with null character.

(2) Arrays and pointers are different types that are used in similar manner

*/

void Print(const char c[]) // char c[] is equivalent to char *c // Writing const just makes sure that characters can't be modified or is only Read only memory
{
    while (*c != '\0')
    {
        printf("%c", *c);
        c++;
    }
    printf("\n");
}

int main()
{
    char c1[6] = "Hello"; // c1[6] can't hold string of size more than 5 as one null character is used to specify the termination of string
    char *c2;
    c2 = c1; // c1 means base address of array c1[6]

    // c2[i] is *(c2 + i)
    // c1[i] is *(c1 + i)
    // c1 = c2 ; is invalid as c1 is a base address of array c1 which can't be reassigned to some other variable
    // c2++; //is valid as c2 is a character pointer and can be incremented/decremented as per the need

    //Arrays are always passed to function by reference 
    Print(c1);

    char *c = "Okay"; // String gets stored as compile time constant, so can't be modified
    Print(c);
    c[0] = 'A'; // Will give a compilation error or segmentation fault error

    return 0;
}