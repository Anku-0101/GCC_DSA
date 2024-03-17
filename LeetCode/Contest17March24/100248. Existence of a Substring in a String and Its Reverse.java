class Solution {
    public boolean isSubstringPresent(String s) {
        HashSet<String> hs = new HashSet<>();
        int n = s.length();
        for(int i = 0; i <n-1; i++){
            String str = ""+s.charAt(i)+s.charAt(i+1);
            hs.add(str);
        }
        System.out.println(hs);
        for(int i = n-1; i >=1; i--){
            String str = ""+s.charAt(i)+s.charAt(i-1);
            if(hs.contains(str))
                return true;
        }
        return false;
    }
}
