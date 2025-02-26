class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        if(k == n){
            return nums;
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i<n; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (n1,n2) -> hm.get(n1) - hm.get(n2)
        );

        for(int key : hm.keySet()){
            pq.add(key);
            if(pq.size() > k)pq.poll();
        }
        
        int[] ans = new int[k];
        for(int i = 0; i<k; i++)ans[i] = pq.poll();
        return ans;
    }   
}
