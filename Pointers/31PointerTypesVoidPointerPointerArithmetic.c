#include<stdio.h>

/*
    int *       -> int 
    char *      -> char

    Why not use generic pointer for all data types
    --> During derefrencing the pointer variable of a paricular data type derefrences in
    the amount of the size of data type which is different for various data types.
*/
int main()
{
    int a = 1025;
    int *p;
    p = &a;

    printf("size of integer is %d bytes \n", sizeof(int));
    printf("Address = %d , value = %d \n", p, *p);
    // incrementing an int pointer will increment it to size of int data type which is 4 bytes 
    // for other data type the increment will be different, will depend on the size of 
    // data type to which the pointer is pointing 
    printf("Address = %d , value = %d \n", p+1, *(p+1));

    char *p0;
    p0 = (char*)p; // Typecasting
    printf("size of char is %d bytes \n", sizeof(char));
    printf("Address = %d, value = %d \n", p0, *p0);
    // incrementing a char pointer will increment it to size of char data type which is 1 byte 
    // for other data type the increment will be different, will depend on the size of 
    // data type to which the pointer is pointing 
    printf("Address = %d, value = %d \n", p0+1, *(p0+1));
    //1025 = 00000000 00000000 00000100 00000001

    // Void pointer - Generic pointer
    void *p1;
    p1 = p; // No need to typecasting as void pointer is generic pointer so can point to any pointer types

    printf("Address = %d \n", p1);
    
    // below two statements Gives compilation error as void pointer can't be 
    // derefrenced or incremented/decremented. 
    // This is due to the reason that compiler doesn't know by what amount of bytes it 
    // is required for derefrencing or incrementing as the pointer type is void!
    
    /*
    printf("value = %d", *p1);  
    printf("Address = %d", p1+1);
    */

   // Size of any pointer remains same as we are storing address in pointer variable
   // so it doesn't matter which pointer type we are having all of them store address only
   printf("size of of int pointer %d \n", sizeof(int*));
   printf("size of of char pointer %d \n", sizeof(char*));
   printf("size of of float pointer %d \n", sizeof(float*));

    return 0;
}