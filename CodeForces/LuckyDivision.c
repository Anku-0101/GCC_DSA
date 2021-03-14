#include<stdio.h>

int main()
{
    /*
        4, 7, 
        47, 74, 44, 77
        444, 447, 474, 744, 477, 747, 774, 777
    */

   int luckyNum[14] = {4, 7, 47, 74, 44, 77,  444, 447, 474, 744, 477, 747, 774, 777 };
   int num;
   scanf("%d", &num);
   int res = 0;

   for(int i = 0 ; i<14; i++)
   {
       if(num % luckyNum[i] == 0)
       {
           res = 1;
           break;
       }
   }
   if(res == 1) printf("YES");
   else printf("NO");
    return 0;
}