#include<bits/stdc++.h>
using namespace std;

int main(){
    int t; cin>>t; 
    int itr = t;

    while(itr--){
        int len;
        cin>>len;
        string s;
        cin>>s;

        bool isNum = false;
        bool isUp = false;
        bool isSym = false;
        bool isLow = false;

        for(int i = 0; i<len; i++){
            if(s[i]>=65 && s[i] <= 90){
                isUp = true;
            }
            if(s[i] >= 97 && s[i] <= 122){
                isLow = true;
            }

            if(s[i] >= 48 && s[i] <= 57) // 0 = 48, 9 = 57
            {
                isNum = true;
            }

            if(s[i] == '#' || s[i] == '&' || s[i] == '*' || s[i] == '@'){
                isSym = true;
            }
        }

        if(!isNum)
            s += "1";

        if(!isUp)
            s += "A";

        if(!isSym){
            s += "*";
        }

        if(!isLow){
            s += "a";
        }

        while (s.size()<7)
        {
            s += "Z";
        }
        
        cout<<"Case #"<<t-itr<<": "<<s<<"\n";

    }
    return 0;
}