class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        int n = nums.length;
        long res = 0;
        Arrays.sort(nums);
        
        // Iterate through the sorted array for each possible left element
        for (int i = 0; i < n - 1; i++) {
            // For each nums[i], find the valid range for nums[j] such that:
            // lower <= nums[i] + nums[j] <= upper
            
            // Find the smallest index for j where nums[i] + nums[j] >= lower
            int lowIndex = findLowIndex(nums, i + 1, n - 1, lower - nums[i]);
            
            // Find the largest index for j where nums[i] + nums[j] <= upper
            int highIndex = findHighIndex(nums, i + 1, n - 1, upper - nums[i]);
            
            // Count valid pairs if lowIndex and highIndex are in valid range
            if (lowIndex <= highIndex) {
                res += (highIndex - lowIndex + 1);
            }
        }
        
        return res;
    }

    // Helper method to find the smallest index for j where nums[i] + nums[j] >= lower
    private int findLowIndex(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    // Helper method to find the largest index for j where nums[i] + nums[j] <= upper
    private int findHighIndex(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }

            
        
}
