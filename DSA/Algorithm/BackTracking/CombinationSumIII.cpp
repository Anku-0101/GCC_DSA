#include<bits/stdc++.h>

using namespace std;
//216. Combination Sum III
/*
Find all valid combinations of k numbers that sum up to n such that the following conditions are true:

Only numbers 1 through 9 are used.
Each number is used at most once.
Return a list of all possible valid combinations. The list must not contain the same combination twice, and the combinations may be returned in any order.

 

Example 1:

Input: k = 3, n = 7
Output: [[1,2,4]]
Explanation:
1 + 2 + 4 = 7
There are no other valid combinations.
*/
void GetCombination(int k, int n, int start, vector<vector<int>> &res, vector<int> tmp){
    if(tmp.size() == k && n == 0){
        res.push_back(tmp);
        return;
    }

    for(int i = start; i<10; i++){
        tmp.push_back(i);
        
        if(n-i > -1)
            GetCombination(k,n-i,i+1,res,tmp);
        
        tmp.pop_back();
    }
}

vector<vector<int>> CombinationSum3(int k, int n){
    vector<vector<int>> res;
    vector<int> tmp;
    GetCombination(k,n,1,res,tmp);
    return res;
}

int main(){
    int k,n;
    cout<<"Enter k = \n"; cin>>k;
    cout<<"Enter n = \n"; cin>>n;
    vector<vector<int>> combinationSum = CombinationSum3(k,n);
    cout<<"size of combinationSum = "<<combinationSum.size()<<"\n";
    for(int i = 0; i < combinationSum.size(); i++){
        for(int j = 0; j < combinationSum[i].size(); j++){
            cout<<combinationSum[i][j]<<" ";
        }
        cout<<"\n";
    }
    return 0;
}