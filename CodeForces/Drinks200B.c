#include<stdio.h>

int main()
{
    int n;
    scanf("%d", &n);
    int arr[n];
    float ans = 0.0;
    
    for(int i =0; i<n; i++) scanf("%d", &arr[i]);
    
    for(int i =0; i<n; i++) ans += arr[i]*1.0/n;
    
    printf("%f", ans);
    return 0;
}