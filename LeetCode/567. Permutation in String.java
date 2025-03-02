class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        if(n1 > n2) return false;
        int[] arr = new int[26];
        //HashMap<Character, Integer> hm1 = new HashMap<>();
        //HashMap<Character, Integer> hm2 = new HashMap<>();

        for(int i = 0; i<n1; i++){
            char ch = s1.charAt(i);
            arr[ch-'a']++;
        }
        for(int i =0; i<n1; i++){
            //hm2.put(s2.charAt(i), hm2.getOrDefault(s2.charAt(i),0)+1);
            char ch = s2.charAt(i);
            arr[ch-'a']--;
        }
        if(checkZero(arr))return true;
        int start =0, end = n1-1;
        
        //if(compareMaps(hm1,hm2)) return true;
        
        while(end < n2-1){
            end++;
            //hm2.put(s2.charAt(end), hm2.getOrDefault(s2.charAt(end),0)+1);
            arr[s2.charAt(end)-'a']--;
            arr[s2.charAt(start)-'a']++;
            /*if(hm2.get(s2.charAt(start)) == 1){
                hm2.remove(s2.charAt(start));
            }else{
                hm2.put(s2.charAt(start), hm2.get(s2.charAt(start))-1);
            }
            start++;
            if(compareMaps(hm1,hm2))return true;*/
            start++;
            if(checkZero(arr))return true;
            
        } 
        return false;
    }
    boolean checkZero(int[] arr){
        for(int x : arr){
            if(x != 0)return false;
        }
        return true;
    }
    boolean compareMaps(HashMap<Character, Integer> hm1, HashMap<Character, Integer> hm2){
        if(hm1.size() != hm2.size())return false;

        for(char c : hm1.keySet()){
            if(!hm2.containsKey(c) || hm1.get(c) != hm2.get(c)){
                return false;
            }
        }
        return true;
    }
}
