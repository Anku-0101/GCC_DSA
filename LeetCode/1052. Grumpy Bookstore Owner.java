class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int sum = 0;
        int totalExc = 0;

        for(int i = 0; i < n; i++){
            sum += customers[i];
            if(grumpy[i] == 1){
                totalExc += customers[i];
            }
        }

        int res = sum;

        for(int i =0; i<= n-minutes; i++){
            int exc = 0;
            for(int j = i; j < i+ minutes; j++){
                if(grumpy[j] == 1){     
                    exc += customers[j];
                }
            }
            if( res > totalExc-exc){
                res = totalExc-exc;
            }
        }
        return sum - res;
    }
}
