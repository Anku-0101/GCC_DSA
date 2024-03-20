// TLE
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int sum = 0;
                for(int k =i; k <= j; k++){
                    sum += nums[k];
                }
                if(sum == goal)
                    count++;
            }
        }
        return count;
    }
}

// 
