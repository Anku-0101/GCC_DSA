class MyQueue {
    Stack<Integer> st1;
    Stack<Integer> st2;

    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void push(int x) { // 1, 2 -> 2,1 
        st1.push(x);
    }
    
    public int pop() {
        while(!st1.empty()){
            st2.push(st1.pop());
        }
        int res = st2.pop();
        while(!st2.empty()){
            st1.push(st2.pop());
        }
        return res;
    }
    
    public int peek() {
        while(!st1.empty()){
            st2.push(st1.pop());
        }
        int res =  st2.peek();
        while(!st2.empty()){
            st1.push(st2.pop());
        }
        return res;
    }
    
    public boolean empty() {
        //boolean res = st1.empty()?(st2.empty()?true:false):false;
        return st1.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
