/*
int i = 75;
int *j;
j = &i;

Just like j is pointing to i or storing the address of i, we can have another variable k which 
can further store the address of j. Type of j will be pointer to a pointer 

int **k;
k = &j;

This can be extended to any level. We mostly used int* and int**
*/

#include<stdio.h>

int main()
{
    int i = 72; 
    int *j;
    j = &i;
    int **k;
    k = &j;

    printf("Address of i is %d \n", &i);
    printf("value of i is %d \n", i);
    printf("value of j is %d \n", j);
    printf("value of address stored at j is %d \n", *j);
    printf("Address of j is %d \n", &j);
    printf("value of k is %d \n", k);
    printf("value of address stored at k is %d \n", *k);
    printf("Address of k is %d \n", &k);

    return 0;
}