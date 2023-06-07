class Main{
    public static void main(String[] args){
        System.out.println(reverseI("12345abcd"));
        System.out.println(IsPlaindromeI("abcpqw"));
        System.out.println(reverseR("12345abcd"));
        System.out.println(IsPlaindromeI("abccba"));
    } 
    // N -> length of string
    // Time complexity : O(N)  
    // Space complexity : O(N)
    public static String reverseI(String str ){
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static String reverseR(String str ){
        // base condition
        if(str.length() == 1){
            return str;
        }

        // n > 1
        return   reverseR(substring(1, str)) + str.charAt(0);
 
    }

    public static String substring(int startIndex, String str){
        String ans = "";
        for(int i = startIndex; i<str.length(); i++){
            ans += str.charAt(i);
        }
        return ans;
    }


    public static boolean IsPlaindromeI(String str){
        int end = str.length()-1;
        for(int start = 0; start < str.length()/2; start++){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            end--;
        }
        return true;
    }

    public static boolean IsPlaindromeR(String str){
        return IsPlaindromeR(str, 0, str.length()-1);
    }
    static boolean  IsPlaindromeR(String str, int start, int end){
        if(start >= end){
            return true;
        }
        if(str.charAt(start) != str.charAt(end)){
            return false;
        }
        return IsPlaindromeR(str,start+1, end-1);
    }
}
