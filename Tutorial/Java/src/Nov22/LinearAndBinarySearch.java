import java.util.*;

class Main{
    
    public static void main(String[] args){
        int arr[] = {5,9,11,26,29,38,41};
        
        //System.out.println("Index of 11 = " + BinarySearchI(arr, 11));
        //System.out.println("Index of 3 = " + BinarySearchR(arr, 0, arr.length, 3));
        
        //int arr1[] = {29,38,41,5,9,11,26};
        //System.out.println(NumberOfRotations(arr1));   
        
        int arr2[] = {1,3,4,4,5,7,8,8,8,8,8,9,17,19,25};
        int first = Frequency(arr2, 8,true);
        int last = Frequency(arr2, 8,false);
        System.out.println("last index of 8 = " + last);
        System.out.println("first index of 8 = " +first);
        System.out.println("Count of 8 = " + (last-first+1));
        
    }
    
    
    public static int BinarySearchI(int[]arr, int x){
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end)
        {
            // int mid = (end+start)/2;
            int mid = start + (end - start)/2; // To prevent overflow, better than (start + end)/2
            
            if(x == arr[mid]) 
                return mid;
            else if(x < arr[mid]) 
                end = mid -1;
            else 
                start = mid + 1;
        }
        return -1;
    }
    
    public static int BinarySearchR(int arr[], int start, int end, int x){
        if(start <= end){
            int mid = start + (end - start)/2;
            
            if(arr[mid] == x) 
                return mid;
            
            // If element is smaller than mid, then
            // it can only be present in left subarray
            else if(x < arr[mid]) 
                return BinarySearchR(arr,start, mid-1, x);
            
            // Else the element can only be present
            // in right subarray
            return BinarySearchR(arr,mid+1, end, x);
        }
        return -1;   
    }
    
    
    public static int Frequency(int A[], int x, boolean searchFirst){
        int low = 0, high = A.length - 1, result = -1;

        while(low <= high){
            int mid = (low+high)/2;

            if(A[mid] == x){
                result = mid;
                
                if(searchFirst)
                    high = mid-1; // go on searching towards left or leftmost index or first occurance
                else
                    low = mid+1; // go on searching towards right and gives the maxIndex or last occurance
            }
            else if(x < A[mid])
                high = mid-1;
            else
                low = mid+1;
        }
        return result;
    }
    
    //  The given array is Circularly Sorted
    //  Contains distinct elements
    // If we divided circularly sorted array into two halves, one of the half will always be sorted and minimum element or ans will not lie on the sorted half
    //  Find the number of times array is circularly rotated if given array is sorted in ascending order
    //  The answer will be the index of minimum element

    public static int NumberOfRotations(int arr[])
    {
        int start = 0;
        int n = arr.length;
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
    
}
