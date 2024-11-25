class Solution {
    public boolean primeSubOperation(int[] nums) {
        boolean[] primes = new boolean[10001];
        Arrays.fill(primes,true);
        getPrimes(primes);
        int n = nums.length;
        for(int i = n-2; i>=0; i--){
            if(nums[i] >= nums[i+1]){
                int diff = nums[i]-nums[i+1];
                boolean isFound = false;
                for(int j = diff+1; j<nums[i];j++){
                    if(primes[j]){
                        isFound = true;
                        nums[i] -= j;
                        break;
                    }
                }
                if(!isFound){
                    return false;
                }
            }
        }

        return true;
    }

    void getPrimes(boolean[] primes){
        int n = primes.length;
        primes[0]=primes[1]=false;
        for(int i = 2; i*i<n; i++){
            if(primes[i]){
                for(int j = i*i; j<n; j +=i){
                    primes[j] = false;
                }
            }
        }
    }
}
