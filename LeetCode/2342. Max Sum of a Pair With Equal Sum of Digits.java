class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        HashMap<Integer, Integer> hm2 = new HashMap<>();
        int maxSum = -1;
        int res = -1;
        int n = nums.length;
        for(int i = 0; i<n; i++){
            int sum = sumOfDigits(nums[i]);
            if(hm1.containsKey(sum) && hm2.containsKey(sum)){
                int num1 = hm1.get(sum);
                int num2 = hm2.get(sum);
                int minm = num1 > num2 ? num2 : num1;
                if(minm == num1 && minm < nums[i]){
                    hm1.put(sum,nums[i]);
                }
                else if(minm == num2 && minm < nums[i]){
                    hm2.put(sum,nums[i]);
                }
                if(res < (hm1.get(sum) + hm2.get(sum))){
                    res = hm1.get(sum) + hm2.get(sum);
                }
                
            }
            if(hm1.containsKey(sum) && !hm2.containsKey(sum)){
                hm2.put(sum,nums[i]);
                int numSum = hm1.get(sum) + hm2.get(sum);
                if(numSum > res){
                    res = numSum;
                }
            }
            if(!hm1.containsKey(sum)){
                hm1.put(sum,nums[i]);
            }
        }
        return res;
    }
    int sumOfDigits(int n){
        int sum = 0;
        while(n > 0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}
// Can also be solved by HashMap<Integer, PriorityQueue<Integer>>

// highly optimized solution
class Solution {
    public int maximumSum(int[] nums) {
        int[] max = new int[100];
        int ans = -1;
        for(int x : nums){
            int dsum = 0;
            int temp = x;
            while(temp != 0){
                dsum += temp % 10;
                temp /= 10;
            }
            if(max[dsum] != 0) ans = Math.max(ans, x + max[dsum]);
            max[dsum] = Math.max(max[dsum], x);
        }
        return ans;
    }
}
