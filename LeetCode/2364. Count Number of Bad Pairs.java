class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        // j - i = nums[j] - nums[i]
        // j - nums[j] = i - nums[i]
        for(int i =0; i<n; i++){
            int val = i - nums[i];
            hm.put(val, hm.getOrDefault(val,0)+1);
        }
        long goodPairs = 0;
        for(var key : hm.keySet()){
            if(hm.get(key) > 1){
                long count = hm.get(key);
                goodPairs += count*(count-1)/2;
            }
            
        }
        long totalPairs = (long)n*(n-1)/2;
        //System.out.println("good pairs = " + goodPairs + " total pairs = "+totalPairs);
        return totalPairs-goodPairs;
    }
}

class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        long badPairs = 0;
        HashMap<Integer, Integer> diffCount = new HashMap<>();
        for(int i = 0; i<n; i++){
            int diff = i - nums[i];
            int goodPair = diffCount.getOrDefault(diff,0);
            badPairs += i-goodPair;
            diffCount.put(diff, goodPair+1);
        }
        return badPairs;
    }
}
