class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        int[][] arr = new int[n/3][3];
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < n; i++){
            pq.add(nums[i]);
        }
        int index = 0;
        while(!pq.isEmpty()){
            int a = pq.poll();
            int b = pq.poll();
            int c = pq.poll();
            
            if(c-a>k){
                return new int[0][0];
            }
            arr[index][0] = a;
            arr[index][1] = b;
            arr[index][2] = c;
            index++;
        }
        return arr;
    }
}
