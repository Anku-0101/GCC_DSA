class Main{
    public static void main(String[] args){
        DLL dll = new DLL();
        dll.InsertAtHead(4);
        dll.InsertAtHead(8);
        dll.InsertAtHead(0);
        dll.print(dll.head);
        
        System.out.println(dll.getSize(dll.head));
        dll.InsertAtTail(1);
        dll.InsertAtTail(7);
        dll.InsertAtTail(13);
        dll.InsertAtHead(20);
        dll.print(dll.head);
        System.out.println(dll.getSize(dll.head));

        dll.InsertAtIndex(5,7);
        dll.print(dll.head);
        System.out.println(dll.getSize(dll.head));

        dll.DeleterByValue(6);
        dll.print(dll.head);
        System.out.println("reversing list ..");
        //dll.head = dll.Reverse(dll.head);
        dll.print(dll.Reverse(dll.head));
        
    }
}

class Node{
    int data;
    Node next;
    Node prev;
    public Node(int data){
        this.data = data;
        next = null;
        prev = null;
    }
}

class Nodec{
    int data;
    Nodec next;

    public Nodec(int data){
        this.data = data;
        next = null;
    }
}

class circularList{
    Nodec last;

    void InsertAtHead(int value){
        Nodec newnode = new Nodec(value);
        node old_firstNode = last.next;
        newNode.next = old_firstNode;
        last.next = newNode;
    }

    void print(Nodec last){
        Node tmp = last;
        if(last != null){
            do{
                System.out.print(tmp.value + " ->");
                tmp = tmp.next;
            }
            while(tmp != last);
        }
    }
}

class DLL{
    Node head;
    
    public void InsertAtHead(int value){
        Node newNode = new Node(value);

        if(head == null){
            head = newNode;
        }
        else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;    
        }
    }

    public void InsertAtTail(int value){
        Node newnode = new Node(value);
        
        if(head == null){
            head = newnode;
        }
        else{
            Node node = head;
            while(node.next != null){
                node = node.next;
            }
            node.next = newnode;
            newnode.prev = node;
        }
    }


    public int getSize(Node head){
        Node node = head;
        int size = 0;
        
        while(node != null){
            node = node.next;
            size++;
        }
        return size;
    }

    public void InsertAtIndex(int value, int index){
        Node node = head;
        Node newNode = new Node(value);
        int size = getSize(head);
        
        if(index > size){
            System.out.println("Invalid Index");
            return;
        }

        if(index == 0){
            InsertAtHead(value);
            return;
        }

        if(index == size){
            InsertAtTail(value);
            return;
        }
        while(index >= 1){
            node = node.next;
            index--;
        }
        
        newNode.next = node;
        newNode.prev = node.prev;
        node.prev.next = newNode;
        node.prev = newNode;
        /*
        newnode.next = node.next;
        node.next.prev = newnode;
        node.next = newnode;
        newnode.prev = node;*/
    }

    public void DeleterByValue(int value){
        Node tmp = head;
        if(tmp.data == value){
            head = tmp.next;
            head.prev = null;
            tmp.next = null;
            return;
        }

        while(tmp != null){
            if(tmp.data == value){
                tmp.prev.next = tmp.next;
                if(tmp.next != null){
                    tmp.next.prev = tmp.prev;
                }
                tmp.next = null;
                tmp.prev = null;
                return;
            }
            tmp = tmp.next;
        }
        System.out.println("value not found");
    }

    public void DeleterByIndex(int index){

    }
    public Node Reverse(Node head){
        Node tmp = null;
        Node current = head;

        while(current != null){
            tmp = current.prev;
            current.prev = current.next;
            current.next = tmp;
            current = current.prev;
        }
        return tmp.prev;
    }
    // 1<->2<->4<->9
    public void print(Node head){
        if(head == null){
            System.out.println("list underflow");
        }
        else{
            while(head.next != null){
                System.out.print(head.data + "<->");
                head = head.next;
            }
            System.out.print(head.data);
        }
        System.out.println();
    }

    
}
