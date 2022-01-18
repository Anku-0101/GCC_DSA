#include<stdio.h>

int main()
{
	int x = 10;
	int **q;
	q = &x;
	printf("value of pointer to pointer type q is %d", *q);
	return 0;
}

