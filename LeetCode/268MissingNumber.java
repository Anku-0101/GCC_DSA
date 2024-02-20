// This is a general solution making use of mathematical formula 1+2+3+4 ... + n = n(n+1)/2
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        return (n*(n+1)/2 - sum);
    }
}

// We can use xor operator to optimize this even further
// a^a = 0, a^0 = a, a^b = a^b
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor = 0;
        int start = 1;
        for(int i : nums){
            xor = xor^i^(start++);
        }
        return xor;
    }
}
