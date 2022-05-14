#include<bits/stdc++.h>
using namespace std;

int main(){
    int t; cin>>t;
    
    while(t--){
        int a,b,c,x,y;
        cin>>a>>b>>c>>x>>y;

        x = (a > x)? 0 : x-a;
        y = (b > y)? 0 : y-b;
        
        

        if(x+y <= c){
            cout<<"YES"<<"\n";
        }
        else{
            cout<<"NO"<<"\n";
        }
    }
    return 0;
}