class Solution {
    public int minimumIndex(List<Integer> nums) {
        int n = nums.size();
        int maxCount = 0,maxFreqElement = nums.get(0);
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i<n; i++){
            int num = nums.get(i);
            hm.put(num, hm.getOrDefault(num,0)+1);
            if(hm.get(num)>n/2){
                maxFreqElement = num;
                maxCount = hm.get(num);
            }
        }
        //System.out.println("maxcount = " + maxCount + " maxFreqEle = "+maxFreqElement);
        if(maxCount == 0)return -1;
        int index = 0, count = 0;
        for(int i = 0; i<n; i++){
            int num = nums.get(i);
            if(maxFreqElement == num){
                count++;
            }
            if(count*2 > i+1 && (maxCount-count)*2 > n-i-1){
                return i;
            }
        }
        return -1;
    }
}
