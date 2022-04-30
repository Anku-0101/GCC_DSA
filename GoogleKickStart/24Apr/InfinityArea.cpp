#include<bits/stdc++.h>

using namespace std;

string longDivision(string number, int divisor)
{

    int index = number.size()-8;
    
    string res = "";
    for(int i = 0; i<number.size(); i++){
        res += number[i];
        
        if(i == index)
            res += '.';

    }

    return res;
    // string ans;
 
   
    // int idx = 0;
    // int temp = number[idx] - '0';
    // while (temp < divisor)
    //     temp = temp * 10 + (number[++idx] - '0');
 
    
    // while (number.size() > idx) {
        
    //     ans += (temp / divisor) + '0';
 
    //     temp = (temp % divisor) * 10 + number[++idx] - '0';
    // }
 
    
    // if (ans.length() == 0)
    //     return "0";
    
    
   
}

int main(){
    int t;
    cin>>t;
    int itr = t;

    long long pi = 31415927;

    while(itr--){
        int r,a,b;
        cin>>r>>a>>b;

        if(r < 1){
            cout<<"Case "<<"#"<<t-itr<<": "<<0<<"\n";
        }

        long long area = 0;
        int right = r;
        int left = right*a;

        area += right*right;
        
        while(1){
            area +=  left*left;

            right = left/b;
            if(right > 0){
                area += right*right;
            }
            else{
                break;
            }
            left = right*a;
        }

        area = area*pi;
        string num = to_string(area);
        int factor = 1e7;
        //area = area/factor;
        string str =  longDivision(num, factor);
        cout<<"Case "<<"#"<<t-itr<<": "<<str<<"\n";

        /*
        string res = "";
        res += 'a';
        res += 'b';
        cout<<"res = "<<res<<"\n"; = ab
        */
    }
    
    return 0;

}