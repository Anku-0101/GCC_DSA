class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        int[] hash = new int[n];
        int[] dp = new int[n];
        for(int i =0; i<n; i++)dp[i]=1;
        int maxi = 1;
        int lastIndex = 0;

        Arrays.sort(nums);
        for(int i =0; i<n; i++){
            hash[i] = i;
            for(int prev = 0; prev < i; prev++){
                if(nums[i] % nums[prev] == 0 && 1 + dp[prev] > dp[i]){
                    dp[i] = 1 + dp[prev];
                    hash[i] = prev;
                }
            }
            if(dp[i] > maxi){
                maxi = dp[i];
                lastIndex = i;
            }
        }
        List<Integer> tmp = new ArrayList<>();
        tmp.add(nums[lastIndex]);

        while(hash[lastIndex] != lastIndex){
            lastIndex = hash[lastIndex];
            tmp.add(nums[lastIndex]);
        }
        return tmp;
    }
}


/* Will fail
class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        HashMap<Integer, PriorityQueue<Integer>> hm = new HashMap<>();
        for(int num : nums){
            boolean isFound = false;
            for(Integer key : hm.keySet()){
                if(key%num == 0 || num%key == 0){
                    isFound = true;
                    PriorityQueue<Integer> pq = hm.get(key);
                    pq.add(num);
                    hm.remove(key);
                    hm.put(pq.peek(), pq);
                    break;
                }
            }
            if(!isFound){
                hm.put(num, new PriorityQueue<>(Collections.reverseOrder()));
                hm.get(num).add(num);
            }
        }
        PriorityQueue<Integer> tmp = new PriorityQueue<>(Collections.reverseOrder());
        int count = 0;
        for(Integer key : hm.keySet()){
            System.out.println(hm.get(key));
            if(hm.get(key).size() > count){
                count = hm.get(key).size();
                tmp = hm.get(key);
            }
        }
        List<Integer> res = new ArrayList<>();
        while(!tmp.isEmpty()){
            res.add(tmp.poll());
        }
        return res;
    }
}*/
