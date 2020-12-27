#include<stdio.h>

/*
The Random Access Memory is volatile and its content is lost once the program 
terminates.
In order to persist he data forever we use files.
A file is data stored in a storage device.
A C program can talk to the file by reading content from it and writing content to it.

                         WRITE   
        C Program       ------->   FILE
                        <-------  
                          READ

*/

/*
FILE Pointer
A "FILE" is a structure which needs to be created for opening a file.
A File pointer is a pointer to this structure of the file. [File pointer is needed 
for communication between the file and the program]

A FILE pointer can be created as follows:

FILE *ptr;
ptr = fopen("filename.txt", "mode");

*/

int main()
{
    FILE *ptr;
    ptr = fopen("sample.txt", "r");
    ptr = fopen("sample.txt", "w");
    return 0;
}