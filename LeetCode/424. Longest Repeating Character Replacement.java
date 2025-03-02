class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        HashMap<Character, Integer> hm = new HashMap<>();
        int start = 0, maxLen = 0,maxFreq = 0;
        for(int end = 0; end <n; end++){
            char c = s.charAt(end);
            hm.put(c, hm.getOrDefault(c,0)+1);
            maxFreq = Math.max(hm.get(c), maxFreq);

            while(end-start+1-maxFreq > k){
                hm.put(s.charAt(start), hm.get(s.charAt(start))-1);
                maxFreq = Math.max(hm.get(c), maxFreq);
                start++;
            }
            maxLen = Math.max(maxLen, end-start+1);
        }
        return maxLen;
    }
}
