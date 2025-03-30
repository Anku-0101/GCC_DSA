class Solution {
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i<n; i++){
            hm.put(s.charAt(i), i);
        }
        List<Integer> ls = new ArrayList<>();
        int i = 0;
        while(i < n){
            int maxIdx = hm.get(s.charAt(i));
            //System.out.println("loop start i = " + i + " maxIdx = " + maxIdx);
            for(int j = i+1; j<=maxIdx; j++){
                if(hm.get(s.charAt(j)) > maxIdx){
                    maxIdx = hm.get(s.charAt(j));
                }
            }
            ls.add(maxIdx-i+1);
            //System.out.println("loop end i = " + i + " maxIdx = " + maxIdx);
            i = maxIdx +1;
        }
        return ls;
    }
}
