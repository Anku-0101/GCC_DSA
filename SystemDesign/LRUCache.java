import java.util.*;
class Main {
    public static void main(String[] args) {
        LRUCache lc = new LRUCache(5);
        lc.put(1,5);
        lc.put(3,9);
        lc.put(0,3);
        System.out.println(lc.get(1));
    }
}

class ListNode{
    int key;
    int value;
    ListNode next;
    ListNode prev;
    
    public ListNode(int key, int val){
        this.key = key;
        this.value = val;
    }
}

class LRUCache{
    int capacity;
    Map<Integer, ListNode> map;
    ListNode head;
    ListNode tail;
    
    public LRUCache(int capacity){
        this.capacity = capacity;
        map = new HashMap<>();
        head = new ListNode(-1,-1);
        tail = new ListNode(-1,-1);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key){
        if(!map.containsKey(key)){
            return -1;
        }
        ListNode node = map.get(key);
        remove(node);
        add(node);
        return node.value;
    }
    
    public void put(int key, int val){
        if(map.containsKey(key)){
            ListNode oldNode = map.get(key);
            remove(oldNode);
        }
        ListNode node = new ListNode(key, val);
        map.put(key, node);
        add(node);
        if(map.size() > capacity){
            ListNode nodeToDel = head.next;
            remove(nodeToDel);
            map.remove(nodeToDel.key);
        }
    }
    private void add(ListNode node){
        ListNode previousEnd = tail.prev;
        previousEnd.next = node;
        node.next = tail;
        node.prev = previousEnd;
        tail.prev = node;
    }
    
    private void remove(ListNode node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}

