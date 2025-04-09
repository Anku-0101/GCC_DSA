class Solution {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums){
            if(num < k) return -1;
            hs.add(num);
        }
        int count = 0;
        for(int val : hs){
            if(val > k){
                count++;
            }
        }
        return count; 
    }
}
