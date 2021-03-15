#include<stdio.h>

int checkDigits(int n)
{
    int arr[10] = {0, 0 , 0, 0, 0, 0, 0, 0, 0 , 0};

    while(n > 0)
    {
        int digit = n%10;
        arr[digit]++;
        n = n/10;
    }

    for(int i=0; i<10; i++)
    {
        if(arr[i] > 1)return 0;
    }

    return 1;
}
int main()
{
    int year;
    scanf("%d", &year);

    int res = year +1;
    while (checkDigits(res) != 1)
    {
        res++;
    }
    printf("%d", res);

    return 0;

}