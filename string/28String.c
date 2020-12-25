/*
Strings
A string is a 1-D character array terminated by a null ('\0')

null character is used to denote string termination characters are stored in contiguous 
memory locations

Initializing strings
Since string is an array of characters, it can be initialized as follows:
char s[] = {'A', 'M', 'A', 'N', '\0'};
also there's a shortcut in c to declare a string
char s[] = "Aman";

String in Memory [Stored in contiguous manner like array with null character at the end]
A string is stored just like an array in the memory only exception is it has a null character at the end

*/

#include<stdio.h>

int main()
{
    char s[] = {'A', 'M', 'A', 'N', '\0'};
    char val[] = "Name"; // In this case c adds a null character automatically 
    return 0;
}