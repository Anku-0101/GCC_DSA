#include "BST.h"
#include<iostream>
#include<queue>

using namespace std;
//LEVEL ORDER IS ALSO KNOWN AS BREADTH FIRST SEARCH

/*
            A
           / \
          B   C
         /\   /\ 
        D E  F  G
    
    LEVEL ORDER : A B C D E F G          
*/

// Storing the elements in the queue and popping them as the tree progresses


void LevelOrder(struct Node* root)
{
    if(root == NULL)
        return;
    
    queue<Node*> Q;
    Q.push(root);

    while(!Q.empty())
    {
        Node *current = Q.front();
        cout<<current->data<<" ";
        if(current->left != NULL)Q.push(current->left);
        if(current->right != NULL)Q.push(current->right);
        Q.pop();
    }
}

int main()
{
    struct Node* root = NULL;
    root = Insert(root, 13);
    root = Insert(root, 11);
    root = Insert(root, 18);
    root = Insert(root, 8);
    root = Insert(root, 21);
    root = Insert(root, 10);
    root = Insert(root, 2);

    LevelOrder(root);
}