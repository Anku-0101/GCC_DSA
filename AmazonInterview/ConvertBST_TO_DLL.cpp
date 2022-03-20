#include<bits/stdc++.h>

using namespace std;

void convert(Node* p, Node* head)
{
    if(p==NULL)
        return;

    static Node* prev = NULL;

    convert(p->left, head);

    if(prev==NULL)
    {
        head = p;
        prev = head;
    }
    else
    {
        p->left = prev;
        prev->right = p;
    }
    prev = p;

    Convert(p->right, head);
}

int main()
{

}