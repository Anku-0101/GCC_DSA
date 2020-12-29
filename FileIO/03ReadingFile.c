#include<stdio.h>

int main()
{
    FILE *ptr;
    int num;
    int num2;

    ptr = fopen("sample1.txt", "r");

    if(ptr == NULL)
    {
        printf("The file doesn't exist \n");
    }
    else
    {
        fscanf(ptr, "%d", &num);
        fscanf(ptr, "%d", &num2);

        fclose(ptr); // Closes the file, save resources 

        printf("The value of num is %d \n", num);
        printf("The value of num is %d \n", num2);   
    }

    return 0;
}