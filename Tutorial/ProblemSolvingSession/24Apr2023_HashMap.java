class Main{
    public static void main(String[] args){  
        HashMapCustom myMap = new HashMapCustom();
        myMap.put(3,"three");
        myMap.put(7,"Pune");
        myMap.put(17,"Rajashtan");
        myMap.put(27,"Abc");
        myMap.put(2,"Abc");
        myMap.put(17,"Abc");

        System.out.println(myMap.get(17));
        myMap.remove(27);
        System.out.println(myMap.get(27));
        myMap.clear();
        System.out.println("Size of hashMap = " + myMap.size());
    }
}

class Node{
    int key;
    String value;
    Node next;
    int hash;

    Node(int key, String value, int hash){
        this.key = key;
        this.value = value;
        this.hash = hash;
    }
}


// What are the components of hash HashMap
// 1. Hash Function 
// 2. Hash Table
class HashMapCustom{
    Node[] hashTable;
    
    HashMapCustom(){
        hashTable = new Node[10]; // because possible values of hashFunction is from 0 to 9
    }
    // h(i) = i%10 , i>0
    //      = -1*i %10 , i <= 0
    private int hashFunction(int key){
        if(key < 0){
            return (-1*key)%10;
        }
        return key%10;
    }

    public void put(int key, String value){
        //1. Find hash of key
        int hash = hashFunction(key);
        
        // go to the index of hash in hashTable
        // 1. At index = index, hashTable is null or empty
        if(hashTable[hash] == null){
            hashTable[hash] = getNewNode(key, value, hash);
            return;
        }

        Node tmp = hashTable[hash];
        
        while(tmp.next != null){
            if(tmp.key == key){
                tmp.value = value;
                return;
            }
            tmp = tmp.next;
        }
        tmp.next = getNewNode(key, value, hash);
    }

    private Node getNewNode(int key, String value, int hash){
        return new Node(key,value,hash);
    }

    public String get(int key){
        int hash = hashFunction(key);
        if(hashTable[hash] == null){
            System.out.println("Key not found");
            return null;
        }
        Node tmp = hashTable[hash];
        
        while(tmp!= null){
            if(tmp.key == key){
                return tmp.value;
            }
            tmp = tmp.next;
        }
        System.out.println("Key not found");
        return null;
    }

    public void remove(int key){
        int hash = hashFunction(key);
        
        // at the hash of key there's nothing stored
        if(hashTable[hash]==null){
            System.out.println("Key not found! Nothing to delete");
            return;
        }

        Node temp = hashTable[hash];
        
         // if the node to delete is the first node & there's no linear chain 
         if(temp.next == null && temp.key == key){
            hashTable[hash] = null;
            System.out.println("Key = " + key + " found and deleted");
            return;
         }

         // if the node to delete is the first node & there's  linear chain 
        if(temp.next != null && temp.key == key){
            hashTable[hash] = hashTable[hash].next;
            temp.next = null;
            System.out.println("Key = " + key + " found and deleted");
            return;
        }

        // node to delete is some node other than 1st node
        while(temp.next != null){
            if(temp.next.key == key){
                System.out.println("Key = " + key + " found and deleted");
            
                Node nodeToDelete = temp.next;
                temp.next = temp.next.next;
                nodeToDelete.next = null;

                return;
            }
            temp = temp.next;
        }
        System.out.println("Key not found! Nothing to delete");
    }
    

    // returns the number of keys present
    public int size(){
        int count = 0;
        for(int i = 0;  i < hashTable.length; i++){
            Node node = hashTable[i];
            while(node != null){
                node = node.next;
                count++;
            }
        }
        return count;
    }

    // removes all key value pairs in hashMap
    public void clear(){
        for(int i=0;i<hashTable.length;i++){
            hashTable[i] = null;
            
        }
    }
}
