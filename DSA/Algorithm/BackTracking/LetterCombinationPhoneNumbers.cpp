#include<bits/stdc++.h>

using namespace std;
string text[10] = {"","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};


void backTrack(string digits, int idx, vector<string> &res, string s){
    if(idx == digits.size()){
        res.push_back(s);
        return;
    }

    string str = text[digits[idx] - '0'];

    for(int i = 0; i<str.size(); i++){
        backTrack(digits, idx+1, res, s + str[i]);
    }
}

vector<string> LetterCombination(string digit){
    if(digit.size() == 0){
        return {};
    }
    vector<string> res;

    backTrack(digit, 0, res,"");

    return res;
}




int main(){
    string digits; 
    cin>>digits;

    vector<string> res = LetterCombination(digits);

    if(res.size() == 0){
        cout<<"No combination formed \n";
    }

    for(int i = 0; i<res.size(); i++){
        cout<<res[i]<<" ";
    }
    cout<<"\n";
    return 0;
}

