 public static void N_And_2XN(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]a = new int[n];

        for(int i=0; i<n; i++){
            a[i] =sc.nextInt();
        }
        Arrays.sort(a); // O(n*log(n));

        boolean found = false;

        // in the worst case how many times is binary search called
        // O(n*long(n))
        // for binary search - log(n)
        // here we're calling binary search n number of times 
        // so total complexity = O(n*log(n))
        for(int i=0; i<n; i++){
            if(binarySearch(a, a[i]*2)){ // arr[i] != 2*arr[i], arr[i] >= 1
                found = true;
                break;
            }
        }
        
        if(found){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
       
    }

    // TC : log(n)
    static boolean binarySearch(int[] arr, int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start <= end){
            int mid = start +(end-start)/2; // to prevent overflow
            if(arr[mid] == target){
                return true;
            }

            if(arr[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }
import java.util.*;


class Main{    
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.println(isArraySorted(arr));
        
    }
    static boolean isArraySorted(int[] arr, int start, int end){
        return true;
    }
    
    static boolean isArraySorted(int[] arr){
        boolean isAscending = true;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                isAscending = false;
                break;
            }
        }
        
        boolean isDescending = true;
        for(int i = 1; i < arr.length; i++){
            if(arr[i-1] < arr[i]){
                isDescending = false;
                break;
            }
        }
        
        return (isAscending || isDescending);
    }    
    
    static int getMaxElement(int[] arr){
        int i;
        int max = arr[0];
        
        for (i = 1; i < arr.length; i++){
            if (arr[i] > max)
                max = arr[i];
        }
        
        return max;
    }
    
    static int getMinElement(int[] a){
        int m =a[0];

        for (int i = 1; i < a.length; i++){
            if (a[i] < m){
                m = a[i];
            }
        }
        return m;
        
    }
    static int getMaxIndex(int[] arr){
        int index = 0;
        int max = arr[index];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>=max){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
    static int getMinIndex(int[] arr){
        int index = 0;
        int min = arr[index];
        
        for (int i = 1; i < arr.length; i++){
            if (arr[i] <= min){
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
    
    
    
    
}
