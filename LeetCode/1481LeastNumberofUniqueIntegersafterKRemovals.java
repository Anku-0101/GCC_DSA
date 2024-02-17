class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int val = hm.containsKey(arr[i])?hm.get(arr[i])+1:1;
            hm.put(arr[i],val);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            pq.add(entry.getValue());
        }
        //System.out.println(pq+" pq.peek() = "+pq.peek());
        
        while(!pq.isEmpty() && k>0){
            if(pq.peek() <= k){
                k -= pq.poll();
            }else{
                k=0;
            }
        }
        return pq.size();
    }
}
