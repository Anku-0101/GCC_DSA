class Main{
    public static void main(String[] args){  
        
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
        if(i < 0){
            return (-1*i)%10;
        }
        return i%10;
    }

    public void put(int key, String value){
        //1. Find hash of key
        int hash = hashFunction(key);
        
        // go to the index of hash in hashTable
        // 1. At index = index, hashTable is null or empty
        if(hashTable[hash] == null){
            hashTable[hash] = new Node(key, value, hash);
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
        tmp.next = new Node(key, value, hash);
    }

    public String get(int key){
        
    }
}
