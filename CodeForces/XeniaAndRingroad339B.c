#include<stdio.h>

int main()
{
    int n, m;
    scanf("%d%d",&n,&m);
    int arr[m];
    int x = m, c = 0;
    
    while(c < m)  scanf("%d", &arr[c++]);    
    
    int curr = 1; 
    long long steps = 0;
    
    for(int i = 0; i<m; i++)
    {
        if(arr[i] >= curr)
        {
            steps += arr[i] - curr;
            curr = arr[i];
        }
        else
        {
            steps += n - curr + 1;
            steps += arr[i] - 1;
            curr = arr[i];
        }
    }
    printf("%lld", steps);
    return 0;
}