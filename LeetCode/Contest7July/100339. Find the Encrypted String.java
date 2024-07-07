class Solution {
    public String getEncryptedString(String s, int k) {
        int n = s.length();
        String str = "";

        for(int i =0; i<n; i++){
            str += s.charAt((i+k)%n);
        }
        return str;
    }
}
