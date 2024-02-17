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
        int elementsRemoved = 0;
        while(!pq.isEmpty()){
            elementsRemoved += pq.peek();
            if(elementsRemoved > k){
                return pq.size(); 
            }
            pq.poll();
        }
        return 0;
    }
}
