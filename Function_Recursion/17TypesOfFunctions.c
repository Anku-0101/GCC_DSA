/*

Types of Functions:
1. Library Function -> Commonly required functions grouped together in a library file on disk.
2. User defined functions -> These are the functions declared and defined by the user.

Why use Functions?
1. To avoid rewriting the same logic again and again
2. To keep track of what we are doing in a program
3. To test and check logic independently.

*/

/*
NOTE:
1. Parameters are the values or variable placeholders in the function definition. 
2. Arguments are the actual values passed to the function to make a call
3. A function can return only one value at a time
4. If the passed variable is changed inside the function, the function call doesn't change the value
   in the calling function if passed by value. 
*/

#include<stdio.h>
#include<math.h>

int main()
{
    int side;
    printf("Enter the value of side \n");
    scanf("%d", &side);
    printf("The value of area is %f", pow(side,2));
    
    return 0;
}