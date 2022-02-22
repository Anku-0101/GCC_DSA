#include<bits/stdc++.h>

using namespace std;

TreeNode* LCA(TreeNode *root, TreeNode *p, TreeNode *q)
{
    if(root == NULL || root == p || root == q)
        return root;
    
    TreeNode* left = LCA(root->left, p, q);
    TreeNode* right = LCA(root->right, p, q);

    if(left == NULL)
        return right;
    
    if(right == NULL)
        return left;
    
    else // both left and right are not null
    {
        return root;
    }
}