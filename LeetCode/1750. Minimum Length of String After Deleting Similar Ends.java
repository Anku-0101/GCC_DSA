class Solution {
    public int minimumLength(String s) {
        int n = s.length();
        int start = 0;
        int end = n-1;
        while(start <= end){
            char c1 = s.charAt(start);
            char c2 = s.charAt(end);

            if(c1 != c2){
                return (end-start+1);
            }
            if(start == end)
                return 1;
            while(start < n && s.charAt(start)==c1){
                start++;
            }
            while(end > -1 && s.charAt(end) == c2){
                end--;
            }
            if(end < start)
                return 0;
        }
        return 0;
        
    }
}
