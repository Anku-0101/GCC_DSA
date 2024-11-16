class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n-k+1];
        int idx = 0;

        for(int i = 0; i <=n-k; i++){
            int start = nums[i];
            boolean isFound = true;
            for(int j = i+1; j<i+k;j++){
                if(nums[j]-start == 1){
                    start = nums[j];
                }else{
                    res[idx++] = -1;
                    isFound = false;
                    break;
                }
            }
            if(isFound){
                res[idx++] = start;
            }
        }
        return res;
    }
}
