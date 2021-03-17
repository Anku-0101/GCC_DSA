#include<stdio.h>

int main()
{
    int n;
    scanf("%d", &n);
    int arr[n];
    for(int i = 0; i < n; i++) scanf("%d", &arr[i]);

    int result = 0;
    int counter[5] = {0,0,0,0,0};
    
    for(int i = 0; i<n; i++) counter[arr[i]]++;    
    
    result += counter[4];
    int minm;
    if(counter[3] > counter[1]) 
    {
        minm = counter[1];
        counter[1] = 0;
        counter[3] -= minm;
    }
    else if(counter[1] > counter[3])
    {
        minm = counter[3];
        counter[3] = 0;
        counter[1] -= minm;
    }
    else if(counter[1] == counter[3])
    {
        minm = counter[3];
        counter[3] = 0;
        counter[1] = 0;
    }
    result += minm;
    result += counter[3];
    
    if(counter[2]%2 == 0)
    {
        result += counter[2]/2;
        counter[2] = 0;
    }
    else
    {   
        result += counter[2]/2;
        counter[2] = 1; 

        if(counter[1] > 0)
        {
            if(counter[1] == 1)
            {
                result++;
                counter[1] = 0;
                counter[2] = 0;
            }
            else
            {
                result++;
                counter[1] -= 2;
                counter[2] = 0;
            }
        }
    }
    
    result += counter[2];
    if(counter[1]%4 == 0) result += counter[1]/4;
    else result += counter[1]/4 + 1;    

    
    //for(int i = 0; i < 5; i++) printf("%d", counter[i]);

    /*
    5 - 1 2 4 3 3 
    1 0 
    3 0 
    7 1 4
    7 2 3
    6 3 2  
    */
    printf("%d", result);
    return 0;
}