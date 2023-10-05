class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<Integer>();
        int index = 0;            
        solve(nums, arr, ans, index);
        return ans;   
    }

    void solve(int[] nums, List<Integer> arr, List<List<Integer>> ans, int index){
        int n = nums.length;
        if(index >= n){
            ans.add(new ArrayList<>(arr));
            return;
        }
        solve(nums, arr, ans, index+1);
        arr.add(nums[index]);
        solve(nums, arr, ans, index+1);
        arr.remove(arr.size()-1);
    }
}
