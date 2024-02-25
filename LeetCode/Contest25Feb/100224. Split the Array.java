class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int count = hm.containsKey(num)?hm.get(num)+1:1;
            if(count>2)
                return false;
            hm.put(num,count);
        }
        return true;
    }
}
