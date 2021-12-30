#include <stdio.h>

int main(void) {
	char str[20];
    scanf("%s", str);
    
    int index =0;
    
     while(str[index++] != '\0')
     {
        printf("%d\n",index);
     }
     
      str[index-1] = 1 + '0';
      str[index] = '\0';
      printf("%s\n",str);
	return 0;
}

// 54313110038 : Yes bank finance charge reversal 
