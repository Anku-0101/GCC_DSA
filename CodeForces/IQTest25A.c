#include<stdio.h>

int main()
{
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i =0; i<n; i++)scanf("%d",&arr[i]);

    int oddCount =0, evenCount = 0, oddIndex, EvenIndex;

    for(int i =0; i<n; i++)
    {
        if(arr[i]%2 == 0)
        {
            evenCount++;
            EvenIndex = i+1;
        }
        else
        {
            oddCount++;
            oddIndex = i+1;
        }
    }

    if(evenCount == 1)printf("%d",EvenIndex);
    else printf("%d",oddIndex);
    return 0;
}