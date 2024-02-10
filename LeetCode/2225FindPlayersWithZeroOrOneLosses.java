class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int n = matches.length;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> win = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < n; i++){
            int loss = matches[i][1];
            int won = matches[i][0];
            int count = map.containsKey(loss)?(map.get(loss)+1):1;
            map.put(loss,count);
            set.add(loss);
            set.add(won);
        }
        for(Integer key : map.keySet()){
            set.remove(key);
            if(map.get(key) == 1){
                one.add(key);
            }
        }
        for(Integer val : set){
            win.add(val);
        }
        Collections.sort(win);
        Collections.sort(one);
        
        res.add(win);
        res.add(one);
        
        return res;
    }
}
