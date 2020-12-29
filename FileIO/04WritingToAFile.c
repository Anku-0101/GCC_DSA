#include<stdio.h>

int main()
{
    FILE *fptr;
    int number = 98;
    
    fptr = fopen("abc.txt", "a");
    fprintf(fptr, "The number is %d ", number);
    fclose(fptr);
    
    return 0; 
}