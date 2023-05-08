class Solution {
    public int countEven(int num) {
        int count =0;
        int j =0;
        int sum =0;
         for(int i =1 ; i<=num; i++){
            int val = i;
            while(val != 0){
                j =val%10;
                sum =sum+j;
                val = val/10;
            }
            if(sum%2==0){
                count++;
            }
            sum = 0;
        }
        
        return count;
    }
}


class Solution {
    public int bulbSwitch(int n) {
        int res = 0;
        for(int i = 1; i<=n; i++){
            int numOfFactors = factorsCountOptimized(i);
            if(numOfFactors %2 != 0){
                res++;
            }
        }
        return res;
    }

    // O(n)
    // can be optimized
    public static int factorsCount(int n){
        int count=0;
        for(int i=n;i>=1;i--){
            if(n%i==0){
                count++;
            }
        }
        return count;
    }

    // optimized get factor method
    // O(sqrt(n))
     public static int factorsCountOptimized(int n){
        int count=0;
        for(int i=1; i*i <=n;i++){
            if(n%i==0){
                count++;
                int factor1 = i;
                int factor2 = n/i;
                if(factor1 != factor2){
                    count++;
                }
            }
        }
        return count;
    }
}
