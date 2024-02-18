class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int n = words.length;
        int count = 0;
        for(int i = 0; i<n; i++){
            for(int j = i+1;j<n;j++){
                if(isPreSuf(words[i],words[j])){
                    count++;
                }
            }
        }
        return count;
    }
    boolean isPreSuf(String s1, String s2){
        if(s1.length() > s2.length()){
            return false;
        }
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i)!=s2.charAt(i))
                return false;
        }
        int ofset = s2.length()-s1.length();
        for(int i =ofset;  i<s2.length(); i++){
            if(s1.charAt(i-ofset) != s2.charAt(i))
                return false;
        }
        return true;
    }
}
