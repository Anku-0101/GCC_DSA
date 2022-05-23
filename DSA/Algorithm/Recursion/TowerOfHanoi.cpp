#include<bits/stdc++.h>

using namespace std;

void TowerOfHanoi(int n, char a, char b, char c){
    if(n==0){
        return;
    }
    TowerOfHanoi(n-1, 'A', 'B', 'C');
    cout<<"Move disk "<<n<<" from "<<a<<" to "<<b<<"\n";
}

int main(){
    cout<<"Enter total number of disks in rod A \n";
    int n;
    cin>>n;
    TowerOfHanoi(n,'A','C','B');
    return 0;
}