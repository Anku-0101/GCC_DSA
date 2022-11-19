import java.util.Arrays;

public class assignment30Aug {

    private static boolean isSortedArray(int[] array, int n){
        if(n == 1 || n == 0) return true;
        for(int i = 1; i < n; i++){
            if(array[i] < array[i-1] ) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
        boolean isAscending = false;
        if(arr[0] < arr[1])
            isAscending = true;
        
        
        System.out.println("The array " + Arrays.toString(arr) + " " + (isSortedArray(arr, arr.length)?"is":"is not") + " sorted.");
        System.out.println("--------");
        arr = new int[]{1,3,2,4,5};
        System.out.println("The array " + Arrays.toString(arr) + " " + (isSortedArray(arr, arr.length)?"is":"is not") + " sorted.");

    }

    private static boolean isSortedArrayRecursive(int[] array, int n){
        if(n == 1 || n == 0) return true;
        return array[n-2] <= array[n-1] && isSortedArray(array, n-1);
    }

    /*
     * Ascending order
     * public static boolean IsAsc(int[] arr, int size){
        for(int i = 1; i<size; i++){
            if(arr[i] < arr[i-1])
                return false;
        }
        return true;
    }
     */

    public static int BinarySearch(int[] arr, int n, int x){
        int start = 0;
        int end = n-1;

        int itr = 0;
        while(itr++ < 8)
        {
            int mid = (start + end)/2; 
            System.out.printf("Start = %d, mid = %d, end = %d\n",start,mid,end); 
            if(x == arr[mid]) return mid;
            else if(x < arr[mid]) end = mid -1;
            else start = mid + 1;
        }

        return -1;
    }
    
}