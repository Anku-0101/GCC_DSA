#include<bits/stdc++.h>

using namespace std;

int createPalindrome(int input, int b, bool isOdd)
{
    int n = input;
    int palin = input;
 
    // checks if number of digits is odd or even
    // if odd then neglect the last digit of input in
    // finding reverse as in case of odd number of
    // digits middle element occur once
    if (isOdd)
        n /= b;
 
    // Creates palindrome by just appending reverse
    // of number to itself
    while (n > 0)
    {
        palin = palin * b + (n % b);
        n /= b;
    }
    return palin;
}

int main(){

    

    long n = 100002;
    vector<int> arr;
    
    // Run two times for odd and even length palindromes
    for (int j = 0; j < 2; j++)
    {
        // Creates palindrome numbers with first half as i.
        // Value of j decided whether we need an odd length
        // of even length palindrome.
        int i = 1;
        int number;
        while ((number = createPalindrome(i, 10, j % 2)) < n)
        {
            arr.push_back(number);
            i++;
        }
    }
    sort(arr.begin(), arr.end());

    // for(int i =0; i<100; i++)
    //     cout<<arr[i]<<" ";
    
   

    int t;
    cin>>t;
    int itr = t;
    while(itr--){
        long num;
        cin>>num;

        int count = 0;
        int index = 0;
        while(1){
            if((num % arr[index])== 0){
                //cout<<"arr[index] = "<<arr[index];
                count++;
                index++;
                //cout<<"count = "<<count<<"\n";
                //cout<<"index = "<<index<<"\n";
            }
            else{
                index++;
            }
            if(arr[index] > num)
                break;
            
            
        }

        cout<<"Case #"<<t-itr<<": "<<count<<"\n";
    }
    
    return 0;
}