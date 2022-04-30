#include<bits/stdc++.h>

using namespace std;

/* 1, 5, 7
        18
        /
       17
       /
*/

int GetMinCoins(int n, int arr[], int types, int dp[]){
    if(n == 0)
        return 0;
    
    int ans = INT_MAX;
    
    for(int i = 0; i<types; i++){
        if(n-arr[i] >= 0){
            int sub_ans;
            if(dp[n-arr[i]] == -1){
                sub_ans = GetMinCoins(n-arr[i], arr, types, dp);
            }
            else{
                sub_ans = dp[n-arr[i]];
            }
            if(sub_ans < ans){
                ans = sub_ans +1;
            }
        }
    }
    return dp[n] = ans;
}


int main(){
    int types;
    cout<<"Enter type of coins \n"; cin>>types;
    int arr[types];
    cout<<"enter all "<<types<<" types of coin denominations \n";
    for(int i = 0; i<types; i++){
        cin>>arr[i];
    }
    int n; cout<<"Enter denomination \n"; cin>>n;

    int dp[n+1] = {-1};
    for(int i = 0; i<n; i++)dp[i] = -1;

    int res = GetMinCoins(n, arr, types, dp);
    cout<<"Minimum number of coins = "<<res<<"\n";

    for(int i = 0; i<n+1; i++)cout<<dp[i]<<" ";
    
    return 0;
}