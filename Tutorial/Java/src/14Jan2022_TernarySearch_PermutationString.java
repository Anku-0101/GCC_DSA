import java.util.*;

class Main{
    
    public static void main(String[] args){
        //Permutation("abcd");
        int arr[] = {2,4,5,7,9,11,13,15,17,19};
        System.out.println(TernarySearch(arr, 2, 0, arr.length-1));
    }
    
    // TC - O(log3 n)
    // SC - O(log3 n)
    public static int TernarySearch(int[] arr, int target, int start, int end) {
        if(start > end)
            return -1;
            
        int mid1 = start + (end-start)/3;
        int mid2 = end - (end-start)/3;

        if(target==arr[mid1])
            return mid1;
            
        if(target==arr[mid2])
            return mid2;
            
        if(target<arr[mid1])
            return TernarySearch(arr, target, start, mid1-1);

        else if(target>arr[mid2])
            return TernarySearch(arr, target, mid2+1, end);

        return TernarySearch(arr, target, mid1+1, mid2-1);

    }
    
    // TC - O(log3(n))
    // SC  - O(1)
    public static int TernarySearchI(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start<=end) {
            int mid1 = start + (end-start)/3;
            int mid2 = end - (end-start)/3;
            
            if(target == arr[mid1])
                return mid1;
                
            if(target == arr[mid2])
                return mid2;
                
            if(target < arr[mid1]){
                end = mid1 - 1;
                
            }
                
            if(target > arr[mid2]){
                start = mid2 + 1;
                
            }
                
            else if(target > arr[mid1] && target < arr[mid2]){
                start=mid1+1;
                end=mid2-1;
            }
        }
        return -1;
    }
    
    // Time Complexity - O(n* n!)
    // Space Complexity - O(n)
    public static void Permutation(String str){
        Permutation(str, 0, str.length()-1);
    }
    
    public static void Permutation(String str, int l, int r){
        if(l == r){
            System.out.println(str);
            return;
        }
        
        for(int i = l; i <= r; i++){
            str = Swap(str, l, i);
            Permutation(str, l+1, r);
            str = Swap(str, l, i); // backtracking 
        }
        
    }
    
    public static String Swap(String str , int i , int j ){
        ArrayList <Character> list = new ArrayList<>();
        
        for(int m=0; m < str.length(); m++){
            list.add(str.charAt(m));
        }
        
        char temp = list.get(i);
        char temp2 = list.get(j);
        
        list.set(i, temp2);
        list.set(j, temp);
        
        String res = "";
        for(int m=0; m < list.size(); m++){
            res += list.get(m);
        }
        return res;
    }
    
}
