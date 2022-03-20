#include<bits/stdc++.h>

using namespace std;


void FindFirstAndSecondMax(vector<int> arr)
{
    int first = arr[0];
    int second = arr[0];

    for(int i = 0; i<arr.size(); i++)
    {
        if(arr[i] > first)
        {
            int temp = first;
            first = arr[i];
            second = temp;
        }

        if(arr[i]<first && arr[i] > second)
            second = arr[i];
    }

    cout<<"first max = "<<first<<"\n";
    cout<<"second max = "<<second<<"\n";
}

int main()
{
    vector<int> nums;
    cout<<"Enter number of elements in the array";
    int n;
    cin>>n;

    for(int i = 0; i<n; i++){
        int x;
        cin>>x;
        nums.push_back(x);
    }
    
    FindFirstAndSecondMax(nums);
}