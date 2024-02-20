//TLE
class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        
        int max = 0;
        for(int i = 0; i < n; i++){
            for(int j =0; j <m;j++){
                String s1 = ""+arr1[i];
                String s2 = ""+arr2[j];
                int count = 0;
                for(int k = 0; k < Math.min(s1.length(),s2.length());k++){
                    if(s1.charAt(k)==s2.charAt(k)){
                        count++;
                        if(count > max)
                            max = count;
                    }else{
                        break;
                    }
                }
            }
        }
        
        return max;
    }
}

// Optimized Solution??
