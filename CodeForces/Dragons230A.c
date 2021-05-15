#include<stdio.h>
void BubbleSort(int arr[][2], int n)
{
    for(int i =0; i<n-1; i++)
    {
        for(int j = 0; j<n-i-1; j++)
        {
            if(arr[j][0] > arr[j+1][0])
            {
                int temp1 = arr[j+1][0];
                int temp2 = arr[j+1][1];

                arr[j+1][0] = arr[j][0];
                arr[j][0] = temp1;

                arr[j+1][1] = arr[j][1];
                arr[j][1]  = temp2;
            }
        }
    }
}

int main()
{
    int s;
    scanf("%d",&s);
    int n;
    scanf("%d",&n);
    
    int x[n];
    int y[n];
    int data[n][2];
    
    for(int i =0; i<n; i++)
    {
        scanf("%d",&data[i][0]);
        scanf("%d",&data[i][1]);
        //data[i][2] = data[i][1] - data[i][0];
    }
    
    BubbleSort(data, n);
    
    /*
    for(int i =0; i<n; i++)
    {
        printf(" x = %d  ",data[i][0]);
        printf(" y = %d ",data[i][1]);
        //printf(" diff = %d \n", data[i][2]);
    }
    */

    int flag = 0;
    for(int i =0; i<n; i++)
    {
        if(data[i][0] >= s)
        {
            flag = 1;
            printf("NO");
            break;
        }
        else
        {
            s += data[i][1];
        }
    }
    if(flag == 0)printf("YES");
    return 0;
}

/*

#include<stdio.h>
int main()
{
	int n,s,x[1000],y[1000],i,r=0;
	scanf("%d %d",&s,&n);
	for(i=0;i<n;i++)scanf("%d %d",&x[i],&y[i]);
	for(i=0;i<n;i++)
	{
		if(s>x[i]&&x[i]!=0)
		{
			s+=y[i];
			x[i]=0;
			i=-1;
			r+=1;
		}
	
	}
	if (r==n) printf("YES");
	else printf("NO");
}
*/