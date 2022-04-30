#include<bits/stdc++.h>

using namespace std;

/* 1, 5, 7
        18
        /
       17
       /
*/

int GetMinCoins(int n, int arr[], int types){
    if(n == 0)
        return 0;
    
    int ans = INT_MAX;
    
    for(int i = 0; i<types; i++){
        if(n-arr[i] >= 0){
            int sub_ans = GetMinCoins(n-arr[i], arr, types); 
            
            if(sub_ans < ans){
                ans = sub_ans +1;
            }
        }
    }
    return ans;
}


int main(){
    int types;
    cout<<"Enter type of coins \n"; cin>>types;
    int arr[types];
    cout<<"enter all "<<types<<" types of coin denominations";
    for(int i = 0; i<types; i++){
        cin>>arr[i];
    }
    int n; cout<<"Enter denomination\n"; cin>>n;
    int res = GetMinCoins(n, arr, types);
    cout<<"Minimum number of coins = "<<res<<"\n";
    
    return 0;
}