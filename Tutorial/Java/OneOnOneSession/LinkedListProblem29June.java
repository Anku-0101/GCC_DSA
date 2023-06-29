/*
class Node {
    int val;
    Node next;
    
    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/

public static int bin2dec(Node head) {
 int size = -1;
 Node curr = head;
 while(curr != null){
     curr = curr.next;
     size++;
 }
 curr = head;
 int value = 0;
 while(curr != null){
     value += getExponent(curr.val, size--);
     curr = curr.next;
 }
 return value;
}
static int getExponent(int value, int exponent){
    //System.out.println("value = " + value + " exponent = " + exponent);
    int val = 1;
    if(value == 0)
        return 0;
    
    while(exponent-- > 0){
        val = 2*val;
    }
    //System.out.println("exp value = " + val );
    return val;
}
