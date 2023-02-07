import java.util.*;

class Main{
    public static void main(String[] args){
        /*String[] ans = split(' ', "ab p q  tz  ");
        for(int i = 0; i < ans.length; i++){
            System.out.println(ans[i]);
        }*/
        int arr[] = {3,4,4,-1,0,9,2,9,2};
        //System.out.println(SubArray(arr));
        //SubArray(arr, 10);
        //kdistinct(arr, 3);
    }
    
    // (Klog(K) -- > (n-k+1))
    // TC : (nKlog(K))
    public static void kdistinct(int[] a, int k){
        int[] b=new int[k];
        for(int i=0;i<((a.length-k)+1);i++){
            int l=0;
            
            for(int j=i;j<k+i;j++){
                b[l++]=a[j];
            }
            
            int count=distinctElement(b);
            System.out.println(count+" ");

        }
    }
    
    public static int distinctElement(int[] arr){
        Arrays.sort(arr);
        int count=0;
        
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                count++;
            }
        }
        return count+1;
    }
    
    // TC - (n^2)
    public static ArrayList<ArrayList<Integer>> AllSubArray(int[] a){
        int n = a.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<n; i++){
            for(int j=i;j<n; j++){
                ArrayList<Integer> sub = new ArrayList<>();
                for(int k=i;k<=j;k++){
                    sub.add(a[k]);
                }
                ans.add(sub);
            }
        }
        return ans;
    }
    
    // TC - (n^3)
    public static void SubArray(int[] a, int sum){
        int n = a.length;
        
        for(int i=0; i<n; i++){
            for(int j=i;j<n; j++){
                ArrayList<Integer> sub = new ArrayList<>();
                for(int k=i;k<=j;k++){
                    sub.add(a[k]);
                }
                int sum_sub = getSum(sub);
                if(sum_sub == sum){
                    System.out.println("start = " + i);
                    System.out.println("end = " + j);
                    return;
                }
            }
        }
        
        System.out.println("Not found");
    }
    
    static int getSum(ArrayList<Integer>  list){
        int sum = 0;
        for(int i = 0; i < list.size(); i++)
            sum += list.get(i);
        
        return sum;
    }
    
    
    public static String[] split(char seperator, String inp){
        String ans = "";
        ArrayList<String> res = new ArrayList<>();
        
        for(int i = 0; i < inp.length(); i++){
            if(inp.charAt(i) == seperator){
                res.add(ans);
                ans = "";
                continue;
            }
            ans += inp.charAt(i);
        }
        
        res.add(ans);
        return ConvertArrayListStringToArray(res);
    }     
    
    static String[] ConvertArrayListStringToArray(ArrayList<String> list){
        int n = list.size();
        String[] arr = new String[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = list.get(i);
        }
        
        return arr;
    }
}
