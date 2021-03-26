#include<stdio.h>

int main()
{
    int k,l,m,n,d;
    scanf("%d%d%d%d%d", &k,&l,&m,&n,&d);
    int arr[d+1];
    for(int i = 0; i <= d; i++)arr[i] = 0;

    for(int i = k; i <= d; i +=k)arr[i] = 1;
    for(int i = l; i <= d; i +=l)arr[i] = 1;
    for(int i = m; i <= d; i +=m)arr[i] = 1;
    for(int i = n; i <= d; i +=n)arr[i] = 1;

    int res  =0;
    for(int i = 1; i <= d; i++)if(arr[i] == 1)res++;

    printf("%d",res);
    
    
    return 0;
}