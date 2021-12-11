#include<stdio.h>

// Returns 1 if the string matches else returns true
int StringComparer(char a[], char b[])
{
    int sizA = 0;
    int sizB = 0;

    while(a[sizA] != '\0' && b[sizB] != '\0')
    {
        if(a[sizA] != b[sizB])
            return 0;
        sizA++;
        sizB++;
    }
    if(a[sizA] == '\0' && b[sizB] == '\0')
        return 1;
    else
        return 0;    

    // while(b[sizB]!= '\0')
    //     sizB++;

    // if(sizA != sizB)
    //     return 0;
    
    // for(int i = 0; i<sizA; i++)
    // {
    //     if(a[i] != b[i])
    //         return 0;
    // }

    return 1;
}

//Copies char b to a 
void StringCopy(char a[], char b[])
{
    int size = 0; 
    
    while(b[size]!= '\0')
    {
        a[size] = b[size];
        size++;
    }
    a[size] = '\0';
        
}
int main()
{
   int n;
   scanf("%d",&n);
   char name[33];
   char map[100001][33];
   int hash[100001] = {0};
   int size  = 0;
   
   int i,j; 
    for(i = 0; i<n; i++)
    {
        scanf("%s", name);

        for(j = 0; j<size; j++)
            if(StringComparer(map[j], name) == 1)
                break;
                

        if(j == size)
        {
            printf("OK\n");
            StringCopy(map[size++], name);
        }
        else
        {
            hash[j]++;
            printf("%s%d\n",map[j],hash[j]);
        }

    }
   return 0;
}
