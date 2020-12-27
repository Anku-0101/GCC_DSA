#include <stdio.h>

struct employee
{ 
    int code;
    float salary;
    char name[20];
};

int main()
{
    struct employee e1;
    struct employee *ptr; // Creating an employee pointer 
     
    ptr = &e1;

    (*ptr).code  = 101; //Derefrencing the pointer in order to access its member variables 
    ptr->salary = 25.87;
    
    printf("Emp code is %d\n", e1.code);
    printf("Emp salary is is %f\n", e1.salary);

    printf("Emp code is %d\n", ptr->code);
    printf("Emp salary is is %f\n", ptr->salary);
    
    return 0;
}