#include<bits/stdc++.h>

using namespace std;

int main(){
    int t;
    cin>>t;

    while(t--){
        string str;
        cin>>str;

        int x = str[0]; int y = str[1];
        //cout<<x<<" "<<y;
        int rank;

        if(x==97){
            rank = (y-97);
        }
        else{
            if(x < y){
                rank = (x-97)*25 + (y-97);
            }
            else if( x > y){
                rank = (x-97)*25 + (y-96);
            }
            
        }
        cout<<rank<<"\n";
        
    }
    return 0;
}