
// Unoptimised, time limit will exceed for larger test cases
class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        long maxSum = 0;
        for(int i = 0; i < nums.size(); i++){
            long sum =   getSum(nums, i, i+k, m);
            if( sum > maxSum){
                maxSum = sum;
            }
        }
        return maxSum;
    }
    
    long getSum(List<Integer> nums, int start, int end, int m){
        int n = nums.size();
        if(end > n)
            return 0;
        
        HashSet<Integer> hs = new HashSet<>();
        long sum = 0;
        for(int i = start; i< end; i++){
            hs.add(nums.get(i));
            sum += nums.get(i);
        }
        if(hs.size() < m)
            return 0;
        return sum;
    }
}



// Optimized code using HashMap

class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        long maxSum = 0;
        int n = nums.size();
        if(k > n)
            return 0;
        
        HashMap<Integer, Integer> hs = new HashMap<>();
        long sum = 0;
        
        for(int i = 0; i < k; i ++){
            int num = nums.get(i);
            if(hs.containsKey(num)){
                hs.put(num, hs.get(num)+1);    
            }
            else{
                hs.put(num, 1);
            }
            sum += nums.get(i);
        }
        if(hs.size() >= m){
            maxSum = sum;
        }
        
        for(int i = k; i < n; i++){
            int num = nums.get(i);
            int rem = nums.get(i-k);
            
            if(hs.containsKey(num)){
                hs.put(num,hs.get(num)+1);
            }
            else{
                hs.put(num,1);
            }
            
            if(hs.containsKey(rem)){
                if(hs.get(rem) == 1)   
                    hs.remove(rem);
                else{
                    hs.put(rem,hs.get(rem)-1);
                }
            }
            
            sum += num;
            sum -= rem;                
            
            if(hs.size() >= m && (sum > maxSum)){
                maxSum = sum;
            }
            //System.out.println(" i = " + i +" set = " +hs);
        }
        return maxSum;   
    }
}
