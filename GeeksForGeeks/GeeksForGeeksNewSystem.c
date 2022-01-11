#include<stdio.h>

int StringLength(char str[])
{
	int length = 0;
	for(int i = 0; str[i] != '\0'; i++)
		length++;

	
	return length;
}

int StringComparator(char str1[], char str2[])
{
	//printf("Comparing String \n");
	
	int l1 = StringLength(str1);
	int l2 = StringLength(str2);
	//printf("str1 = %s len1 = %d \n", str1, l1);
	//printf("str2 = %s len2 = %d \n", str2, l2);
	
	if(l1 != l2)
		return 0;

	for(int i = 0; i<l1; i++)
		if(str1[i] != str2[i])
			return 0;

	return 1;
}


void AppendString(char str1[], char str2[])
{
	int len = StringLength(str1);
	for(int i = 0 ; i < len; i++)
		str2[i] = str1[i];

	str2[len] = '\0';
}
int main()
{
	int t;
	scanf("%d",&t);

	while(t--)
	{
		int N;
		scanf("%d",&N);
		char data[N][10001];
		int count[N];
		int s = 0;
		int j = 0;
		char str[10001];

		for(int i = 0; i<N; i++)
		{
			//printf("Entering loop for time = %d\n", i+1);
			scanf("%s",str);

			for(j = 0; j < s; j++)
			{
				if(StringComparator(str, data[j]))
				{
					count[j]++;		
					printf("%s%d ",str,count[j]);
					break;		
				}
			}
			if(j == s)
			{
				AppendString(str, data[s++]);
				count[j] = 0;
				printf("Verified ");
			}
		}
		printf("\n");
	}
	return 0;
}

