class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = nums.length;
        int start = 0, end = n-1;
        for(int i = 0; i <n; i++){
            for(int j = i+1; j<n; j++){
                int product = nums[i]*nums[j];
                if(hm.containsKey(product)){
                    hm.put(product, hm.get(product)+1);
                }else{
                    hm.put(product,1);
                }
            }
        }
        //System.out.println(hm);
        int res = 0;
        for(int key : hm.keySet()){
            int count = hm.get(key);
            if(count > 1){
                res += 4*(count*(count-1));
            }
        }
        return res;
    }
}
