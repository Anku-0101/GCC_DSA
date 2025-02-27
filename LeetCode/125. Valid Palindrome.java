class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int start = 0;
        int end = n-1;
        
        while(start < end){
            char left = s.charAt(start);
            char right = s.charAt(end);
            
            if(!isAlphaNumberic(left)){
                start++;
                continue;
            }
            if(!isAlphaNumberic(right)){
                end--;
                continue;
            }
            if(toLower(left) != toLower(right)){
                return false;
            }
            start++;
            end--;

        }
        return true;
    }

    char toLower(char ch){
        if((int)ch >= (int)('A') && (int)ch <= (int)('Z')){
            return (char)((int)ch+32);
        }
        return ch;
    }

    boolean isAlphaNumberic(char ch){
        if((int)ch >= (int)('A') && (int)ch <= (int)('Z')){
            return true;
        }
        if((int)ch >= (int)('a') && (int)ch <= (int)('z')){
            return true;
        }
        if((int)ch >= (int)('0') && (int)ch <= (int)('9')){
            return true;
        }
        return false;
    }
}
