import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static long pairSum(int[]arr, int k){
        HashMap<Integer, Integer> remMap = new HashMap<>();
        long ans = 0;
        for(int i = 0; i < arr.length; i++){
            int rem = arr[i]%k;
            ans += remMap.containsKey((k-rem)%k) ? remMap.get((k-rem)%k) : 0;

            if(remMap.containsKey(rem)){
                int count = remMap.get(rem);
                remMap.put(rem, count+1);
            }
            else{
                remMap.put(rem, 1);
            }
            
        }
        return ans;
    }
    public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int k = sc.nextInt();

        int[] arr = new int[n];
       for(int i = 0; i < n; i++){
           arr[i] = sc.nextInt();
       }

       System.out.println(pairSum(arr,k));
    }
}

///////////

// Check for valid paranthesis
// paranthesis includes - () , [], {}

import java.util.*;

class Main{
    public static void main(String[] args){  
        System.out.println(isBalanced("(){{[(]}}"));
    }

    public static boolean isBalanced(String str){
        Stack<Character> st = new Stack<Character>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            boolean isValid = false;
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            else{
                char atTop = st.peek();
                if(ch == ')' && atTop == '('){
                    st.pop();
                    isValid = true;
                    continue;
                }
                
                if(ch == ']' && atTop == '['){
                    st.pop();
                    isValid = true;
                    continue;
                }
                
                if(ch == '}' && atTop == '{'){
                    st.pop();
                    isValid = true;
                    continue;
                }

                if(!isValid){
                    return false;
                }
            }
        }
        
        return st.isEmpty();
    }
}
