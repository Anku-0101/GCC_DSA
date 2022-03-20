#include<iostream>
#include "BST.h"

using namespace std;


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

    return 0;
}