#include<stdio.h>

/*
Following are the primary modes of file used in C for I/O

"r"         -->  Open for reading 
"rb"        -->  Open for reading in binary
NOTE: If the file does not exist, fopen returns NULL

"w"         --> Open for writing 
"wb"        --> Open for writing in binary
NOTE: If the file doesn't exists then c will create the file
      and if file exists the content will be overwritten

"a"         --> Open for append
NOTE: If the file doesn't exist, it will be created in append mode
*/
int main()
{
    FILE *ptr;
    ptr = fopen("sample1.txt", "w");
    
    return 0;
}