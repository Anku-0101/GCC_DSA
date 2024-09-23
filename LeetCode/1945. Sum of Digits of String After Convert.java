class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;
        for(int i = 0; i<s.length(); i++){
            int x = (int)s.charAt(i)-96;
            while(x > 0){
                sum += x%10;
                x = x/10;
            }
        }
        if(k == 1)return sum;
        return getSum(sum,k);
    }

    int getSum(int sum, int k){
        if(k == 1){
            return sum;
        }
        int sumOfDigit = 0;
        while(sum > 0){
            sumOfDigit += sum%10;
            sum = sum/10;
        }
        return getSum(sumOfDigit,k-1);
    }
}
