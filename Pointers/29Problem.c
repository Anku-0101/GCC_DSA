#include<stdio.h>

/*
    Refer this :
    https://www.geeksforgeeks.org/multidimensional-pointer-arithmetic-in-cc/

*/
int main() 
{ 
	char arr[5][7][6]; 
	char (*p)[5][7][6] = &arr; 
    char* ptr = arr;

	/* Hint: &arr - is of type const pointer to an array of 
	5 two dimensional arrays of size [7][6] */

	printf("%ld \n", (&arr + 1) - &arr); 
	printf("%ld\n", (char *)(&arr + 1) - (char *)&arr); 
	printf("%ld\n", (long)(arr + 1) - (long)arr); 
	printf("%ld\n", (long)(p + 1) - (long)p); 

	return 0; 
} 
