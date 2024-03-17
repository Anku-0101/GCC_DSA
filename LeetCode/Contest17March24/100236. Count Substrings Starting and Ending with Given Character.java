class Solution {
    public long countSubstrings(String s, char c) {
        long count = 0;
        int n = s.length();
        
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == c){
                count++;
            }
        }
        if(count == 0)
            return 0;
        
        long res = count%2 == 0 ? (count/2)*(count-1) :((count-1)/2)*count;
        return count + res;
    }
}
