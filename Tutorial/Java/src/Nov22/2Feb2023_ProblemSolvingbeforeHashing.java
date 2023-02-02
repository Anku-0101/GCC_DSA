import java.util.*;

class Main{
    public static void main(String[] args){
        int[] arr = {2,3,4,5,2,4,5,1};
        int[] arr2 = {2,5,9,0,-3};
        //Random(arr);
        //System.out.println(countDistinct(arr));
        int[] res = intersection(arr, arr2);
        for(int i = 0; i < res.length; i++)
            System.out.print(res[i] + " ");
        
    }
    
    // TC - O(N^2)
    // SC - O(N)
    public static int[] intersection(int[] arr1, int[] arr2){
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i = 0; i < arr1.length; i++){
            if(contains(arr2, arr1[i]) && !contains(res,arr1[i])){
                res.add(arr1[i]);
            }
        }
        return convertIntegerArrayListToArray(res);
    }
    public static int[] convertIntegerArrayListToArray(ArrayList<Integer> arr){
        int ans[] = new int[arr.size()];
        for(int i = 0; i<arr.size(); i++){
            ans[i] = arr.get(i);
        }
        
        return ans;
    }
    
    //TC - O(N^2)
    // SC - O(n)
    public static int[] union(int[] arr1, int[] arr2){
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i = 0; i < arr1.length; i++){
            if(!contains(res, arr1[i]))
                res.add(arr1[i]);
        }
        
        for(int i = 0 ;  i< arr2.length; i++){
            if(!contains(res,arr2[i]))
                res.add(arr2[i]);
        }
        
        return convertIntegerArrayListToArray(res);
    }
    
    public static boolean contains(int[] arr, int value){
        for(int i =0; i<arr.length; i++){
            if(arr[i] == value)
                return true;
        }
        return false;
    }
    
    // O(n)
    public static boolean contains(ArrayList<Integer> arr, int value){
        for(int i =0; i<arr.size(); i++){
            if(arr.get(i) == value)
                return true;
        }
        return false;
    }
    
    //TC - O(nlog(n))
    public static int Count(int []arr){
        if(arr.length == 0)
            return 0;
            
        Arrays.sort(arr);
        int count = 1;
        
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                count++;
            }
        }
        
        return count;
    }
    
    // TC -> O(n^2)
    static int countDistinct(int[] arr){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            int flag = 0;
            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
                count++;
        }
        return count;
    }


    static void Random(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int n = arr.length;
        while(start < end){
            int ptr = (start+end)/2;
            int index1 = (start+end)%n;
            
            int temp = arr[ptr];
            arr[ptr] = arr[index1];
            arr[index1] = temp;
            
            start++; end--;
        }
    }
    
}
