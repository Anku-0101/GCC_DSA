#include<bits/stdc++.h>
using namespace std;

int LargestInteger(int num){
int n = num;
        int size = 0;
        while(n > 0){
            size++;
            n = n/10;
        }
        bool arr[size];
        n = num;
        int i = 1;
        priority_queue<int> odd, even;
        while(i <= size){
            int dig = n%10;
            n = n/10;
            
            if(dig%2 == 0){
                arr[size-i] = true;
                even.push(dig);
            }
                
            else{
                arr[size-i] =false;
                odd.push(dig);
            }
                
            i++;
        }
        int res = 0;
        for(int i = 0; i<size; i++){
            res = res*10;
            if(arr[i]){
                res += even.top();
                even.pop();
            }
            else{
                res += odd.top();
                odd.pop();
            }
        }
        return res;
}

int main(){
    int num;
    cin>>num;
    cout<<"res = ";
    cout<<LargestInteger(num);
    return 0;

}