class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int n = nums.length;
        int m = pattern.length;
        
        int count = 0;
        for(int i = 0; i <n; i++){
            boolean flag = true;
            boolean inLoop = false;
            for(int k = 0; k <m && i+m<n; k++){
                inLoop = true;
                //stem.out.print(nums[i+k] + " ");
                if(pattern[k] == 1){
                    if(nums[k+i+1] <= nums[i+k]){
                        flag = false;
                        break;
                    }
                }
                if(pattern[k] == 0){
                    if(nums[k+i+1] != nums[i+k]){
                        flag = false;
                        break;
                    }
                }
                if(pattern[k] == -1){
                    if(nums[k+i+1] >= nums[i+k]){
                        flag = false;
                        break;
                    }
                }
            }
            //stem.out.println();
            if(flag&&inLoop){
                count++;
                //stem.out.println("res i = " + i);
            }
        }
        return count;
    }
}
