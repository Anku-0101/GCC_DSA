#include<stdio.h>

int StringComparator(char str1[], char str2[])
{

	int l1 = StringLength(str1);
	int l2 = StringLength(str2);

	if(l1 != l2)
		return 0;

	for(int i = 0; i<l1; i++)
		if(str1[i] != str2[i])
			return 0;

	return 1;
}

int StringLength(char str[])
{
	int length = 0;
	for(int i = 0 ; str[i] != '\0'; i++)
		length++;

	return length;
}

int main()
{
	int t;
	scanf("%d",&t);

	while(t--)
	{

	}
	return 0;
}

