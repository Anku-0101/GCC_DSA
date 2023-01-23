import java.util.*;

class Main{
    public static void main(String[] args){
        //int[] arr = {1,2,2,2,3,3,4,6,7,7,7,7,9,11,11,12,14};        
        //System.out.println("Frequency = " + Frequency(arr, 19));
        
        //int[] arr = {2,3,5,7,9,11,15,18};
        //System.out.println(IsSumExist(arr, 19));
        int[] arr = {-7, -3, 2, 0, 4, 5};
        int[] res = Square(arr);
        for(int i = 0; i < res.length; i++)
            System.out.print(res[i] + " ");
        
    }
    
    // Time complexity : O(n)
    public static int[] Square(int[] arr){
        int i = 0;
        int j = arr.length-1;
        int k = arr.length-1;
        int[] res = new int[arr.length];
        
        while(i <= j){
            if(arr[i]*arr[i] > arr[j]*arr[j]){
                res[k--] = arr[i]*arr[i]; // we're inserting from end of array
                i++;
            }
            else{
                res[k--] = arr[j]*arr[j];
                j--;
            }
        }
        return res;
    }
    
    /*
    private static int[] Square(int[] arr) {
        for(int i=0;i<arr.length;i++) { // O(n)
            int square=arr[i]*arr[i];
            arr[i]=square;
        }
        arr.sort(); // O(n*long(n)) > O(n) , n -> large 
        return arr; //-> 49, 9, 4, 0, 16, 25
    }
    // Time complexity - O(n)
    public static boolean IsSumExist(int[] arr, int sum){
        int start = 0;
        int end = arr.length-1;
        
        while(start < end){
            int res = arr[start] + arr[end];
            if(res == sum)
                return true;
                
            if(res > sum)
                end--;
            else if(res < sum){
                start++;
            }
        }
        return false;
    }
    
    /*
    // ARR = [5,7,8] SUM = 5 -> EXPECTED OUTPUT = FALSE 
    private static boolean isSumExist(int[] arr, int n, int sum) {
        int curr_sum = arr[0];
        int start = 0;
        //to run the loop for adding the element till end
        for (int i = 1; i <= n; i++) {
            //for removing the element from the beginning and to find the starting index for the sum

            while (curr_sum > sum && start < i - 1) {
                curr_sum = curr_sum - arr[start];
                start++;
            }
            if (curr_sum == sum) {
                return true;
            }
            //here we will keep adding the elements
            if (i < n) {
                curr_sum += arr[i];
            }
        }
        return false;
    }*/
    
    // Time complexity - O(n^2)
    public static boolean isSomeExist(int[] a,int t){
        int n=a.length,sum=0;
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                sum=a[i]+a[j];
                if(sum==t)
                    return true;

            }

        }
        return false;
    }


    
    public static int Frequency(int[] arr, int target){
        int startIndex = BinarySearch(arr, target, true);
        System.out.println("Start Index = "+ startIndex);
        
        if(startIndex == -1)
            return 0;
        
        int endIndex = BinarySearch(arr, target, false);
        System.out.println("End Index = "+ endIndex);
        
        return endIndex-startIndex+1;    
    }
    static int BinarySearch(int[] arr, int target, boolean isStart){
        int start = 0;
        int end = arr.length-1;
        int res = -1;
        
        while(start <= end){
            
            int mid = (end+start)/2;
            
            if(arr[mid] == target){
                res = mid;
                if(isStart == true){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            // arr -> 1,2,3,4,5,6
            else if(arr[mid] > target){
                end = mid-1;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
        }
        return res;
    }
}
