class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int start = 0, end = n-1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                int fst = mid, lst = mid;
                while(fst-1 >= 0 && nums[fst - 1] == target){
                    fst--;
                }
                while(lst+1 < n && nums[lst+1] == target){
                    lst++;
                }
                return new int[]{fst,lst};
            }
            if(nums[mid] > target ){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}
