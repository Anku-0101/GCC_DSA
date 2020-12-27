#include<stdio.h>


/*
Typedef Keyword:
It is used to create the alias name for data types in C. typedef is more
commonly used with structures.
*/
typedef struct  employee
{
    int code;
    float salary;
    char name[30];
} emp;

void Show(emp e)
{
    printf("Name of the employee is %s\n", e.name);
    printf("Code of the employee is %d\n", e.code);
    printf("salary of the employee is %f\n", e.salary);
}

int main()
{
    emp e1;
    emp *ptr;
    ptr = &e1;

    ptr->code = 105;
    ptr->salary = 10.57;
    char name[30] = "Rohan";

    int i = 0;
    while(name[i] != '\0')
    {
        ptr->name[i] = name[i];
        i++;
    }
    ptr->name[i] = '\0';
    Show(e1);
    return 0;
}