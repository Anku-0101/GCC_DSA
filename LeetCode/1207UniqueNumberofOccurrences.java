class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i = 0; i < n; i++){
            int val = map.containsKey(arr[i])?(map.get(arr[i])+1):1;
            map.put(arr[i],val);
        }
        for(Integer val : map.values()){
            if(hs.contains(val)){
                return false;
            }
            hs.add(val);
        }
        return true;
    }
}
