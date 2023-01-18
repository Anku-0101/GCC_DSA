import java.util.*;

class Main{
    public static void main(String[] args){
       int[] arr = {-3,0,0,0,1,1,2,2,2,2,7,7,8};
       System.out.println(Frequecy(arr,9));
    }
    
    static int Frequecy(int[] arr, int target){
        int startIndex = getIndex(arr, target, true);
        
        if(startIndex == -1) // element doesn't exist
            return 0;
        
        int endIndex = getIndex(arr, target, false);
        
        return endIndex-startIndex+1;
    }
    
    static int getIndex(int[] arr, int target, boolean isStartIndex){
        int start = 0;
        int end = arr.length-1;
        
        int res = -1;
        
        while(start <= end){
            int mid = (start+end)/2;
            
            if(arr[mid] == target){
                res = mid;
                
                if(isStartIndex)
                    end = mid-1;
                else{
                    start = mid+1;
                }
            }
            
            // left half
            else if(arr[mid] > target){
                end = mid-1;
            }
            // right half
            else if(arr[mid] <target){
                start = mid+1;
            }
            
        }
        
        return res;
        
    }
    // here we're checking all the elements in the worst case scenerio
    // TC - (n)
    static int FindIndex(int[] arr, int target){
        for(int i =0; i < arr.length; i++){
            if(arr[i] == target)
                return i;
        }
        return -1;
    }    
    
    static int BinarySearchR(int[] arr, int target, int start, int end){
        
        if(start > end) // invalid segment
            return -1;
        
        int mid = (start+end)/2;
        
        if(arr[mid] == target)
            return mid;
        
        //left half
        if(arr[mid] > target)
            return BinarySearchR(arr, target, start, mid-1);
        
        // right half
        
            return BinarySearchR(arr, target, mid+1, end);
    }
    
    static int BinarySearch(int[] arr, int target){
        
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end){
            int mid = (end+start)/2; // start +(start-end)/2        
            
            // target is found
            if(arr[mid] == target){
                return mid;
            }
            
            // left half
            else if(arr[mid] > target){
                end = mid-1;
            }
            // right half
            else if(arr[mid] <target){
                start = mid+1;
            }   
        }
        return -1;
    }
}
