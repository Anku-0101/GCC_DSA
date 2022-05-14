#include<bits/stdc++.h>

using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int arr[n];
        for(int i = 0; i<n; i++)cin>>arr[i];

        int opr = 0;

        if(n==1){
            cout<<0<<"\n";
            continue;
        }
        int flag = 1;
        for(int i = n-1; i>0; i--){
            if(arr[i] == 0 && i !=1){
                cout<<-1<<"\n";
                flag = 0;
                break;
            }

            if(arr[i-1] >= arr[i]){
                while(arr[i-1] >= arr[i]){
                    arr[i-1] /= 2;
                    opr++;
                }
                
            }

            if(arr[i-1] == 0 && i != 1){
                    cout<<-1<<"\n";
                    flag = 0;
                    break;
            }
        }

        if(flag == 1)
            cout<<opr<<"\n";
    }
    return 0;
}