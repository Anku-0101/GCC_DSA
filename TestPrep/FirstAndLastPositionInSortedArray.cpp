#include<bits/stdc++.h>
using namespace std;

int FindIndex(int arr[], int n, int target, int isFirst){
    int start = 0;
    int end = n-1;
    int found = -1;
    while(start <= end){
        int mid = start + (end-start)/2;
        //cout<<"At the beg. "<<"\n";
        //cout<<"start = "<<start<<"Mid = "<<mid<<"End = "<<end<<"\n";
        if(arr[mid] == target){
            if(isFirst == 1){
                end = mid-1;
            }
            else if(isFirst == 0){
                start = mid+1;
            }
            found = mid;
        }
        else if(arr[mid] < target)
            start = mid+1;
        else
            end = mid -1;
        
        //cout<<"At the end. "<<"\n";
        //cout<<"start = "<<start<<"Mid = "<<mid<<"End = "<<end<<"\n";
    }

    return found;
}

int main(){
    int n;
    cout<<"Enter Size of array \n";
    cin>>n;
    int arr[n];
    for(int i = 0; i<n; i++){
        cin>>arr[i];
    }
    int target;
    cout<<"Enter the target element \n";
    cin>>target;
    int first = FindIndex(arr, n, target, 1);
    int last = FindIndex(arr,n, target, 0);
    cout<<"last index= "<<last;
    cout<<"first index = "<<first;//<<" Last Index = "<<last;
    return 0;
}