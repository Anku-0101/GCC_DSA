#include<iostream>
#include "BST.h"

using namespace std;
/*
    DFS comprises of 3 ways 
    1. Preorder Traversal : <root><left><right>
    2. Inorder Traversal  : <left><root><right> : output for this traversal will be sorted
    3. Postorder Traversal : <left><right><root>
*/

void Preorder(Node* root)
{
    if(root == NULL)
        return;
    
    cout<<root->data<<" ";
    
    Preorder(root->left);
    Preorder(root->right);
}

void Inorder(Node* root)
{
    if(root == NULL)
        return;
    
    Inorder(root->left);
    printf("%d ", root->data);
    Inorder(root->right);
}

void PostOrder(Node* root)
{
    if(root == NULL)
        return;
    
    PostOrder(root->left);
    PostOrder(root->right);
    cout<<root->data<<" ";
}

int main()
{
    Node* root = NULL;
    root = Insert(root, 43);
    root = Insert(root, 32);
    root = Insert(root, 31);
    root = Insert(root, 39);
    root = Insert(root, 7);
    root = Insert(root, 11);
    root = Insert(root, 34);
    root = Insert(root, 22);
    root = Insert(root, 52);
    root = Insert(root, 19);
    root = Insert(root, 44);
    root = Insert(root, 59);
    
    cout<<"Inorder Traversal\n";
    Inorder(root);
    cout<<"\n";
    
    cout<<"Preorder Traversal \n";
    Preorder(root);
    cout<<"\n";

    cout<<"Postorder Traversal \n";
    PostOrder(root);
    cout<<"\n";


    return 0;
}