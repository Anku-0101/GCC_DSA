#include<stdio.h>

int arr[301];
//
//Method to compute last two digit for the fib. Sequence
//
void GetLastTwoDigit(int arr[], int n)
{
	int first = 1;
	int second = 1;
	arr[0] = 0;
	arr[1] = 1;
	arr[2] = 1;

	for(int i = 3; i<301; i++)
	{
		int sum = arr[i-1] + arr[i-2];
		int res = sum%100;
		arr[i] = res;
	}

}

/*
int ComputeFibForLargeNumber(int n)
{
	int res;
	int i = 1000000;

	int t1 = arr[i-1];
	int t2 = arr[i];

	for(; i<=n; i++)
	{
		int sum = t1 + t2;
		res = sum%100;
		t1 = t2;
		t2 = res;
	}
	return res;

}
*/
int main()
{
	int t;
	scanf("%d",&t);
	GetLastTwoDigit(arr,301);
 


	while(t--)
	{
		int N;
		scanf("%d",&N);
		printf("%d\n", arr[N%300]);
	}
	

	return 0;
}

