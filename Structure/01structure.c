/*
Arrays, string --> Similar data (int, float, char)
Structures can hold --> dissimilar data

Structures are stored in contiguous memory locations. 
*/
#include<stdio.h>

struct  employee
{
    int code;
    float salary;
    char name[20];
};

int main()
{
    struct employee e1;
    e1.code = 100;
    e1.salary = 45.87;
    char name_[] = "Aman";
    int count =  0;

    for(int i=0; name_[i] != '\0'; i++)
    {   
        count++;
        e1.name[i] = name_[i];
    }
    e1.name[count] = '\0';
    printf("%s", e1.name);

    return 0;
}