#include<bits/stdc++.h>
using namespace std;
/*
Given an integer n, return the number of strings of length n that consist only of vowels (a, e, i, o, u) and are lexicographically sorted.

A string s is lexicographically sorted if for all valid i, s[i] is the same as or comes before s[i+1] in the alphabet.

 

Example 1:

Input: n = 1
Output: 5
Explanation: The 5 sorted strings that consist of vowels only are ["a","e","i","o","u"].
Example 2:

Input: n = 2
Output: 15
Explanation: The 15 sorted strings that consist of vowels only are
["aa","ae","ai","ao","au","ee","ei","eo","eu","ii","io","iu","oo","ou","uu"].
Note that "ea" is not a valid string since 'e' comes after 'a' in the alphabet.
*/
int countVowelStrings(int n) {
        int a=1,e=1,i=1,o=1,u=1;
        
        while(--n){
            o += u;
            i += o;
            e += i;
            a += e;
        }
        
        return a+e+i+o+u;
    }


    string vowels[5] = {"a","e","i","o","u"};
    int ans;
    int countVowelStrings(int n) {
        if(n == 0){
            return 0;
        }
        ans = 0;
        //vector<string> res;
        GetOrder(n, "");
        //for(int i = 0; i<res.size(); i++){
        //    cout<<res[i]<<" ";
        //}
        //cout<<"\n";
        //return res.size();
        return ans;
    }
    
    void GetOrder(int n, string s){
        //cout<<"entering the method for str  = "<<s<<"\n";
        if(s.size() == n){
            ans++;
            return;
        }
        int startIndex = GetIndex(s);
        //cout<<"startIndex   = "<<startIndex<<"\n";
        for(int i = startIndex; i<5; i++){
            //cout<<"for loop itr = "<<i<<" value of string = "<<s+vowels[i]<<"\n";
            GetOrder(n, s + vowels[i]);
        }
    }
    
    int GetIndex(string s){
        //cout<<"entering helper method s = "<<s<<"\n";
        if( s.size() == 0){
            return 0;
        }
        int n = s.size();
        if(s[n-1] == 'a'){
            return 0;
        }
        
        if(s[n-1] == 'e'){
            return 1;
        }
        if(s[n-1] == 'i'){
            return 2;
        }
        if(s[n-1] == 'o'){
            return 3;
        }
        if(s[n-1] == 'u'){
            return 4;
        }
        
        return -1;
    }