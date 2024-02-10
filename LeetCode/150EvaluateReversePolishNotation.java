class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        String[] opr = new String[]{
            "+","-","*","/"
        };
        int res = 0;
        for(String str : tokens){
            if(contains(opr,str)){
                int a =  Integer.parseInt(st.pop());
                int b =  Integer.parseInt(st.pop());
                
                if(str.equals("+")){
                    res = (a+b);
                }
                if(str.equals("-")){
                    res = (b-a);
                }
                if(str.equals("*")){
                    res = (a*b);
                }
                if(str.equals("/")){
                    res = (b/a);
                }           
                st.push(Integer.toString(res));
            }
            else{
                st.push(str);    
            }
        }
        return Integer.parseInt(st.pop());
    }
    boolean contains(String[] arr, String str){
        for(String S : arr){
            if(S.equals(str)){
                return true;
            }
        }
        return false;
    }
}
