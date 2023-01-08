import java.util.*;

class Main{
    
    public static void main(String[] args){
        //int arr[] = {44, 40, 39,39,23,13,3,10,8,8,6};
        //System.out.println(CountPaths(3, 100));
        int arr[] = {2,2,3,3,3,3,3,3,4,4,9,11,12,12,12,12,13,18};
        System.out.println(FindFrequency(arr, 10));
    }
    
    
    
    public static int FindFrequency(int arr[], int target){
        int startIndex = BinarySearchFreq(arr, target, true);
        System.out.println("startIndex = " + startIndex);
        if(startIndex == -1)
            return -1;
        
        int endIndex = BinarySearchFreq(arr, target, false);
        System.out.println("endIndex = " + endIndex);
        return endIndex - startIndex + 1;
    }
    
    public static int BinarySearchFreq(int arr[], int target, boolean firstOccurance){
        int startIndex = 0;
        int endIndex = arr.length-1;
        int result = -1; 
        
        while(startIndex <= endIndex){
            int mid = startIndex + ((endIndex - startIndex)/2);
            
            if(arr[mid] == target){
                result = mid;
                
                if(firstOccurance == true) // we're finding first occurance
                    endIndex = mid-1;
                
                if(firstOccurance == false) // we're finding last occurance
                    startIndex = mid+1;
            }
            
            else if(arr[mid] > target)
                endIndex = mid-1;
            else if(arr[mid] < target)
                startIndex = mid+1;
        }
        //System.out.println("result = " + result);
        return result;
    }
    
    // array should be sorted in Descending order
    public static int BinarySearchR(int arr[], int target) {
        return binSearchHelper(arr, 0, arr.length-1, target);
    }
    
    public static int binSearchHelper(int [] arr, int startIndex, int endIndex, int target){
        int midIndex = endIndex-(endIndex-startIndex)/2; // midIndex computation

        if (startIndex>endIndex) // Invalid segment
            return -1;
        
        if (arr[midIndex]==target) // target found
            return midIndex;
        
        if (arr[midIndex]>target) 
            return binSearchHelper(arr, midIndex+1, endIndex, target);
        
        return binSearchHelper(arr, startIndex, midIndex-1, target);
    }
    
    
    // n - number of rows
    // m - number of columns 
    public static int CountPaths(int n, int m){
        return CountPaths_(0,0,n,m);
    }

    public static int CountPaths_(int i, int j, int n, int m){
        if(i == (n-1) || j == (m-1))
            return 1;
        else
            return CountPaths_(i+1, j , n, m ) + CountPaths_(i, j+1, n, m);
    }
    public static boolean isSorted(int[] arr){
        int n = arr.length;
        return isAscending(arr, n) || isDescending(arr, n);
    }
    
    public static boolean isAscending(int[] arr, int n){
        if(n == 1 || n == 0)
            return true;
        
        // if(arr[n-2] > arr[n-1])
        //     return false;
        
        // return isAscending(arr,n-1);
        
        return (arr[n-2] <= arr[n-1]) && isAscending(arr, n-1);
    }
    
    public static boolean isDescending(int[] arr, int n){
        if(n == 1 || n == 0)
            return true;
        
        // if(arr[n-2] < arr[n-1])
        //     return false;
        
        // return isDescending(arr,n-1);
        
        return (arr[n-2] >= arr[n-1]) && isDescending(arr, n-1);
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
