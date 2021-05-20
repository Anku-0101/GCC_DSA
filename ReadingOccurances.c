#include<stdio.h>

int main()
{
    int arr[47];
    for(int i =0; i<47; i++) arr[i] = 0;

    

    FILE *ptr;
    int num;
    ptr = fopen("seq1.txt","r");
    
    fscanf (ptr, "%d", &num);    
    while (!feof (ptr))
    {  
      arr[num]++;
      fscanf (ptr, "%d", &num);      
    }
    
    fclose (ptr);    
    // while(c != EOF)
    // {
    //     printf("%d",(int)c);
    //     arr[(int)c]++;
    //     c = fgetc(ptr);
    // }

    for(int i = 1; i<47; i++)printf("Count of %d is %d \n", i , arr[i]);
    // return 0;
}