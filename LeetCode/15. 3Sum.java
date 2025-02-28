class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> threeSum(int[] nums) {    
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i<n; i++){
            if(i > 0 && nums[i] == nums[i-1])continue;
            if(nums[i] > 0)break;
            int num1 = nums[i];
            getSum(nums, -1*num1, i+1, n-1);
        }
        return ans;
    }
    
    int[] getSum(int[] nums, int target, int start, int end){
        while(start < end){
            
            int sum = nums[start] + nums[end];
            if(sum == target){
                ans.add(new ArrayList<>(Arrays.asList(-1*target, nums[start], nums[end])));
                while(start < end && nums[start] == nums[start+1])start++;
                while(start < end && nums[end-1] == nums[end])end--;
            }
            if(sum > target){
                end--; 
            }else{
                start++;
            }
        }
        return null;
    }
}
