class Solution {
    public int findJudge(int n, int[][] trust) {
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        int size = trust.length;
   
        for(int i =1; i <=n; i++)set.add(i);
        
        
        for(int i = 0; i<size; i++){
            int ele = trust[i][0];
            if(set.contains(ele))
                set.remove(ele);
        }
        
        
        if(set.size()!=1){
            return -1;    
        }
        int key=0;
        for(Integer elem : set)key = elem;
        
        for(int i = 0; i < size; i++){
            int ele = trust[i][0];
            int val = trust[i][1];
            
            if(val == key){
                hm.put(ele, val);
            }
        }
        for(int i = 1; i<=n; i++){
            if(i != key){
                if(!hm.containsKey(i))
                    return -1;
            }
        }
        return key;
    }
}
