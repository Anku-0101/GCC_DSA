#include<bits/stdc++.h>

using namespace std;

int main(){
    priority_queue<int> pq;
    int n;cout<<"Enter size of array \n"; cin>>n;
    int arr[n];
    
    for(int i = 0; i<n; i++){
        cin>>arr[i];
        pq.push(arr[i]);
    }
    int k; cout<<"enter the kth largest element which needs to be found out \n"; cin>>k;

    int t = 0;
    while(t != k-1){
        if(!pq.empty()){
            pq.pop();
        }
        else{
            cout<<"kth largest element doesn't exist";
        }
        t++;
    }

    if(!pq.empty()){
        cout<<"kth largest element is = "<<pq.top();
    }
    else{
        cout<<"kth largest element doesn't exist";
    }

    return 0;
}