#include<bits/stdc++.h>

using namespace std;
// Heap data structure is present in STL as priority queue
// A heap is a complete Binary tree which satisfies Heap's property
const int  MAX_SIZE = 10241024;
int arr[MAX_SIZE];
int size = 1; // Heap starts from index = 1 

void Insert(int data)
{
    if(size == 0)
        size = 1;
        
    if(size > MAX_SIZE)
        return;
    
    arr[size] = data;
    int i = size; // place where data is inserted
    size++;

    while(i > 1)
    {
        int parent = i/2;
        
        if(parent < 1)
            return;

        if(arr[parent] < arr[i])
        {
            swap(arr[parent], arr[i]);
            i = parent;
        }            
        else
            return;
    }
}

void Delete() // In Heap by deletion, we delete the top most element only
{
    
    if(size>0)
    {
        size--;
        arr[1] = arr[size];
        int parent = 1;

        while (parent<size)
        {
            int left = 2*parent;
            int right = 2*parent+1;

            if(left >= size || right >= size )
                return;

            if(arr[left] > arr[right])
            {
                if(arr[parent] < arr[left])
                {
                    swap(arr[parent], arr[left]);
                    parent = left;
                }
                else
                    return;
            }

            else if(arr[left] < arr[right])
            {
                if(arr[parent] < arr[right])
                {
                    swap(arr[parent], arr[right]);
                    parent = right;
                }
                else
                    return;
            }
        }
        
    }
    else
    {
        cout<<"Empty Heap \n";
        return;
    }
        
}

void swap(int &x, int &y)
{
    int temp = x;
    x = y;
    y = temp;
}

void print()
{
    for(int i = 1; i<size; i++)
        cout<<arr[i]<<" ";
    
    cout<<endl;
}

int main()
{
    

    while(1)
    {
        cout<<"Enter 1. insert, 2. pop 3. print 4. break \n";
        int x; cin>>x;
        if(x == 1)
        {
            int y;
            cout<<"enter element to insert \n";
            cin>>y;
            Insert(y);
        }
        if(x == 2)
        {
            Delete();
        }
        if(x == 3)
        {
            print();
        }
        if(x == 4)
            break;
            
    }

    print();   
    return 0;

}



