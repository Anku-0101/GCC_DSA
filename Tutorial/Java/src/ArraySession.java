import java.util.*;

class Main{
    public static void main(String[] args){
        int[] arr = {9,-3,5,-2,1,2,3,4,5,6};
        //int[] oddArray = Odd();
        //int[] res = Delete2(arr, 4);
        //Traverse(res, res.length);
        //System.out.print(Find(arr, 13));
        findMaxMin(arr);
        
    }
    
    public static void findMaxMin(int[] arr){
        int max = arr[0];
        int min = arr[0];
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
            
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
    
    public static boolean Find(int[] arr, int x){
        // searching all the elements 
        // TC - O(n)
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x)
                return true;
        }
        return false;
    }
    public static int[] Delete1(int[] arr, int index){ //we are decreasing size of array
        int[] res = new int[arr.length - 1];
        for(int i = 0; i < index; i++){ // 0 to index-1
            res[i] = arr[i];
        }
        for(int i = index+1; i < arr.length; i++){
            res[i-1] = arr[i];
        }
        return res;
    }
    
    public static int[] Delete2(int[] arr, int index){ //-> set the default value
        arr[index] = 0; // update
        return arr;
    }
    // 0 to size-1 -> it has all the elements
    public static void Traverse(int[] arr, int size){
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
    
    public static int[] Odd(){
        int[] res = new int[10];
        
        int first = 1; // 3 5 7 9 
        int index = 0;
        
        while(index < 10){
            res[index++] = first;
            first = first +2;
        }
        
        return res;
    }
    
    
}
