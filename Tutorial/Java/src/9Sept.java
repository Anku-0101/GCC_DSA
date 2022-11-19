// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
    
    
public int BinarySearch(int[] arr, int start, int end, int target){           
       while(start <= end){            
       int mid = (start+end)/2;                //Case 1  
       if(arr[mid] == target)
       return mid;  
       if(arr[mid] > target)    
       end = mid -1;    
       else  // arr[mid] < target
       start = mid + 1;
       }
            return -1;
}

public int GetFirstOccurance(int arr[], int size, int target)

    {
        int ind = binarySearch(arr, 0,
                               size - 1, target);
 
        if (ind == -1){ // NOT FOUND
            return -1;
        }
        
        int left = ind;
        while ( left >= 0 && arr[left-1] == target)
        {
            left--;
        }
        return left+1;
}
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] arr = {2,3,4,5,5,5,7,9,11,11,11,11,18,27};
        
        HelloWorld hw = new HelloWorld();
        System.out.println("First occurance of 11 = " + hw.BinarySearchFirstOccurance(arr,14,11));
        
        int leftMostIndex = hw.GetIndex(arr, 14,11,0);
        int rightMostIndex = hw.GetIndex(arr, 14,11,1);
        System.out.println("TOTAL COUNT OF 11 = " + (rightMostIndex - leftMostIndex + 1) );
    }
    
    // flag == 0 -> leftmost
    // flag == 1 -> rightmost
    public int GetIndex(int[] arr, int size, int target, int flag)
    {
        int start = 0;
        int end  = size-1;
        int result = -1;
        
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid] == target)
            {
                result = mid;
                if(flag == 0) end = mid -1; // left most index
                else start = mid + 1;  // right most index
            }
            else if(arr[mid] > target) end = mid -1;
            else start = mid +1;
        }
        return result;
    }
    
    int BinarySearchFirstOccurance(int[] arr, int size, int target)
    {
        int start = 0;
        int end = size-1;
        
        int result = -1;
    
        while(start <= end)
        {
            int mid  = start + (end - start)/2;
            
            if(arr[mid] == target)
            {
                result = mid;
                end = mid -1; // for Right most => start = mid+1
            }
            else if(arr[mid] > target) end = mid -1;
            else start = mid +1;
        }
        return result; // left most index
    }
}