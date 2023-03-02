

class Main {  
    public static void main(String args[]) {
        /*
        student aman = new student("Aman Kr.", 25);
        System.out.println( aman.GetName());
        System.out.println(aman.toString());
        System.out.println(aman.hashCode());*/
        
        LinkedList list = new LinkedList();
        list.printLinkedList(list.head);
        
        list.insert(4);
        list.insert(8);
        list.insert(-2);
        list.insertAtHead(9);
        list.insert(3);
        list.insertAtHead(-12);
        
        list.printLinkedList(list.head);
        
        //System.out.println("size compute");
        //System.out.println("Size = " + list.getSize());
        //System.out.println("at index 2  = " + list.getValue(6));
        System.out.println("insert at index 2");
        list.insertAtIndex(101, 6);
        list.printLinkedList(list.head);
        
        
    }    
}

class Node{
    int data;
    Node next;
}

class LinkedList{
    Node head; // it'll point to the first node;
    
    public int getSize(){
        int count = 0;
        Node node1 = head;
        while(node1 != null){  
            //System.out.print(" " + node1.data + " count = " + count);
            count++;
            node1 = node1.next;
            
        }
        return count; // 
    }
    
    // 1. if index >= size then throw an error saying that linkedlist has less elements
    // 2. for valid index return the data of node
    public int getValue(int index){
        int size = getSize();
        Node node = head;
        
        if(index >= size){
            System.out.println("LinkedList is underflow");
            return -1;
        }
        else{    
            while(index != 0){
                node = node.next;
                index--;
            }
        }
        return node.data;
    }
    
    public void deleteForValue(int value){
        
    }
    
    public void deleteAtIndex(int index){
        
    }
    
    public void insertAtIndex(int value, int index){
        //int size()
        Node newNode = new Node();
        newNode.data = value;
        
        Node temp = head;
        while(index>1){
            temp = temp.next;
            index--;
        }
        System.out.println("at node = " + temp.data);
        
        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    public void insertAtHead(int value){
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = head;
        head = newNode;
    }
    // at the end of the linkedlist
    public void insert(int value){
        // linkedList is empty
        if(head == null){
            Node node = new Node();
            node.data = value;
            head = node;
        }
        // when linkelist is not empty 
        // 1. go to the node whose next is null (N1)
        // 2. create a new node with the desired value (N2)
        // 3. link the next of N1.next = N2
        else{
            Node tmp = head;
            while(tmp.next != null){
                tmp = tmp.next;
            }
            /*
                Node newNode = new Node();
                newNode.data = value;
                tmp.next = newNode;
            */
        
            tmp.next = new Node();
            tmp.next.data = value;    
        }
    }
    
    public void printLinkedList(Node headNode){
        if(headNode == null){
            System.out.println("linkedlist is empty");
            return;
        }
        
        while(headNode != null){
            System.out.println(headNode.data);
            headNode = headNode.next;
        }
    }
}
