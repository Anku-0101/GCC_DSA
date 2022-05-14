#include<bits/stdc++.h>

using namespace std;

struct Node{
    struct Node* next;
    int data;
};

Node* NewNode(int data){
    struct Node* newNode = new Node();
    newNode->data = data;
    newNode->next = NULL;
    return newNode;
}

Node* Insert(Node* head, int data){
    if(head == NULL){
        return NewNode(data);
    }
    else{
        Node* tmp = head;
        while(tmp->next!=NULL){
            tmp = tmp->next;
        }
        tmp->next = NewNode(data);
    }

    return head;
}

void print(Node* head){
    while(head != NULL){
        cout<<head->data<<" ";
        head = head->next;
    }
    cout<<"\n";
}
Node* ReverseInPairs(Node* head, int k){
    if(head == NULL){
        return NULL;
    }
    int len = k;
    Node* curr = head;
    Node* prev = NULL;
    Node* next = NULL;
    while(len-- && curr != NULL){
        next = curr->next;
        curr->next = prev;
        prev = curr;
        curr = next;
    }
    head->next = ReverseInPairs(next,k);
    return prev;
    
}

Node* ReverseRecursive(Node* head){
    if(head->next == NULL){
        return head;
    }

    Node* tmp = ReverseRecursive(head->next);
    head ->next->next = head;
    head->next = NULL;
    return tmp;

}
int main(){
    Node* head;
    for(int i = 2; i<5000; i = 2*i){
        head = Insert(head,i);
    }

    print(head);
    /*
    int k;cout<<"enter number k = \n";
    cin>>k;
    head = ReverseInPairs(head,k);
    */
    head = ReverseRecursive(head);
    print(head);
    return 0;
}