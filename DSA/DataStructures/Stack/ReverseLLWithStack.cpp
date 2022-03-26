#include<bits/stdc++.h>
using namespace std;

struct Node{
    int data;
    Node* next;
};

Node* Insert(int x, Node* head){
    Node* newNode = (Node*)malloc(sizeof(Node));
    newNode->data = x;
    newNode->next = head;
    head = newNode;
    return head;
}

void print(Node* head){
    while(head != NULL){
        printf("%d ", head->data);
        head = head ->next;
    }
    printf("\n");
}

Node* Reverse(Node* head){
    stack<Node*> nodes;
    Node* temp = head;

    while(temp!=NULL){
        nodes.push(temp);
        temp=temp->next;
    }
    temp = nodes.top(); head = temp; nodes.pop();
    while(!nodes.empty()){
        temp->next = nodes.top();
        nodes.pop();
        temp = temp->next; 
    }
    temp->next = NULL;
    return head;
}

int main(){
    Node* head = NULL;
    head = Insert(3,head);
    head = Insert(4,head);
    head = Insert(8,head);
    head = Insert(5,head);
    print(head);
    
    head = Reverse(head);
    print(head);
    
    return 0;
}