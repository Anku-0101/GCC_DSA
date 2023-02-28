class ONES_COMPLIMENT {
    /*
        WRONG SOLUTION
        24237204211
        long number_of_bits= (long)(Math.floor(Math.log(n)/Math.log(2)))+1;
        return ((1<<number_of_bits)-1)^n;
    */
    public static long toggleBit(long n, long i){
            long mask = 1 << i; // mask = 0000000000000001, n = ..000101, ans = 000000....100
            long ans = n ^ mask;
            return ans;
    }

    public static long compliment(long n){
        long size =0;
        long ans = n;
        long res = 0;
        long idx = 0;
/*
        if(ans >= Integer.MAX_VALUE){
            return ans;
        }*/
        ArrayList<Long> bits_ = new ArrayList<>();
        ArrayList<Long> inverted_bits = new ArrayList<>();

        while(ans >0){
            //bit =  (n>>idx)&1; bit = 1-bit;
            long bit = find(n, idx++);
            bits_.add(bit);
            

            bit = 1-bit;
            inverted_bits.add(bit);
            res += bit*pow(2L, idx-1);
            ans = ans>>1;
            
        }
        System.out.println("no of bits" + (idx));//1101001011011010110011001110100001100
        //System.out.println();
        for(int i = bits_.size()-1; i >= 0; i--){
            System.out.print(bits_.get(i));
        }
        System.out.println();
        for(int i = inverted_bits.size()-1; i >= 0; i--){
            System.out.print(inverted_bits.get(i));
        }
        System.out.println(); // 24237204211
        //System.out.println("1 left shift 31 times = " +(1L<<35));
        return res;
        //for(long i=0; i<size; i++){
        //    n = toggleBit(n,i);
        //}
        //return n;
    }

    public static long pow(long x, long n){
        if( n == 0 )
            return 1;
        
        if(n%2 == 0){
            long y = pow(x,n/2);
            return y*y;
        }

        return x*pow(x,n-1);
    }

    public static long find(long n, long idx){
        long mask = (1L<<idx);
        long tmp = n&mask;
        if(tmp != 0)
            return 1;
        
        return 0;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t>0){
            long n = sc.nextLong();
            System.out.println(compliment(n));
            t--;
        }
    }
}




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
        
    }    
}

class Node{
    int data;
    Node next;
}

class LinkedList{
    Node head; // it'll point to the first node;
    
    public void insertAtIndex(int value, int index){
        return -1;
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









class student{
    String name;
    int rollNumber;
    
    student(String Name, int Roll){
        this.name = Name;
        this.rollNumber = Roll;
    }
    
    public String GetName(){
        return this.name;
    }
    
    public int GetRollNumber(){
        return this.rollNumber;
    }
}
