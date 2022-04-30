#include<bits/stdc++.h>
using namespace std;

int main(){
    int divisor, divident;
    cout<<"Enter divident \n";
    cin>>divident;

    cout<<"Enter divisor \n";
    cin>>divisor;
    int res = 0;

    while(divident - divisor >=0){
        int count = 0;

        while((divident- (divisor <<1 << count)) >= 0){
            count++;
        }
        //cout<<"Value of count = "<<count<<"\n";
        res += 1<<count;
        divident -= divisor<<count;
    }
    cout<<"quotient = "<<res<<"\n";
    return 0;
}