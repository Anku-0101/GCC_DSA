// TLE
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i<n; i++){
            for(int j = i; j<n;j++){
                int pro = 1;
                for(int m = i; m <= j; m++){
                    pro *= nums[m];
                    if(pro > k){
                        break;
                    }
                }
                if(pro < k){
                    count++;
                }
            }
        }
        return count;
    }
}

// Optimization ----
