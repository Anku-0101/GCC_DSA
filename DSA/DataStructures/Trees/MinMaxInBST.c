#include<stdio.h>
#include<stdlib.h>
#include<limits.h>

struct Node
{
    int data;
    struct Node* right;
    struct Node* left;
};

struct Node* GetNewNode(int data)
{
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->left = NULL;
    newNode->right = NULL;

    return newNode;
}

struct Node* Insert(struct Node* root, int value)
{
    if(root == NULL)
        root = GetNewNode(value);
    
    else if(root->data >= value)
        root->left = Insert(root->left, value);
    
    else
        root->right = Insert(root->right, value);

    return root;
}

int MaxInTree(struct Node* root)
{
    int max = INT_MIN;
    
    while (root!=NULL)
    {
        if(root->data > max)
            max = root->data;
        
        root = root->right;
    }   

    return max;
}

int MinInTree(struct Node* root)
{
    int min = INT_MAX;
    
    while (root!=NULL)
    {
        if(root->data <  min)
            min = root->data;
        
        root = root->left;
    }

    return min;
}

int main()
{
    struct Node* root = NULL;

    root = Insert(root, 0);
    root = Insert(root, 1);
    root = Insert(root, 13);
    root = Insert(root, 2);
    root = Insert(root, 11);
    root = Insert(root, 5);
    root = Insert(root, 6);
    root = Insert(root, 88);
    root = Insert(root, 21);
    root = Insert(root, 9);
    root = Insert(root, 4);
    root = Insert(root, 1);
    root = Insert(root, -24);
    root = Insert(root, 13);

    printf("Max in tree = %d \n", MaxInTree(root));
    printf("Min in tree = %d \n", MinInTree(root));

    return 0;
}