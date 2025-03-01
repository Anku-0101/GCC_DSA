class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n < 2) return n;
        HashMap<Character, Integer> hm = new HashMap<>();
        int start = 0,maxLen = 0;
        for(int i = 0; i<n; i++){
            char ch = s.charAt(i);
            if(hm.containsKey(ch)){
                start = Math.max(hm.get(ch)+1, start);
            }
            maxLen = Math.max(maxLen, i-start+1);
            hm.put(ch,i);
        }
        return maxLen;
    }
}
