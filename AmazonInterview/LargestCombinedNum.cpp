#include <bits/stdc++.h>

bool StringComparator(string s1, string s2){
    string first = s1+s2;
    string second = s2+s1;
    
    int i =0;
    if(first[i] != '\0'){
        if(first[i] > second[i])
            return true;
        
        if(first[i] < second[i])
            return false;
    }
    return false; //both are equal
}
int main(){
    vector<string> nums;
    for(int i = 0; i<nums.size(); i++){
        for(int  j = i+1; j<nums.size(); j++){
            if(StringComparator(nums[i], nums[j])) // XY > YX
                continue;
            else{
                // swap the numbers to get the max..
                string temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
    }        
}