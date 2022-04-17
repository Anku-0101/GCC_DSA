#include<stdio.h>

void ReverseArray(int arr[], int start, int end){
    if(start >= end)
        return;
    
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;

    ReverseArray(arr, start+1, end-1);
}

int main(){
    int t;
    scanf("%d", &t);
    int itr = t;
    while(itr--){
        int size;
        scanf("%d", &size);
        int arr[size];
        for(int i = 0; i < size; i++)
            scanf("%d", &arr[i]);
        int res = 0;
        for(int i = 0; i< size-1; i++){
            int minIndex = i;
            int minM = arr[minIndex];
            for(int j = i; j<size; j++){
               if(minM > arr[j]){
                   minIndex = j;
                   minM = arr[j];
               }
            }
            // int temp = arr[i];
            // arr[i] = arr[minIndex];
            // arr[minIndex] = temp;
            res += minIndex - i + 1;
            
            ReverseArray(arr, i, minIndex);
        }

        printf("Case #%d: %d\n", t-itr, res);
    }
    return 0;
}