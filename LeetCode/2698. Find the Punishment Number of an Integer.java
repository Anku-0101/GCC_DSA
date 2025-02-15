class Solution {
    private boolean isValid(String num, int remSum){
        if(remSum < 0){
            return false;
        }
        if(num.length() == 0 && remSum == 0){
            return true;
        }
        boolean ans = false;
        for(int i = 0; i<num.length(); i++){
            String curr = num.substring(0,i+1);
            int val = Integer.parseInt(curr);
            ans |= isValid(num.substring(i+1), remSum-val);
            if(ans == true){
                return true;
            }
        }
        return ans;
    }

    public int punishmentNumber(int n) {
        int res = 0;
        for(int i = 1; i<=n ; i++){
            if(isValid(Integer.toString(i*i), i)){
                res += i*i;
            }
        } 
        return res;   
    }
}
