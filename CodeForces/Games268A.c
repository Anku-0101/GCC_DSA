#include<stdio.h>

int main()
{
    int n;
    scanf("%d",&n);
    int a[n], b[n];
    for (int i = 0; i < n; i++)scanf("%d%d",&a[i],&b[i]);

    int res = 0;
    for(int i =0; i<n; i++)
    {
        for(int j = i+1; j<n; j++)
        {
            if(a[i] == b[j])res++;
            if(b[i] == a[j])res++;
        }
    }
    printf("%d",res);
    return 0;
}