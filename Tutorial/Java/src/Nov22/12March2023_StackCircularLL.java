class Main{
    public static void main(String[] args){
        Stack st = new Stack();
        System.out.println(st.isEmpty());
        st.push(4);
        st.push(10);
        st.push(8);
        st.push(3);
        System.out.println("top = " + st.top());
        System.out.println(st.isEmpty());
        System.out.println(st.size());
        st.pop();
        st.pop();
        System.out.println("top = " + st.top());
        System.out.println(st.size());

    } 
}

// Linkedlist implementation of stack
class Node{
    int data;
    Node next;
    Node(int val){
        data = val;
    }
}

class Stack{
    Node head;
    int size;
    Stack(){
        size = 0;
    }

    int top(){
        if(head == null){
            System.out.println("empty list");
            return -1;
        }
        return head.data;
    }
    // O(1)
    boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }

    // O(1)
    void push(int val){
        Node newNode = new Node(val);
        size++;
        if(head == null){
            head = newNode;
            return;
        }
        
        newNode.next = head;
        head = newNode;
    }

    // O(1)
    void pop(){
        if(head == null){
            System.out.println("Stack is empty");
            return;
        }
        Node tmp = head;
        head = head.next;
        tmp.next = null;
        size--;
    }

    // O(1)
    int size(){
        return size;
    }
}


/*
------------------------------
public static void main(String[] args){
        circularList cl = new circularList();
        // 1
        cl.InsertAtHead(1);
        cl.InsertAtHead(5);
        cl.print(cl.last);
        cl.InsertAtTail(9);
        cl.InsertAtTail(11);
        cl.InsertAtHead(2);
        cl.print(cl.last);
        cl.last = cl.Reverse(cl.last);
        cl.print(cl.last);*/
/*
        stack st = new stack(5);
        System.out.println(st.isEmpty());
        st.push(8);
        st.push(2);
        st.push(4);
        st.push(6);
        st.push(7);
        System.out.println("size = " + st.size() + " top element = " + st.top());
        st.push(5);
        st.pop();
        System.out.println("size = " + st.size() + " top element = " + st.top());
        st.pop();
        System.out.println("size = " + st.size() + " top element = " + st.top());
        st.pop();
        System.out.println(st.isEmpty());
        st.pop();        
}
*/
//1. stack implemented using array
class stack{
    private int top;
    private int arr[];
    private int max_size;

    stack(int size){
        this.max_size = size;
        arr = new int[size];
        top = -1;
    }

    int top(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    void push(int value){
        if((top + 1) == max_size){
            System.out.println("stack overflow");
            return;
        }
        arr[++top] = value;
    }

    void pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }
        top--;
    }
    int size(){
        return top+1;
    }
    boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }
}


class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        next = null;
    }
}

class circularList{
    Node last;

    void deleteNode(int value){
        // cl is empty
        // last.data == value, if last node is to be deleted and list has only last node, has more than one node
        // last.next.data == value , has only two node, more than 2 node 
        // in between last and head
        
        // if there's any doubt we'll discuss ?? 

    }

    void InsertAtHead(int value){
        Node newNode = new Node(value);
        if(last == null){
            last = newNode;
            last.next = last;
            return;
        }
        Node old_firstNode = last.next;
        newNode.next = old_firstNode;
        last.next = newNode;
    }
    
    Node Reverse(Node last){
        Node old_last = last;
        last = old_last.next; // last is pointing to head
        old_last.next = null;

        ReverseSLL(last);
        last.next = old_last;
        return last;
    }

    private Node ReverseSLL(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node curr = head;
        Node prev = null;
        Node next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    void InsertAtTail(int value){
        Node node = new Node(value);
        if(last == null){
            last = node;
            last.next = last;
            return;
        }
        node.next = last.next; // connected last node to head
        last.next = node; // connecting older last nodes' next to node
        last = node; // refrencing last to new last node
    }

    // printing from last node , last node -> firstNode -> 2nd node -> 3rd node
    void print(Node last){
        Node tmp = last;
        if(last != null){
            do{
                System.out.print(tmp.next.data + " ->");
                tmp = tmp.next;
            }
            while(tmp != last);
        }
        System.out.println();
    }
}
