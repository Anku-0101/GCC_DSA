#include<iostream>
#include<bits/stdc++.h>

using namespace std;

int sum(vector<int> v)
{
    int sum = 0;
    for(int i = 0; i<v.size(); i++)
    {
        sum += v[i];
        v[i]++;
    }
    
    return sum;
}

int main()
{
    vector<int> array;
    array.push_back(5);
    array.push_back(11);
    array.push_back(7);
    array.push_back(2);
    array.push_back(1);
    array.push_back(9);
    array.push_back(8);
    
    cout<<sum(array)<<"\n";
    cout<<sum(array)<<"\n";

    for(int i = array.size(); i>0; i++)
    {
        int windowSize = i;

    }

    return 0;
    
}