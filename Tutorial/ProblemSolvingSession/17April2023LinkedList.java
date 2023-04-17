
class Queue
{
 private Node front, rear; 
 private int currentSize;
 
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
       
    }
}
    
 public Queue()
 {
 front = null;
 rear = null;
 currentSize = 0;
 }
 
 
 public void dequeue()
 {
     if(front == null){
         return;
     }
     if(front == rear){
         front = rear = null;
         currentSize = 0;
         return;
     }
     Node temp = front;
     front = front.next;
     temp.next = null;
     currentSize--;
 }
 

 public void enqueue(int data){
     Node newNode = new Node(data);
     if(rear == null){
         front = rear = newNode;
         currentSize++;
         return;
     }
     rear.next = newNode;
     rear = newNode;
     currentSize++;
 }
 
 public void displayfront(){
     if(front == null){
         System.out.println(0)
         return;
     }
     System.out.println(front.val);
 }
}



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        alternateAddition(arr,n);
    }
    public static void alternateAddition(int[][] arr,int n){
        long sum1 = 0, sum2 = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(count%2==0){
                    sum1+=arr[i][j];
                } else {
                    sum2+= arr[i][j];
                }
                count++;
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}

