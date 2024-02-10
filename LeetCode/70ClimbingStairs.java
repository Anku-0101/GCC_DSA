class Solution {
    int[] arr;
    public int climbStairs(int n) {
        int count = 0;
        arr = new int[46];
        arr[0] = 1;
        int res = getWays(n);
        return res;
        
    }
    int getWays(int n){
        if(n < 0){
            return 0;
        }
        if(arr[n]!=0){
            return arr[n];
        }
        return arr[n]=getWays(n-1)+getWays(n-2);
    }
    
}
