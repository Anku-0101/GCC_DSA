#include<stdio.h>

/*
A function is a block of code which performs a particular task. 
A function can be reused by the programmer in a given program any number of times. 

Function Prototype:
Function Prototype is a way to tell the compiler about the function we are going 
to define in the program.

Function Call
Function call is a way to tell the compiler to execute the function body at the 
time the call is made.
NOTE: The progam execution starts from  the main function in the sequence the 
instructions are written

Function Definition
This part contains the exact set of instructions which are executed during the
function call when a function is called from main(), the main function falls 
asleep and gets temporarily suspended. During this time the control goes to
the function being called. when the function body is done executing main() 
resumes.
*/

void Display();


int main()
{
    int a = 5;
    printf("Initializing display function \n");
    Display();
    int res = 2*3 + 5*2;
    printf("%d\n",res);
    printf("Display function has finished its work");
    return 0;
}

void Display()
{
    printf("This is display \n");
}