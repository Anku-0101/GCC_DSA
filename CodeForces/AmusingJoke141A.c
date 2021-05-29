#include<stdio.h>

int main()
{
    char str1[101];
    char str2[101];
    char str3[101];
    scanf("%s%s%s",str1,str2,str3);
    int arr1[91],arr2[91];
    
    for (int i = 0; i < 91; i++)
    {
        arr1[i] = 0;
        arr2[i] = 0;
    }

    for(int i =0; str1[i]!='\0'; i++)arr1[str1[i]]++;
    for(int i =0; str2[i]!='\0'; i++)arr1[str2[i]]++;
    for(int i =0; str3[i]!='\0'; i++)arr2[str3[i]]++;

    int flag = 0;
    for(int i =0; i<91; i++)
    {
        if(arr1[i] != arr2[i])
        {
            printf("NO");
            flag = 1;
            break;
        }
    }
    if(flag == 0)
    {
        printf("YES");
    }
    
    return 0;
}