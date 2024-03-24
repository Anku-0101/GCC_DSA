class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        
        int fast = 0;
        int slow = 0;

        do{
            //System.out.println("beg slow = "+slow+" fast = "+fast);
            slow = nums[slow];
            fast = nums[nums[fast]];
            //System.out.println("end slow = "+slow+" fast = "+fast);
        }while(fast != slow);

        slow = 0;
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
