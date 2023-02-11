import java.util.*;
import java.io.*;

class Node{
    public int key; //k key;
    public int value;
    
    public int hash;
    public Node next;
}

class HashMapCustom{
    
    Node[] hashtable = new Node[10];
    
    public void put(int key, int value){
        int hash = getHash(key);
        
        if(hashtable[hash] == null){
            Node node = new Node();
            node.key = key;
            node.value = value;
            node.hash = hash;
            node.next = null;
        }
        else{
            Node node = hashtable[hash];
            while(node != null){
                if(node.key == key){
                    node.value = value;
                    return;
                }
                node = node.next;
            }
            node = hashtable[hash];
            
            while(node.next != null){
                node = node.next;
            }
            
            Node node_ = new Node();
            node_.key = key;
            node_.value = value;
            node_.hash = hash;
            node_.next = null;
            
            node.next = node_;
        }
    }
    public int get(int key){
        return 0;
    }
    
    private int getHash(int key){
        return key>0 ? key%10 : (-1*key)%10;
    }
}



class Main{
    public static void main(String[] args){
        //System.out.println(isAnagram("abba", "aabb"));
        //int arr[] = {10,15,-5,0,-10,15,0,5,0,2,18,5};
        //AllPossibleSubarrys(arr,20);
        //int arr1[] = {1,1,0,1,1,0,0};
        //equalZeroOne(arr1);
    }
    
     public static void equalZeroOne(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0)
                arr[i] = -1;
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int start = 0;
        int end = -1;
        
        int ans_start = 0;
        int ans_end = -1;
        int max_length = 0;
        
        int curr_sum = 0;
        for(int i = 0; i < arr.length; i++){
            curr_sum += arr[i];
            
            if((curr_sum) == 0){ // curr_sum == sum
                start = 0;
                end = i;
                if(end-start+1 > max_length){
                    max_length = end-start+1;
                    ans_start = start;
                    ans_end = end;
                }
                
            }
            
            if(map.containsKey(curr_sum)){
                start = map.get(curr_sum) + 1;
                end = i;
                
                if((end-start+1) > max_length){
                    max_length = end-start+1;
                    ans_start = start;
                    ans_end = end;
                }
                
            }
            else{
                map.put(curr_sum,i);    
            }
            
        }
        
        if(end != -1){
            System.out.println("Start = " + ans_start + " end = " + ans_end);
        }
        if(end == -1){
            System.out.println("Not found");
        }
    }
 
    
    // O(N)
    public static void AllPossibleSubarrys(int[] arr, int sum){
        HashMap<Integer, Integer> map = new HashMap<>();
        int start = 0;
        int end = -1;
        
        int curr_sum = 0;
        ArrayList<ArrayList<Integer>> allSubArrays = new ArrayList<ArrayList<Integer>>();
        
        for(int i = 0; i < arr.length; i++){
            curr_sum += arr[i];
            
            if((curr_sum - sum) == 0){ // curr_sum == sum
                start = 0;
                end = i;
                allSubArrays.add(getSubArray(start, end, arr));
                //break; // if we want all sub arrays don't break, print the start and end
            }
            
            if(map.containsKey(curr_sum-sum)){
                start = map.get(curr_sum - sum) + 1;
                end = i;
                allSubArrays.add(getSubArray(start, end, arr));
                //break; // if we want all sub arrays don't break, print the start and end
            }
            
            map.put(curr_sum,i);
            
            
        }
        
        if(end != -1){
            System.out.println(allSubArrays);
            //System.out.println("Start = " + start + " end = " + end);
        }
        if(end == -1){
            System.out.println("Not found");
        }
    }
    
    public static ArrayList<Integer> getSubArray(int start,int end, int[] arr){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        for(int i = start; i <= end; i++)
            ans.add(arr[i]);
            
        return ans;
    }
    // to get any one possible isSubarry
    public static void isSubarry(int[] arr, int sum){
        HashMap<Integer, Integer> map = new HashMap<>();
        int start = 0;
        int end = -1;
        
        int curr_sum = 0;
        for(int i = 0; i < arr.length; i++){
            curr_sum += arr[i];
            
            if((curr_sum - sum) == 0){ // curr_sum == sum
                start = 0;
                end = i;
                break; // if we want all sub arrays don't break, print the start and end
            }
            
            if(map.containsKey(curr_sum-sum)){
                start = map.get(curr_sum - sum) + 1;
                end = i;
                break; // if we want all sub arrays don't break, print the start and end
            }
            map.put(curr_sum,i);
        }
        
        if(end != -1){
            System.out.println("Start = " + start + " end = " + end);
        }
        if(end == -1){
            System.out.println("Not found");
        }
    }
    
    
}
