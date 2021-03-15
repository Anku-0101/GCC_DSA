#include<stdio.h>

int main()
{
    int n; 
    scanf("%d", &n);
    char str[n+1];
    scanf("%s", str);
    int a =0, d =0;

    for(int i = 0 ; i<n; i++)
    {
        if(str[i] == 'A')a++;
        if(str[i] == 'D')d++;
    }

    if(a == d)printf("Friendship");
    if(a > d)printf("Anton");
    if(a < d)printf("Danik");
    
    return 0;
}