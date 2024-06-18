class Solution {
    public boolean judgeSquareSum(int c) {
        for(int i = 0; i*i <= c; i++){
            long x = c-i*i;

            long start = 0;
            long end = x;

            while(start <= end){
                long mid = start + (end-start)/2;
                long val = mid*mid;
                
                if(val == x){
                    return true;
                }
                if(val > x){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return false;
    }
}

class Solution {
    public boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            int b = c - (int)(a * a);
            if (binary_search(0, b, b))
                return true;
        }
        return false;
    }
    public boolean binary_search(long s, long e, int n) {
        if (s > e)
            return false;
        long mid = s + (e - s) / 2;
        if (mid * mid == n)
            return true;
        if (mid * mid > n)
            return binary_search(s, mid - 1, n);
        return binary_search(mid + 1, e, n);
    }
}
