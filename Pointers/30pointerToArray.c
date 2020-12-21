#include<stdio.h>

int main()
{
    int arr[5]  = {8, 4, 77, -2, 11};
    int* ptr;
    ptr = arr;

    printf("%d \n ", arr);
    printf("%d \n ", &arr);
    printf("%d \n", &arr[0]);
    printf("%d \n", arr[0]);

    int arr3D[7][6][5];

    printf("%d \n", arr3D);
    printf("%d \n", &arr3D);

    return 0;
}