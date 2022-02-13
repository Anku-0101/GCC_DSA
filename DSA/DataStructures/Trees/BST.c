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
        Search(root->left, data);
    
    else
        Search(root->right, data);
}

int main()
{
    struct Node* root = NULL;
    root = Insert(root, 5);
    root = Insert(root, 0);
    root = Insert(root, 15);
    root = Insert(root, 31);
    root = Insert(root, 95);
    root = Insert(root, 15);
    root = Insert(root, 34);
    root = Insert(root, 11);
    root = Insert(root, 8);
    root = Insert(root, 7);

    for(int i = 0; i<5; i++)
    {
        printf("Enter Element to search \n");
        int num;
        scanf("%d", &num);

        char res = Search(root, num);

        if(res == 'Y')
            printf("Found \n");
        else 
            printf("Not Found \n");
    }
}