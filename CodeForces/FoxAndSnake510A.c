#include<stdio.h>

// Recursive Implementation 

void DrawPattern(int n, int m, int flag)
{
    if(n== 0) return;
    if(n%2 != 0 )
    {
        for(int i =0; i<m; i++)printf("#");
        printf("\n");
    }
    else if(n%2 == 0 && flag == 1)
    {
        for(int i = 0; i<m-1; i++)printf(".");
        printf("#\n");
        flag = 0;
    }
    else if(n%2 == 0 && flag == 0)
    {
        printf("#");
        for(int i = 0; i<m-1; i++)printf(".");
        printf("\n");
        flag = 1;
    }
    DrawPattern(n-1,m,flag);
}

int main()
{
    int n,m;
    scanf("%d%d",&n,&m);
    int flag = 1;

    DrawPattern(n,m,1);

}


// Iterative Implementation 
/*
int main()
{
    int n,m;    
    scanf("%d%d",&n,&m);
    int flag = 1;
    
    while(n>0)
    { 
        int x = m;
        
        if(n %2 != 0)
        {
            while(x > 0)
            {
                printf("#");
                x--;
            }
            printf("\n");
        }

        else if((n%2 == 0) && (flag == 1))
        {
            while(x-1 > 0)
            {
                printf(".");
                x--;
                
            }
            printf("#\n");
            flag = 0;
        }
        else if((n%2 == 0) && (flag == 0))
        {
            printf("#");
            while(x-1 > 0)
            {
                printf(".");
                x--;
            }
            printf("\n");  
            flag = 1;
        }
        n--;
    }
    return 0;
}
*/