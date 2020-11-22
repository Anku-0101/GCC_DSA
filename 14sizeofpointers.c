#include<stdio.h>

struct emp
{
    int eno;
    char ename[30];
    float esal; 
};
int main()
{
    char* cp;
    int* ip;
    struct emp* ep;

    printf("Size of char* is : %d \n", sizeof(cp));
    printf("Size of int* is : %d \n", sizeof(ip));
    printf("Size of emp* is : %d \n", sizeof(ep));
    printf("Size of struct emp is : %d \n", sizeof(struct emp));
    printf("Size of int is : %d \n", sizeof(int));
    printf("Size of char is : %d \n", sizeof(char));
    printf("Size of float is : %d \n", sizeof(float));

    return 0;
}