#include "BST.h"

int max(int a, int b)
{
    int x;
    return x = (a > b) ? a : b;  
}

int Height(struct Node* root)
{
    if(root == NULL)
        return -1;
    
    int leftHeight = Height(root->left);
    int rightHeight = Height(root->right);

    return max(leftHeight, rightHeight) + 1;
}

int main()
{
    struct Node* root = NULL;
    root = Insert(root, 4);
    root = Insert(root, 1);
    root = Insert(root, 5);
    root = Insert(root, 0);
    root = Insert(root, 12);
    root = Insert(root, 21);
    root = Insert(root, 11);
    root = Insert(root, 2);
    root = Insert(root, 31);
    root = Insert(root, 35);

    printf("Height of root node is = %d \n", Height(root));
}