import java.util.*;

class Main{
    public static void main(String[] args){
        //String str = "  ab c de. ";
        //System.out.println(Trim(str));
        int[] arr = {1,2,1,3,1,2,2};
        int[] arr2 = {3,4,5,1,2};
        //System.out.println(countDistinct(arr));
        //int[] res = union(arr, arr2);
        //print(res);    
        ArrayList<Integer> ans = Intersection(arr, arr2);
        System.out.println(ans);
    }
    
    public static void SubArray(int [] arr, int k){
        for(int i=0; i<arr.length-1; i++){
            int sum =0;
            for(int j=i+1; i<arr.length;j++){
                sum += arr[i]+arr[j];
                if(sum==k)
                    System.out.println(i+" "+ j);
                    break;
                }
        }
    }
    
    // TC - O(n)
    public static ArrayList<Integer> Intersection(int a[], int b[]){
        HashSet <Integer> s = new HashSet <>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<a.length;i++){
            s.add(a[i]);
        }
        
        for(int i=0; i<b.length; i++){
            if(s.contains(b[i])){
                list.add(b[i]);
            }
        }
        return list;
    }
    
    public static void print(int[] arr){
        for(int i = 0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
        
        System.out.println();
    }
    
    // TC - O(N)
    public static int [] union(int a[], int b[]){
        HashSet<Integer> s = new HashSet <>();
        
        for(int i=0; i<a.length;i++){
            s.add(a[i]);
        }
        
        for(int i=0; i<b.length; i++){
            s.add(b[i]);
        }

        int arr [] = new int[s.size()];
        int i=0;
        Iterator it = s.iterator();
        
        while(it.hasNext()){
            arr[i++] = (int)it.next();
        }
        
        return arr;
    }
    
    // TC - O(N)
    public static int countDistinct(int arr []){
        HashSet <Integer> set = new HashSet <> ();
        
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        return set.size();
    }
    
    public static String Trim(String str){
        int start =0, end =str.length()-1;
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' ')
                break;
            start++;
        }
        
        for(int i = str.length() -1; i >= 0; i--){
            if(str.charAt(i) != ' ')
                break;
            end--;
        }
        
        //Q. Optimize with //StringBuilder sb = new StringBuilder();
        String ans = "";
        for(int i = start; i <= end;  i++){
            ans += str.charAt(i);
        }
        
        
        return ans;
    }
   
}
