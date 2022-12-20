import java.util.*;

/*
Dynamic array Implementation 
*/

class Main{
    int capacity = 100;
    int index = 0;

public static void main(String[] args){
    int[] arr = new int[capacity];
    
    arr = Add(arr, 90);
    arr = Add(arr, 50);
 }
 
 public int[] Add(int[] arr, int data){
    if(index == arr.length-1){ // arr is full 
        int[] NewArr = new int[capacity*2];
        
        // Copy from old array to new array
        for(int i = 0; i<capacity; i++){
            NewArr[i] = arr[i];
        }
        NewArr[index++] = data;
        capacity = capacity*2;
        return NewArr;
    }
    else{
        arr[index++] = data;
    }
    return arr;
 }
 
 public int Get(int index){
     if(index < capacity)
        return arr[index];
    else
        return -1;
 }
 
 // It removes last inserted element 
 public int Remove() {
    if(index >0)
        int element = arr[index-1];
    else
        return -1;
    
    index = index -1;
    return element;
 }
  
}
