class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long max =0, ans =0, maxDiff = 0;
        for(int num : nums){
            ans = Math.max(ans, num*maxDiff);
            max = Math.max(max, num);
            maxDiff = Math.max(maxDiff, max-num);
        }
        return ans;
    }
}
    /* Unoptimized
    long maxRes = 0;
        for(int i = 0; i<n-1; i++){
            long num1 = nums[i];
            for(int j = i+1; j<n-1; j++){
                long num2 = nums[j];
                for(int k = j+1; k<n; k++){
                    long num3 = nums[k];
                    long res = (num1-num2)*num3;
                    if(res > maxRes){
                        maxRes = res;
                    }
                }
            }
        }
        return maxRes > 0 ? maxRes : 0;
    */
        /* WRONG
        long min = nums[1];
        int minIndex = 1;

        for(int i = 2; i<n-1; i++){
            if(nums[i] < min){
                min = nums[i];
                minIndex = i;
            }
        }
        long maxL = nums[0];
        for(int i = 0; i<minIndex; i++){
            if(nums[i] > maxL){
                maxL = nums[i];
            }
        }
        long maxR = nums[minIndex+1];
        for(int i = minIndex+2; i<n; i++){
            if(nums[i] > maxR){
                maxR = nums[i];
            }
        }
        System.out.println("min = "+min + " minIndex = "+ minIndex + " maxL = "+maxL + " maxR = "+maxR);
        long res = (maxL-min)*maxR;
        return res > 0 ? res : 0;*/
