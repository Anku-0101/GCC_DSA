import java.util.*;

class Main{
    
    public static void main(String[] args){
        //int[] arr = {1,4,3,2,7};
        //System.out.println(isAvailable(arr,11));
        int arr[] = {2,5,6,8,10,13,17,24,33,45,49,55,68,72,74};
        System.out.println("Index of target = " + binarySearch(arr, 100));
    }
    
    public static boolean isAvailable(int[] arr, int z) {
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1; j<arr.length;j++) {
                if(arr[i]+arr[j]==z)
                    return true;
            }
        }
        return false;
    }
    
    public static int binarySearch(int [] arr, int target){
        int startIndex = 0;
        int endIndex = arr.length-1;
        System.out.println("target = " + target);
        
        int iterationCount = 0;
        while(startIndex <= endIndex){
            System.out.println("iterationCount = " + (++iterationCount));
            int midIndex = startIndex + (endIndex-startIndex)/2; //Dividing arr into 2 halves
            
            System.out.println("startIndex = " + startIndex + " element = " + arr[startIndex]);
            System.out.println("endIndex = " + endIndex + " element = " + arr[endIndex]);
            System.out.println("midIndex = " + midIndex  + " element = " + arr[midIndex]);
            
            if (arr[midIndex] == target){
                return midIndex;
            }
            if (target < arr[midIndex])  // Left half of the array 
                endIndex = midIndex - 1;
            else                    // Right half of the array
                startIndex = midIndex + 1;
        }
        return -1;
    }
}
