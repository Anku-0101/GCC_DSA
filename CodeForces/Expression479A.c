#include<stdio.h>

int main()
{
    int a,b,c;
    scanf("%d%d%d",&a,&b,&c);

    int arr[6];

    arr[0] = a+b+c;
    arr[1] = a*(b+c);
    arr[2] = (a+b)*c;
    arr[3] = a+(b*c);
    arr[4] = a*b+c;
    arr[5] = a*(b*c);

    int maxm = -1;

    for(int i = 0 ; i<6; i++)   if(arr[i] > maxm) maxm = arr[i];
    
    printf("%d", maxm);
    return 0;
}