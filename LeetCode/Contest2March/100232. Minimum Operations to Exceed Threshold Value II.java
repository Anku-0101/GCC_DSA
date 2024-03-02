class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        int n = nums.length;
        for(int i = 0; i<n; i++){
            pq.add((long)nums[i]);
        }
        
        int count = 0;
        
        while((pq.size()>1) && pq.peek()<k){
            Long x = pq.poll();
            
            if(x < k){
                Long y = pq.poll();    
                pq.add(x*2+y);
                count++;
            }
        }
        return count;
    }
}
