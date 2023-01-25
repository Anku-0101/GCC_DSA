import java.util.*;

class Main{
    public static void main(String[] args){
        int[] arr = {-3, -1, 2, 3, 5, 8, 9, 10};
        //System.out.println(isSumPresent2Pointer(arr, 3));
        int[] ans = square(arr);
        System.out.println("arr length " + arr.length + " ans length " + ans.length);
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
    
    // 1 4 9 9 25 64 81 100 
    // 0 4 9 9 25 64 81 100 
    public static int[] square(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        int[] res = new int[n];
        int k = n-1;
        
        while(i <= j){
            int first = arr[i]*arr[i];
            int second = arr[j]*arr[j];
            
            if(first >= second){
                res[k--] = first;
                i++;
            }
            else{
                res[k--] = second;
                j--;
            }
        }
        return res;
    }
    
    public static boolean isSumPresent2Pointer(int arr[], int sum){
        int low = 0;
        int high = arr.length-1;
        
        while(low<high){
            if(arr[low]+arr[high]==sum){
                return true;
            }
            if(arr[low]+arr[high]<sum){
                low++;
            }
            else 
                high--;

        }
        return false;
    }

    
    public static boolean isSumPresent(int arr [], int x) {
        int j=0;
        
        for(int i=j+1;i<arr.length;i++){
            if(x-arr[i]==arr[j]){
                return true;
            }
            else
                j++;
        }
        return false;
    }
}
