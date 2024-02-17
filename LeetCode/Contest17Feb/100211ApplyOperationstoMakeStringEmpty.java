// TLE solution
class Solution {
    public String lastNonEmptyString(String s) {
        return getRes(s);
    }
    
    String getRes(String s){
        Set<Character> st = new HashSet<>();
        String str = "";
        for(int i = 0; i<s.length();i++){
            if(st.contains(s.charAt(i))){
                str += s.charAt(i);
            }
            st.add(s.charAt(i));
        }
        System.out.println(str);
        if(str.length() == 0)
            return s;
        
        return getRes(str);
    }
}

// Optimized

    public String lastNonEmptyString(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int maxCount = 0;
        for(int i = 0; i <s.length(); i++){
            char ch = s.charAt(i);
            int count = hm.containsKey(ch)?hm.get(ch)+1:1;
            if(count > maxCount)maxCount = count;
            hm.put(ch,count);
        }
        if(maxCount == 1)
            return s;
        StringBuilder str = new StringBuilder();
        
        Set<Character> st = new HashSet<>();
        for(int i = s.length()-1; i >=0; i--){
            char ch = s.charAt(i);
            if(hm.get(ch)==maxCount && !st.contains(ch)){
                str.append(ch);
                st.add(ch);
            }
        }
        
        return str.reverse().toString();
    }
