class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int prev = nums[0];
        int count = 1;

        for(int i = 1; i < n; i++){
            int curr = nums[i];
            if(prev == curr){
                count++;
            }else if(count == 0){
                prev = curr;
            }else{
                count--;
            }
        }
        return prev;
    }
}
