#include<stdio.h>
#include<iostream>
using namespace std;
int main()
{
    int a[100],n,i,j;
    int percent;
    int count;
    cout<<"Enter the value of n(size):\n";
    cin>>n;
    cout<<"Enter the elements of an array:\n";
    for(i=0;i<=n-1;i++)
    {
       cout<<"a["<<i<<"]"<<"=";
       cin>>a[i];
    }
    for( i=0;i<n;i++)
    { 
        count=0;
       for(j=0;j<n;j++)
       {  
              if((a[i]>=a[j])&&(i != j))
                 count=count+1;
        }
        percent=(count*100)/(n-1);
       cout<<"\nThe percentile of "<<a[i]<<"="<<percent;
    }     
}