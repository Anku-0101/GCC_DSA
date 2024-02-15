class Solution {
    public long largestPerimeter(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;
        int size = nums.length;
        
        for(int i = 0; i < size; i++){
            pq.add(nums[i]);
            sum += nums[i];
        }
        
        while(pq.size()>2){
            int max = pq.poll();
            if(sum > 2*max){
                return sum;
            }
            sum -= max;
        }
        return -1;
    }
}
