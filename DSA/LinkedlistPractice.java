import java.util.*;

class Main{
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insert(2, list.head);
        list.insert(3, list.head);
        list.insert(9, list.head);
        list.insert(0, list.head);
        list.insert(1, list.head);
        list.insert(5, list.head);
        list.insert(50, list.head);
        list.insert(12, list.head);
        list.insert(81, list.head);
        list.insert(45, list.head);
        list.insert(57, list.head);

        list.printlist(list.head);
        //System.out.println("reversing list ...");
        //list.printlist(list.reverseR(list.head));
        System.out.println("reversing list in groups of k ...");
        list.printlist(list.reverseInGroup(list.head, 3));
    }
}

class Node{
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
    }
}

class LinkedList{
    Node head;

    void insert(int value, Node head){
        Node node = new Node(value);

        if(head == null){
            this.head = node;
            return;
        }
        else{
            while(head.next != null){
                head = head.next;
            }
            head.next = node;
        }
    }

    Node reverse(Node head){
        if(head == null || head.next == null)
            return head;
        
        Node curr = head;
        Node prev = null;
        Node next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    void printlist(Node head){
        if(head == null)
            System.out.println("Empty list");
        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    Node reverseR(Node head){
        if(head == null || head.next == null)
            return head;
        
        Node rest = reverse(head.next);
        head.next.next = head;
        head.next = null;

        return rest;
    }

    Node reverseInGroup(Node head, int k){
        if(head == null)
            return null;
        int size = getSize(head);
        
        if(size >= k){
            Node curr = head;
            Node next = null;
            Node prev = null;

            int count = 0;
            
            while(curr != null && count < k){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count++;
            }
        
            if(next != null)
                head.next = reverseInGroup(next, k);
            
            return prev;
        }
        return head;
    }

    int getSize(Node head){
        if(head == null){
            return 0;
        }
        int count = 0;

        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }


}



