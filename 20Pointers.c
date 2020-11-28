/*
Pointers
A pointer is a variable which stores the address of another variable.
i : value = 72                    address = 87994;
int *j ;
j =  &i;                
j : value = 87994                 address = 87998;
j is a pointer 
j points to i 

The "address of" & operator:
The address of operator is used to obtain the address of a given variable.
& i = 87994
& j = 87998

Format specifier for printing address is "%u"


The 'value at address' operator (*)
The value at address or * operator is used to obtain the value present at given memory address. 
It is denoted by *.
*(& i) = 72

*/

#include<stdio.h>

int main()
{   
    return 0;
}


