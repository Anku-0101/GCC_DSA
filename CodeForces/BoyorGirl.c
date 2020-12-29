#include <stdio.h>

int main()
{
    char uName[100];
    scanf("%s", uName);

    int arr[123];
    for(int i = 0; i < 123; i++)
    {
        arr[i] = 0;
    }

    int i = 0;
    int val;
    
    while(uName[i] != '\0')
    {
        val = (int)uName[i];
        if(arr[val] == 0) arr[val] = 1;
        i++;
    }

    int res = 0;
    for(int i = 0; i < 123; i++)
    {
        res = res + arr[i];
    }
    
    if(res%2 != 0)printf("IGNORE HIM!");
    else printf("CHAT WITH HER!");
    return 0;
}