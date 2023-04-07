import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static boolean sumOfCube(long num){
        long low = 1;
        //long high = (long)Math.pow(num, (1/3));
        long high;
        for( high = 1; high*high*high <= num; high++){
            if(high*high*high > num){
                high = high-1;
                break;
            }
        }
        
        //.out.println("high = " + high);

        while(low<=high){
            long cur = (low*low*low + high*high*high);
            if(cur==num){
                return true;
            }

            if(cur<num){
                low++;
            }else{
                high--;
            }
        }
        return false;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        boolean b = sumOfCube(num);

        if(b){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}








class Main{
    public static void main(String[] args){  
        /*
        char[] res = convertStringToArray("Ram");
        for(int i = 0; i < res.length; i++){
            System.out.println("arr["+i+ "]= " + res[i]);
        }*/
        LinkedList ll = new LinkedList();
        ll.print();
        ll.insertAtTail('p');
        ll.insertAtTail('q');
        ll.insertAtTail('z');
        System.out.println("size = " + ll.size());
        ll.print();

    }

    
    // String str = "Ram";
    // str[0], str[1]
    public static char[] convertStringToArray(String str){
        int n = str.length();
        char arr[] = new char[n];
        for(int i = 0; i < n; i++){
            arr[i] = str.charAt(i);
        }
        return arr;
    }
}
/*
class StringCustom{
    private int numOfChars;
    private char[] character;
    StringCustom(){
        numOfChars  =0;
        character = new character[10];
    }
    int length(){

    }
}*/

class Node{
        char data;
        Node next;
        Node(char data){
            this.data = data;
        }
    }

    // collection of nodes;
    class LinkedList{
        Node head;

        // O(N)
        void insertAtTail(char value){
            // Q. is linkedlist empty or not
            // if LL is empty then head node is null
            // else head node is not null 

            // case 1 : LL is empty, create a new node with given value, and point head to that node
            if(head == null){
                Node newNode = new Node(value);// created a new node with the value
                head = newNode; // set refrence of head to newNode or first node
            }
            else{
                Node temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = new Node(value);
            }
            // solve using only one condition 
        }

        void print(){
            if(head == null){
                System.out.println("empty LinkedList");
                return;
            }
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
        }

        // O(1)
        void insertAtHead(char value){
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
        }

        int size(){
            if(head == null)
                return 0;
            Node temp = head;
            int counter = 0;
            while(temp.next != null){ // temp != null
                temp = temp.next;
                counter++;
            }
            return counter+1; // counter;
        }

        void deleteByIndex(int index){

        }

        void deleteByValue(char value){

        }

        void reverse(){

        }

    }
