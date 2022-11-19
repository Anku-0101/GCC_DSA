#include<stdio.h>


int BinarySearch(int arr[], int n, int x){
    int start = 0;
    int end = n-1;

    int itr = 0;
    while(itr++ < 8)
    {
        int mid = start + (end - start)/2; // To prevent overflow, better than (start + end)/2
        printf("Start = %d, mid = %d, end = %d\n",start,mid,end); 
        if(x == arr[mid]) return mid;
        else if(x < arr[mid]) end = mid -1;
        else start = mid + 1;
    }

    return -1;
}

int main(){
    int arr[] = {1,2,3,4,5};
    BinarySearch(arr,5,6);

    return 0;
}