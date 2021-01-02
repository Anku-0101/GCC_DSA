#include<stdio.h>

int main()
{
    int n;
    scanf("%d", &n);
    int x[n], y[n], z[n];
    int i = 0;
    int p = 0, q = 0, r = 0;

    int itr = 3*n;

    while (itr > 0)
    {
        if(i==3) i = 0;

        if(i%3 == 0) scanf("%d", &x[p++]);
        if(i%3 == 1) scanf("%d", &y[q++]);
        if(i%3 == 2) scanf("%d", &z[r++]);
        
        i++;
        itr--;
    }

    int x_sum = 0;
    int y_sum = 0;
    int z_sum = 0;

    for(int i = 0 ; i < n; i++)
    {
        x_sum += x[i];
        y_sum += y[i];
        z_sum += z[i];
    }
    
    //printf("X_SUM = %d Y_SUM = %d Z_SUM = %d \n", x_sum, y_sum, z_sum);
    if(x_sum == 0)
    {
        if((x_sum == y_sum) && (z_sum == y_sum)) printf("YES");
        else printf("NO");
    }
    else printf("NO");
}