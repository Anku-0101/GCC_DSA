class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int arr[] = new int[n];
        if(k == 0){
            return arr;
        }

        int start = (k > 0) ? 1 : n+k;
        int end = (k > 0) ? k : n-1;

        int windowSum  = 0;
        for(int i = start; i <= end; i++){
            windowSum += code[i];
        }
        
        for(int i = 0; i<n; i++){
            arr[i] = windowSum;
            
            windowSum -= code[start];
            start = (start+1)%n;
            end = (end+1+n)%n;
            windowSum += code[end];
        }
        return arr;
    }
}
