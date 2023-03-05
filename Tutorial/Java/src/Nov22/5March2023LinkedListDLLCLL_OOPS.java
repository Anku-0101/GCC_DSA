//In class Question on inhertitance 
class Main{
  
  public static void main(String args[]) {
    circle c = new circle(5);
    System.out.println("circle area="+c.getArea());
    cylinder cr = new cylinder(5,7);
    System.out.println("cylinder volume=" +cr.getVolume(5,7));
  }
}

class circle{
  int radius;
  public circle(int radius) {
    if(radius < 0){
      this.radius = 0;
    }
    this.radius = radius;
  }

  public double getArea(){
    return 3.14*radius*radius;
  }
}

class cylinder extends circle{
  int height;
  cylinder(int radius,int height){
    super(radius);
    if(height<0){
      this.height = 0;
    }
    this.height = height;
  }

  public double getVolume(int radius,int height){
    return super.getArea()*height;
  }

}


class SINGLY_LINKED_LIST{
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.head = new Node(5);
        list.head.next = new Node(8);
        list.head.next.next = new Node(1);
        list.head.next.next.next = new Node(7);
        list.head.next.next.next.next = new Node(9);
        list.head.next.next.next.next.next = new Node(11);
        list.head.next.next.next.next.next.next = new Node(16);
        list.head.next.next.next.next.next.next.next = new Node(3);

        list.print(list.head);
        System.out.println("reverse in group .... ");
        list.head = list.reverseInGroups(list.head, 3); // 1->8->5
        list.print(list.head);
        
        //System.out.println(list.isCyclePresent(list.head));   
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

class LinkedList{
    Node head;
    
    public Node reverseInGroups(Node head, int k){
        if(head == null)
            return null;
        
        int size = getSize(head);
        if(size >= k){
            Node curr = head;
            Node next = null;
            Node prev = null;

            int count = 0;

            while(count < k && curr != null){
                next  = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count++;
            }
            head.next = reverseInGroups(next, k);
            return prev;
        }
        else{
            return head;
        }
        
    }


    public boolean isCyclePresent(Node head){
        if(head == null)
            return false;
        
        Node FastPointer = head;
        Node SlowPointer = head;
        
        while(FastPointer.next != null && SlowPointer != null){
            FastPointer = FastPointer.next.next; // fast is moving at 2X
            SlowPointer = SlowPointer.next; // slow is moving 1X
            if(FastPointer == SlowPointer){
                return true;
            }

        }

        return false;
    }

    public Node reverseR(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node tmp = reverseR(head.next);
        head.next.next = head;
        head.next = null;

        return tmp;
    }
    public Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        //Node next = null;

        while(curr != null){
           Node next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next; 
        }
    
        return prev;
    }

    public void deleteByValue(int value){
        Node node = head;
        
        //if deleting head 
        if(node.data == value){
            head = node.next;
            node.next = null;
            System.out.println("deleted value = " + node.data);
        }
        else{
            while(node.next != null && node.next.data != value ){
                node = node.next;
            }
            if(node.next != null){
                System.out.println("deleted value = " + node.next.data);
                node.next = node.next.next;
            }
            else{
                System.out.println("value not found");
            }
            
        }
    }

    public void deleteByIndex(int index){
        
        int size = getSize(head);
        if(index >= size || index < 0){
            System.out.println("invalid index");
            return;
        }

        Node node = head;
        if(index == 0){ // or size 1  
            head = node.next;
            node.next = null;
            System.out.println("deleted value = " + node.data);
        }
        else{
            while(index > 1){
                node = node.next;
                index--;
            }
            System.out.println("deleted value = " + node.next.data);
            Node tmp = node.next;
            node.next = node.next.next;
            tmp.next = null;
        }
    }

    public void deleteHead(){
        if(head == null){
            System.out.println("empty list");
        }
        Node node = head;
        head = node.next;
        node.next = null;
    }

    public void deleteTail(){
        if(head == null){
            System.out.println("empty list");
        }
        Node node = head;
        Node prev = head;

        while(node.next != null){
            prev = node;
            node = node.next;
        }
        if(prev != head)
            prev.next = null;
        else
            head = null;
    }
    public int getSize(Node head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
    public void print(Node head){
        if(head == null){
            System.out.println("List underflow");
        }
        while(head.next!= null){
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.print(head.data);
        System.out.println();
    }
}


class DLL{
    public static void main(String[] args){
        DLL dll = new DLL();
        dll.InsertAtHead(4);
        dll.InsertAtHead(8);
        dll.InsertAtHead(0);

        dll.print(dll.head);
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



    public int getSize(Node head){
        return -1;
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
    }

    
}
