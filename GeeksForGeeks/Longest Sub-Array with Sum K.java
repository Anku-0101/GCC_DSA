//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    int K = Integer.parseInt(element[1]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		    int res = obj.lenOfLongSubarr(arr, sizeOfArray, K);
		    
		    System.out.println(res);
		}
	}
}



// } Driver Code Ends


//User function Template for Java
// UNOPTIMIZED
class Solution{
    
   static int maxLen = 0;
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        int i = 0; 
        int j = N-1;
        
        getSum(i,j,A,K);
        return maxLen;
    }
    
    static void getSum(int i, int j, int A[], int K){
        if(i > j){
            return;
        }
        
        int sum = 0;
        
        for(int k = i; k <= j; k++){
            sum += A[k];
        }

        if(sum == K){
            int len = j-i+1;
            if(len > maxLen){
                maxLen = len;
                System.out.println("i = " + i+" j = "+j);
            }
        }
        
        
        getSum(i+1,j,A,K);
        getSum(i,j-1,A,K);    
        
    }
}

public static int lenOfLongSubarr (int A[], int N, int K) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum = 0;
        
        for(int i = 0; i< N; i++){
            sum += A[i];
            if(!hm.containsKey(sum)){
                hm.put(sum,i);
            }
        }
        //System.out.println(hm);
        sum = 0;
        int maxLen = 0;
        for(int i = 0; i < N; i++){
            sum += A[i];
            if(sum == K){
                maxLen = Math.max(maxLen, i+1);
            }
            if(hm.containsKey(sum-K)){
                int len = i - hm.get(sum-K);
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }
    
    
}
