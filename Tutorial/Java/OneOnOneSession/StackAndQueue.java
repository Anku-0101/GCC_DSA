import java.util.*;

class Main{
    public static void main(String[] args){
        Stack st = new Stack(5);
        st.push(2);
        System.out.println("top == " + st.top());
        st.push(1);
        System.out.println("top == " + st.top());
        st.pop();
        System.out.println("top == " + st.top());
        st.pop();
        System.out.println("top == " + st.top());
        st.pop();
        st.pop();
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);
        st.push(1000);
        System.out.println("top == " + st.top());

    }
}

class Stack{
    int[] arr;
    int top;
    int maxSize;

    Stack(int maxSize){
        this.maxSize = maxSize;
        arr = new int[maxSize];
        top = -1;
    }

    void push(int data){
        if((top+1) == maxSize){
            System.out.println("Stack overflow");
            return;
        }

        arr[++top] = data;
        System.out.println(data + " pushed to Stack");
    }

    void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty, nothing to pop");
            return;
        }
        System.out.println(top() + " is popped");
        top--;
    }

    int top(){
        if(!isEmpty())
            return arr[top];
        
        System.out.println("Stack is empty");
        return -1;
    }

    int size(){
        return top+1;
    }

    boolean isEmpty(){
        return (top==-1);
    }
}




////////////////////

class StackULinkedList {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(100);
        System.out.println("top == " + st.top());
        st.push(99);
        System.out.println("top == " + st.top());
        st.pop();
        System.out.println("top == " + st.top());
        st.pop();
        System.out.println("top == " + st.top());
        st.pop();
        st.pop();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        System.out.println("top == " + st.top());
    }
}

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

class Stack {
    Node top;
    int size;
    
    Stack() {
        top = null;
        size =0;
    }

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
        System.out.println(data + " pushed to Stack");
    }
    
    void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, nothing to pop");
            return;
        }
        System.out.println(top.data + " is popped");
        top = top.next;
        size--;
    }
    
    int top() {
        if (!isEmpty())
            return top.data;
            
        System.out.println("Stack is empty");
        return -1;
    }
    
    int size() {
        return size;
    }
    
    boolean isEmpty() {
        return top == null;
    }
}
