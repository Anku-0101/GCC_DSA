#include<stdio.h>

int StringLenght(char *inp)
{
    char *ptr = inp;
    int len = 0;
    while(*ptr != '\0')
    {
        len++;
        ptr++;
    }
    return len;
}

int main()
{
    int cases;
    scanf("%d", &cases);
    

    while(cases > 0)
    {
        char str[100];
        scanf("%s",str);
        //printf("Entered string is %s \n", str);
        int len = StringLenght(str);
        //printf("length of input string is %d\n", len);

        if(len < 11) printf("%s\n", str);
        else
        {
            int i = 0;
            char ans[10];
            ans[i++] = str[0];

            int lenToInsert = len - 2;

            int noOfDigit = 0;
            int ones = 0;
            int tens = 0;

            // Here number of characters is upto 100 so this is used if the length would have 
            // been more than we need to insert the letters from unit place and then reverse 
            // the string
            while(lenToInsert > 0)
            {
                ++noOfDigit;
                if(noOfDigit == 1) ones = lenToInsert % 10;
                if(noOfDigit == 2) tens = lenToInsert % 10;

                lenToInsert = lenToInsert/10; 
            }

            if(noOfDigit == 1)
            {
                ans[i++] = ones + '0';
                ans[i++] = str[len - 1];
            }
            else if(noOfDigit == 2)
            {
                ans[i++] = tens + '0';
                ans[i++] = ones + '0';
                ans[i++] = str[len - 1];
            }
            ans[i++] = '\0';
            printf("%s\n", ans);   
        }
        cases--;
    }
    return 0;
}