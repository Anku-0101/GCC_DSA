import java.util.*;
import java.io.*;

class Iterator{
    public Node[] nodes;
    int pointer = -1;
    Node currNode;
    
    public boolean hasNext(){
        if(pointer < nodes.length-1 && nodes.length > 0)
            return true;
        
        return false;
    }
    
    
    public void next(){
        
        if(currNode == null && pointer < nodes.length-1){
            currNode = nodes[++pointer];
        }
        
        if(currNode != null){
            int key = currNode.key;
            int value = currNode.value;
            System.out.println("key = " + key + " value = " + value);
        
            currNode = currNode.next;
        }
        
        
    }
}

// A Node must have
// 1. key, 2. value, 3. hash(to uniquely identify), 4. Next (to go to next node having same hash bust different key i.e collision case)
class Node{
    public int key;
    public int value;
    
    public int hash;
    public Node next;
}

class HashMapCustom{
    private Node[] hashTable = new Node[10]; // hashtable is always collection or array of nodes
    
    // hash method
    private int getHash(int key){
        return (key > 0) ? (key%10) : -1*(key%10);
    }
    
    // note : for this hash map key is int also value is int
    public void put(int key, int value){
        // 1 . first compute hash
        int hash = getHash(key);
        
        Node node = hashTable[hash];
        
        // Case 1 : there's no value present at the corresponding hash
        if(node == null){
            hashTable[hash] = getNewNode(key, value, hash);
            return;
        }
        
        // 1. node is present at the hash, collision or same key
        // the very first node is matched
        /*
        if(node.key == key){
            node.value = value;
            return;
        }*/
        
        // check if key is already present then update the key, else create a newNode and attach it to end
        Node temp = node;
        while(temp != null){
            if(temp.key == key){
                temp.value = value;
                return;
            }
            temp = temp.next; // to go to next node in the chain
        }
        
        // case when node with key is absent,
        // we're going to last node 
        // for last node, the next should be null
        while(node.next != null){
            node = node.next;
        }
        // after this loop we'll be at last node
        node.next = getNewNode(key,value,hash);
    }
    
    public int get(int key){
        // 1. get hash
        int hash = getHash(key);
        
        // 2. get the corresponding node from hashtable    
        Node node = hashTable[hash];
        
        // case 1 : the hashtable at that hash is empty
        if(node == null){
            System.out.println("Not found");
            return -1; 
        }
        
        // node with the given hash is present so we'll traverse the linear chain(if exists)
        while(node != null){
            if(node.key == key){
                return node.value;
            }
            node = node.next;
        }
        
        // coming out of this loop indicates that node is absent
        System.out.println("Not found");
        return -1;          
    }
    
    public void remove(int key){
        int value = get(key);
        if(value == -1){
            System.out.println("key not found");
            return;
        }
        // now we know key is present and we have to delete
        int hash = getHash(key);
        Node node = hashTable[hash];
        
        // we came here only if the node is present 
        // 1. if there's no linear chaining 
        if(node.next == null && node.key == key){
            hashTable[hash] = null;
            return;
        }
        
        // if there's linear chaining and node to delete is 1st node
        if(node.key == key){
            hashTable[hash] = node.next;
            return;
        }
        
        // if there's linear chaining and node to delete is not 1st node
        
        while(node.next.key != key){
            node = node.next;
        }
        // when we get out of above while loop, we'll be standing on the node just above the node to delete
        Node temp = node.next; // node to be deleted
        node.next = node.next.next; // temp.next;
        
        System.out.println("key = " + key +" has been deleted successfully");
    }
    
    private Node getNewNode(int key_, int value_, int hash_){
        Node newNode = new Node(); // newNode is object
        // initialize all fields of newNode
        newNode.key = key_;
        newNode.value = value_;
        newNode.hash = hash_;
        newNode.next = null;
        
        return newNode;
    }
    
    public Node[] keySet(){
        return hashTable;
    }
}
class Main {
    
    public static void main(String args[]) {
        // Your code goes here
        HashMapCustom map = new HashMapCustom(); //
        map.put(1,5);
        map.put(-3,8);
        map.put(11,7);
        map.put(21, 4);
        map.put(13, 6);
        map.put(1,9);
        map.put(41,9);
        map.put(10,34);
        map.put(6,2);
        //map.put(10,100);
        /*
        System.out.println(map.get(1));
        System.out.println(map.get(-3));
        System.out.println(map.get(11));
        System.out.println(map.get(21));
        System.out.println(map.get(13));
        System.out.println(map.get(1));
        System.out.println(map.get(12));
        System.out.println(map.get(6));
        System.out.println(map.get(10));
        */
        /*
        map.remove(21);
        System.out.println(map.get(21));
        System.out.println(map.get(1));
        System.out.println(map.get(11));
        System.out.println(map.get(41));
        //map.remove(1);
        
        //System.out.println(map.get(1));
        
        //Iterator it = new Iterator();
        //it.nodes = map.keySet();
        
        //while(it.hasNext()){
        //    it.next();
        //}*/
        int[] arr = {1,2,2,1,3,1,1,3};
        KDistinct(arr,4);
        
    }
    
    public static void KDistinct(int arr[] , int k){
        HashMap <Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<k;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }

        System.out.println(map.size());
        
        for(int i = k; i<arr.length;i++){
            if(map.get(arr[i-k])==1){
                map.remove(arr[i-k]);
            }
            else{
                map.put(arr[i-k], map.get(arr[i-k])-1);
            }
            
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);    
            }
            else{
                map.put(arr[i], 1);
            }
            
            System.out.println(map.size());
        }
    }
    
}
