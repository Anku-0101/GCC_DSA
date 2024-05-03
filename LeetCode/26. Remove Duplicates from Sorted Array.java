class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i < n){
            list.add(nums[i]);
            while(i<n-1 && nums[i] == nums[i+1]){
                i++;
            }
            i++;
        }
        for(i = 0; i < list.size(); i ++){
            nums[i] = list.get(i);
        }
        return list.size();
    }
}
//// Simple cleaner solution
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int x = 101;
        int k = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] != x){
                x = nums[i];
                nums[k++] = x; 
            }
        }
        return k;
    }
}
