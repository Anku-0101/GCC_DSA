class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int inc = 1, maxInc = 1;
        int dec = 1, maxDec = 1;
        for(int i = 0; i<n-1; i++){
            if(nums[i] < nums[i+1]){
                inc++;
                maxInc = (inc > maxInc) ? inc : maxInc;
            }else{
                inc = 1;
            }
        }
        for(int i = 0; i<n-1; i++){
            if(nums[i] > nums[i+1]){
                dec++;
                maxDec = (dec > maxDec) ? dec : maxDec;
            }else{
                dec =1;
            }
            
        }
        return (maxInc > maxDec) ? maxInc : maxDec;
    }
}

// Using one loop
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int decLen = 1, incLen = 1, maxLen = 1;
        for(int i = 0; i<n-1; i++){
            if(nums[i] < nums[i+1]){
                incLen++;
                decLen = 1;
            }
            else if(nums[i] > nums[i+1]){
                decLen++;
                incLen = 1;
            }
            else{
                incLen=1; decLen=1;
            }
            maxLen = (incLen > decLen) ? Math.max(incLen,maxLen) : Math.max(decLen,maxLen);
        }
        return maxLen;
    }
}
