class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int sum = 0;
        hm.put(0,1); // initializing prefix sum = 0, having freq = 1 to account for the case when prefixSum from start = sum, there's one more version to omit this initialization
        for(int i = 0; i < n; i++){
            sum += nums[i];
            if(hm.containsKey(sum-k)){
                ans += hm.get(sum-k);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}

public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        int sum = 0;

        for(int i = 0; i < n; i++){
            sum += nums[i];
            if(sum == k){
                count++;
            }
            if(hm.containsKey(sum-k)){
                count += hm.get(sum-k);
            }
            int val = hm.containsKey(sum)?hm.get(sum)+1:1;
            hm.put(sum,val);
        }
        return count;
    }
}
