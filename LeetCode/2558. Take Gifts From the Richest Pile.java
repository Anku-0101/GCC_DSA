class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int gift : gifts){
            pq.add(gift);
        }
        while(k-- > 0){
            int itm = pq.poll();
            pq.add((int)Math.sqrt(itm));
        }
        long res = 0;
        while(!pq.isEmpty()){
            res += pq.poll();
        }
        return res;
    }
}
