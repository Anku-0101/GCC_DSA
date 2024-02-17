class Solution {
    public int maxOperations(int[] nums) {
        int opr = 1;
        int n = nums.length;
        int sum = nums[0]+nums[1];
        for(int i = 2; i <n-1; i += 2){
            if(nums[i]+nums[i+1] == sum){
                opr++;
            }
            else
                return opr;
        }
        return opr;
    }
}
