#include <stdio.h>

int main()
{
    int a, b;
    scanf("%d%d", &a, &b);

    int i = 0;
    
    while(a <= b)
    {
        a = a*3;
        b = b*2;
        i++;
    }

    printf("%d", i);
    return 0;
}