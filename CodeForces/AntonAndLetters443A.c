#include<stdio.h>

int main()
{
    char str[1001];
    scanf("%[^\n]",str);
    //printf("String is %s\n",str);
    int arr[128];
    for(int i =0; i<128; i++)arr[i] =0;

    for(int i =0; str[i]!='\0'; i++)if(str[i] != 32)arr[str[i]]++;
    
    // for (int i = 0; i < 128; i++)
    // {
    //     if(arr[i]>0)printf("value of index = %d and occurance = %d\n",i,arr[i]);
    // }
    
    int count = 0;
    for(int i =0; i<128; i++)if(arr[i]>0)count++;

    if(count > 3)printf("%d", count-3);
    else if(count == 3)printf("1");
    else printf("0");
    return 0;
}