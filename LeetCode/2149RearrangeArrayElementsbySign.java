class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        Queue<Integer> positive = new LinkedList<>();
        Queue<Integer> negative = new LinkedList<>();
        
        for(int i = 0; i < n; i++){
            if(nums[i] >= 0)
                positive.add(nums[i]);
            else
                negative.add(nums[i]);
        }
        int idx = 0;
        while(!positive.isEmpty()|| !negative.isEmpty()){
            if(idx%2 == 0){
                nums[idx]=positive.poll();
            }else{
                nums[idx]=negative.poll();
            }
            idx++;
        }
        return nums;
    }
}

// 2nd solution

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        
        int evn =0,odd=1;
        int[] arr =new int[n];
        for(int i =0; i <n; i++){
            if(nums[i]>=0){
                arr[evn] = nums[i];
                evn +=2;
            }else{
                arr[odd] = nums[i];
                odd +=2;
            }
        }
        return arr;
    }
}
