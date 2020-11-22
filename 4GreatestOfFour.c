#include <stdio.h>

int main()
{
    int n1, n2, n3, n4;
    for (int i = 0; i < 4; i++)
    {
        printf("Enter number %d  \n", i + 1);
        int temp;
        scanf("%d", &temp);

        switch (i + 1)
        {
        case 1:
            n1 = temp;
            break;
        case 2:
            n2 = temp;
            break;
        case 3:
            n3 = temp;
            break;
        case 4:
            n4 = temp;
            break;
        default:
            break;
        }
    }

    printf("Numbers are 1st %d \n 2nd %d \n 3rd %d \n 4th %d \n", n1,n2,n3,n4);
    int max1, max2;

    if(n1 >= n2) max1 = n1;
    else max1 = n2;

    if(n3 >= n4) max2 = n3;
    else max2 = n4;

    int ans = (max1 >= max2) ? max1 : max2;

    printf("Maximum of the numbers is %d \n ", ans);

    return 0;
}