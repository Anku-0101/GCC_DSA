class Solution {
    public int minimizedMaximum(int n, int[] quantities) {        
        int start = 1, end = 100000;

        while(start <= end){
            int mid = start+ (end-start)/2;
            if(isValid(mid, n, quantities)){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return start;
    }

    boolean isValid(int i, int n, int[] quantities){
        long  res = 0;
        for(int j = 0; j<quantities.length; j++){
            res += quantities[j]/i;
            res += quantities[j]%i != 0 ? 1 : 0;
        }
        return res <= n;
    }
}
