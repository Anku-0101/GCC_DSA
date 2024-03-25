class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        int n = nums.length;
        for(int i = 0; i <n; i++){
            if(hs.contains(nums[i]))
                res.add(nums[i]);
            else
                hs.add(nums[i]);
        }
        return res;
    }
}

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        
        int n = nums.length;
        
        for(int i = 0; i <n; i++){
            int num = Math.abs(nums[i]);
            if(nums[num-1] < 0){
                res.add(num);
            }else{
                nums[num-1] = -1*nums[num-1];
            }
        }
        return res;
    }
}
