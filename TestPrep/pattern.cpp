
#include <iostream>
using namespace std;

int main() {
    
    int n; cout<<"enter n \n"; cin>>n;
    cout<<"\n";
    for(int i = 1; i<=n; i++){
        for(int k = 1; k<=n-i; k++){
            //cout<<"for  i = "<<i<<"\n";
            cout<<" ";
        }
            
        for(int j = 1; j<=2*(i-1)+1; j++){
            cout<<"*";
        }
        cout<<"\n";
    }
    
    return 0;
}