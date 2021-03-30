#include<stdio.h>

int main()
{
   int n;
   scanf("%d",&n);
   char str[n+1];
   scanf("%s",str);
   int arr[100];
   for (int i = 0; i < 100; i++)arr[i] = 0;
   for(int i =0; i<n; i++)
   {
       if(str[i]>90)str[i] -=32;
       arr[str[i]]++;
   }
   int flag = 0;
   for(int i =65; i<=90; i++)
   {
       if(arr[i] ==0)
       {
           flag = 1;
           printf("NO");
           break;
       }
   }
   if(flag == 0)printf("YES");
   

    return 0;
}