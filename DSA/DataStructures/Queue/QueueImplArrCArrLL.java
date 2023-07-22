class StackULinkedList {
    public static void main(String[] args) {
        QueueArr arr = new QueueArr(5);
        System.out.println(arr.isEmpty());
        
    }
}

class QueueArr{
    int[] arr;
    int size;
    int rear, front;

    QueueArr(int size){
        this.size = size;        
        arr = new int[size];
        rear=front=-1;
    }

    boolean isEmpty(){
        return (rear == -1 || front == -1);
    }

    boolean isFull(){
        return rear == size-1;
    }

    void Enqueue(int x){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        
        if(isEmpty()){
            front = 0;
            arr[++rear] = x;
            return;
        }

        arr[++rear] = x;
    }

    void Dequeue(){
        if(isFull())
            return;
        
        if(front == rear){
            front = -1;
            rear = -1;
            return;
        }

        front++;
    }
    int front(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }    

}

class QueueCircularArr{
    int[] arr;
    int size;
    int rear, front;
    
    QueueArr(int size){
        this.size = size;        
        arr = new int[size];
        rear=front=-1;
    }

    boolean isEmpty(){
        return (rear == -1 || front == -1);
    }

    void Enqueue(int x){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        rear = (rear+1)%size;

        if(isEmpty()){
            front = 0;    
            arr[rear] = x;
            return;
        }

        arr[rear] = x;
    }

    void Dequeue(){
        if(isFull())
            return;
        
        if(front == rear){
            front = -1;
            rear = -1;
            return;
        }

        front = (front + 1)%size;
    }
    int front(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }
}

class Node{
    int data;
    Node next;

    Node(int val){
        this.data = val;
    }
}

class QueueLinkedList{
    Node rear;
    Node front;

    QueueLinkedList(){
        rear = front = null;
    }

    boolean isEmpty(){
        return (rear==null || front==null);
    }

    void Enqueue(int x){
        Node temp = new Node(x);

        if(front == null && rear == null){
            front = temp;
            rear = temp;
        }
        else{
            rear.next = temp;
            rear = temp;
        }
    }

    void Dequeue(){
        temp = front;
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        
        if(front == rear){
            front = rear = null;
            return;
        }
        front = temp.next;
        temp.next = null;
    }

    int Front(){
        if(!isEmpty()){
            return front.data;
        }
        System.out.println("Queue is Empty");
        return -1;
    }
}





