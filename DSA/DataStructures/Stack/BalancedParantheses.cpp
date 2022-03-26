#include<bits/stdc++.h>
using namespace std;


bool CheckValidParanteses(string str){
    stack<char> bracket;
    
    for(int i = 0; str[i] != '\0'; i++){
        
        char ch = str[i];
        bool isValidString = false;
        
        if(ch == '(' || ch == '{' || ch == '['){
            bracket.push(ch);
            isValidString  = true;
        }
        else if(ch == ')' || ch == '}' || ch == ']'){
            
            isValidString = true;            
            if(bracket.empty()){
                return false;
            }
            char open = bracket.top();            
    
            bracket.pop();
            if(open == '(' && ch == ')'){
                continue;
            }
            else if(open == '[' && ch == ']'){
                continue;
            }
            else if(open == '{' && ch == '}'){
                continue;
            }
            return false;
        } 
        else if(!isValidString){
            cout<<"Invalid Input \n";
            return false;
        }
    }
    if(!bracket.empty()){
        return false;
    }

    return true;
}


int main(){
    
    string expression;
    cin>>expression;

    if(CheckValidParanteses(expression)){
        cout<<"valid \n";
    }
    else{
        cout<<"Invalid \n";
    }
    
    
    return 0;

}