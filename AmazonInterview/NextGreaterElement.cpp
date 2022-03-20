#include<bits/stdc++.h>

using namespace  std;

int ans[100];

void NextGreaterElement(int arr[], int n)
{
    
    for(int i = 0; i<100; i++)
        ans[i] = -1;
    
    stack<int> st;
    st.push(0);
    for(int i = 1; i<n; i++)
    {
        while(!st.empty() && arr[i] > arr[st.top()])
        {
            ans[st.top()] = arr[i];
            st.pop();
        }
        
        st.push(i);
        
    }
}

int main()
{
    int arr[] = {5,8,11,2,3,24,1,3,0,9,3};
    NextGreaterElement(arr,sizeof(arr)/sizeof(arr[0]));

    while(1)
    {
        cout<<"Enter Index of Element for NGE"<<"\n";
        int n;
        cin>>n;
        cout<<ans[n]<<"\n";
    }
}