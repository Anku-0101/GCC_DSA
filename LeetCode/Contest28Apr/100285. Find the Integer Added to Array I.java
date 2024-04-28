class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int min1 = nums1[0];
        int min2 = nums2[0];
        
        for(int i : nums1){
            if(i < min1)
                min1 = i;
        }
        
        for(int i : nums2){
            if(i < min2)
                min2 = i;
        }
        return min2-min1;
    }
}
