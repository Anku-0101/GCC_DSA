class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int h1=0,h2=0;
        for(int i = 0; i < n; i++){
            if(isVowel(s.charAt(i))){
               if(i < n/2){
                   h1++;
               }else{
                   h2++;
               } 
            }
        }
        return h1==h2;
    }
    
    public boolean isVowel(char ch){
        char[] arr = new char[]{'a','e','i','o','u','A', 'E','I','O','U'};
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==ch)
                return true;
        }
        return false;
    }
}
