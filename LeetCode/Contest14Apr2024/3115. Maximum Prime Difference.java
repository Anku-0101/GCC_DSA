class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int startIndex = 0;
        int endIndex = 0;
        int n = nums.length;
        for(int i = 0; i<n; i++){
            if(isPrime(nums[i])){
                startIndex = i;
                break;
            }
        }
        for(int i = n-1; i>=0; i--){
            if(isPrime(nums[i])){
                endIndex = i;
                break;
            }
        }
        return endIndex-startIndex;
    }
    boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        if(n == 2){
            return true;
        }
        for(int i = 2; i*i <= n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
