class Solution {
    public String makeGood(String s) {
        int n = s.length();
        String str = isBad(s);
        int m = str.length();

        if(m == n){
            return str;
        }
        
        return makeGood(str);
        
    }
    String isBad(String s){
        String str = "";
        int i = 0;
        for(i = 0; i < s.length()-1; i++){
            int x = (int)s.charAt(i);
            int y = (int)s.charAt(i+1);
            if(Math.abs(x-y) == 32){
                i +=2;
            }
            if(i < s.length())
                str += s.charAt(i);   
        }
        if(i < s.length()){
            str += s.charAt(i);
        }
        return str;
    }
}

// Optimized version
class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = s.length()-1; i >=0; i--){
            if(!st.empty() && Math.abs(st.peek()-s.charAt(i))== 32){
                st.pop();
            }else
                st.push(s.charAt(i));
        }
        String str = "";
        while(!st.isEmpty()){
            str += st.pop();
        }     
        return str;
    }
}
