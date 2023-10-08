class Solution {
    public int differenceOfSums(int n, int m) {
        int sum = 0;
        int div = 0;
        for(int i = 1; i <=n; i++){
            if(i%m == 0)
                div += i;
        }
        
        return ((n*(n+1))/2) - 2*div;
    }
}
