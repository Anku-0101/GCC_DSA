class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int n = s.length();
        for(int i = 0; i<n; i++){
            char ch = s.charAt(i);
            int count = hm.containsKey(ch)?hm.get(ch)+1:1;
            hm.put(ch,count);
        }
        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>(
            (a,b)->b.getValue()-a.getValue()
        );
        pq.addAll(hm.entrySet());
        
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
                String str = "";
                Character key = pq.peek().getKey();
                int count = pq.poll().getValue();
            
                while(count-- > 0){
                    str += key;
                }
            sb.append(str);
        }
        return sb.toString();
    }
}
