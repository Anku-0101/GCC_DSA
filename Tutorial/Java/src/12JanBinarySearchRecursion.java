import java.util.*;

class Main{
    
    public static void main(String[] args){
        //System.out.println( IsPalindrome("racecar"));
        int arr[] = {43,54,5,7,9,11,15,20,32};
        //System.out.println("output Index = " + binarySearch(arr,26));
        //SubSequence("abced");
        System.out.println(CircularArraySearch(arr, 5));
        
    }
    
    
    public static int CircularArraySearch(int arr[], int x){
        int n = arr.length;
        int start = 0;
        int end  = n-1;
        
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid] == x) // Case 1
                return mid;

            else if(arr[mid] >= arr[start]) //Case :2 Left side i.e from start till mid is sorted
            {
                if((x <= arr[mid]) && (x >= arr[start])) //Case 2A
                    end = mid -1;
                else // Case 2B
                    start = mid +1;
            }

            else if(arr[mid] <= arr[end]) //Case 3 : Right side i.e from mid till end is sorted
            {
                if((x <= arr[end]) && (x >= arr[mid])) // Case 3A
                    start = mid +1;
                else  // Case 3B
                    end = mid -1;
            }
        }
        return -1;
    }

    
    public static int RotationCount(int arr[])
    {
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start <= end)
        {
            int mid = start + (end - start)/2;
        
            if(arr[start] <= arr[end]) return start; //Case 1
            
            int next = (mid+1)%n;
            int previous = (mid-1+n)%n;
            if((arr[mid] <= arr[previous]) && (arr[mid] <= arr[next])) //Case 2
            {
                return mid;
            }
            
            else if(arr[mid] >= arr[start])start = mid+1;  //Case 3
            else if(arr[mid] <= arr[start]) end = mid -1; //Case 4
        }
        return -1;
    }
    
    public static void SubSequence(String str){
        PrintSubSequence(str, 0, "");
    }
    
    // Time complexity - O(2^n)
    // O(n)
    public static void PrintSubSequence(String s, int i, String curr){
        if(i == s.length()){
            System.out.println(curr);
            return;
        }
        
        PrintSubSequence(s, i+1, curr+s.charAt(i));
        PrintSubSequence(s, i+1, curr);
    }
    
    
    public static int binarySearch(int [] arr, int target){
        int startIndex = 0;
        int endIndex = arr.length-1;
        System.out.println("target = " + target);
        int n = arr.length;
        
        int iterationCount = 0;
        int midIndex;
        
        while(startIndex <= endIndex){
            
            //System.out.println("iterationCount = " + (++iterationCount));
            midIndex = (endIndex +startIndex)/2; //Dividing arr into 2 halves
            
            
            int next = (midIndex+1)%n;
            int prev = (midIndex-1+n)%n;
            
            if (arr[midIndex] == target){
                return midIndex;
            }
            
            //if((arr[prev] < target) && (target < arr[next]))
            //  return next;
            if (target < arr[midIndex])  // Left half of the array 
                endIndex = midIndex - 1;
            else                    // Right half of the array
                startIndex = midIndex + 1;
                
            
            //System.out.println("startIndex = " + startIndex + " element = " + arr[startIndex]);
            //System.out.println("endIndex = " + endIndex + " element = " + arr[endIndex]);
            //System.out.println("midIndex = " + midIndex  + " element = " + arr[midIndex]);
        }
        return startIndex;
    }
    
    public static boolean IsPalindrome(String str){
        return isPalindrome(str, 0, str.length()-1);
    }
    
    public static boolean isPalindrome(String s, int startIndex, int endIndex){
        if(startIndex >= endIndex)
            return true;
        
        if(s.charAt(startIndex) != s.charAt(endIndex))
            return false;
        
        return isPalindrome(s, startIndex+1, endIndex-1);
    }
    
    public static boolean IsPalindromeIterative(String str){
        String newstr = ""; // str = "aba" // newstr = " aba"
        
        for (int i = str.length() - 1; i >= 0; i--) {
            newstr = newstr + str.charAt(i);

        }
        // in java str will point to memory location of String str
        // just like objects 
        // example : int[] arr = new int[]{2,3,4,};
        // arr -> object of array so it will point to memory location
        if( str.equals( newstr))
            return true;
        
        return false;

    }
}
