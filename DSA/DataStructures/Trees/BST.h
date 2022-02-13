#include<stdio.h>
#include<stdlib.h>


struct Node
{
    int data;
    struct Node* left;
    struct Node* right;
};

struct Node* GetNode(int data)
{
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->left = NULL;
    newNode->right = NULL;

    return newNode;
}

struct Node* Insert(struct Node* root, int data)
{
    if(root == NULL)
        root = GetNode(data);
    
    else if(data <= root->data)
        root->left = Insert(root->left, data);
    
    else
        root->right = Insert(root->right, data);
    
    return root;
    
}

// if element found return Y else return N

char Search(struct Node* root, int data)
{
    if(root == NULL)
        return 'N';
    
    else if(root->data == data)
        return 'Y';
    
    else if(data < root->data)
       return Search(root->left, data);
    
    else
        return Search(root->right, data);
}
