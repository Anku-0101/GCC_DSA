#include<bits/stdc++.h>

using namespace std;

const int MAX_SIZE = 1024;
int arr[MAX_SIZE];

void swap(int &x, int &y)
{
    int temp = x;
    x = y;
    y = temp;
}

void Heapify(int size, int index)
{
    int left = 2*index;
    int right = 2*index+1;
    
    int largest = index;
    
    if(right <= size && arr[right] > arr[largest])
        largest = right;
    
    if(left <= size && arr[left] > arr[largest])
        largest = left;
    
    if(index != largest)
    {
        swap(arr[index], arr[largest]);
        Heapify(size, largest);
    }

}

void Sort(int size)
{
    for(int i = size; i>1; i--)
    {
        swap(arr[1], arr[i]);
        Heapify(i-1, 1);
    }
}
void Print(int size)
{
    for(int i = 1; i<=size; i++)
        cout<<arr[i]<<" ";
    
    cout<<endl;
}

int main()
{
    cout<<"enter array, enter -1 to break \n";
    int x ; cin>>x; int size = 0;
    arr[size++] = INT_MAX;
    while(x!=-1)
    {
        arr[size++] = x;
        cin>>x;
    }

    
    size = size-1;
    cout<<"Size is = "<<size<<"\n";

    for(int i = size/2; i>0; i--)
        Heapify(size,i);
    
    Print(size);
    cout<<"\n";
    Sort(size);
    Print(size);
}