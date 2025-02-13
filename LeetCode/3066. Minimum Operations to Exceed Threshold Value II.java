class Solution {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i<nums.length; i++){
            if(nums[i] < k){
                pq.add(nums[i]);
            }
        }
        int res = 0;
        while(!pq.isEmpty()){
            res++;
            int num1 = pq.poll();
            if(pq.isEmpty())break;
            int num2 = pq.poll();
            long num = 2l*num1+num2;
            if(num < (long)k)pq.add((int)num);
        }
        return res;
        
    }
}
