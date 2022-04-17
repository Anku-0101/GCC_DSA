#include<bits/stdc++.h>

using namespace std;

int main(){
    string x, y;
    cin>>x>>y;
    cout<<"Size of x = "<<x.size()<<" Size of y = "<<y.size()<<"\n";
    if(x.size() != y.size()){
        cout<<"given strings are not anagram";
        return 0;
    }

    unordered_map<char,int> frex, frey;
    for(int i = 0; i<x.size(); i++){
        if(frex.count(x[i]) == 0){
            frex[x[i]] = 1;
        }
        else if(frex.count(x[i]) >= 1){
            frex[x[i]]++;
        }
        
        if(frey.count(y[i]) == 0){
            frey[y[i]] = 1;
        }
        else if (frey.count(y[i]) >= 1){
            frey[y[i]]++;
        }
        
    }

    cout<<"Size of x  map = "<<frex.size()<<" Size of y map = "<<frey.size()<<"\n";
    if(frex.size() != frey.size()){
        cout<<"given strings are not anagram";
        return 0;
    }
    unordered_map<char,int>::iterator it1 = frex.begin();
    

    while(it1 != frex.end()){
        char key = it1->first;
        int value = it1->second;
        it1++;
        if(frey.count(key) == 0){
            cout<<"given strings are not anagram";
            return 0;
        }
        else if(frey[key] == value){
            cout<<"Passed for key = "<<key<<" And Value = "<<value<<"\n";
        }
        else{
            cout<<"given strings are not anagram";
            return 0;
        }
    }

    cout<<"Given strings are anagrams";
    return 0;
}