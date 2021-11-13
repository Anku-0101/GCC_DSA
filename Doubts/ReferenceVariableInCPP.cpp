#include<iostream>


int main()
{
    int a = 3;
    int b = 4;

    int *pointerToA = &a;
    int *pointerToB = &b;

    int *p = pointerToA;
    p = pointerToB;

    printf("%d %d %d \n", a,b,*p);

    int& refereceToA = a;
    int& referenceToB = b;
    int& r  =  refereceToA;
    r = referenceToB;

    printf("%d %d %d \n", a, b, r);

    return 0;

}