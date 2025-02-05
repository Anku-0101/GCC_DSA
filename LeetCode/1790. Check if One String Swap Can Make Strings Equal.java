class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n = s1.length();
        int first = -1;
        int second = -1;
        int count = 0;
        for(int i = 0; i<n; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                count++;
                first = (first < 0)&& (second == -1) ? i : first;
                second = (first >= 0) ? i : second;
            }
        }
        if(count == 1 || count > 2){
            return false;
        }
        if(count == 0 || 
            (count == 2 && (s1.charAt(first) == s2.charAt(second)) && (s1.charAt(second) == s2.charAt(first)))){
            return true;
        }
        return false;
    }
}
