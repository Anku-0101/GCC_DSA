class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        
        List<Integer> res =  new ArrayList<Integer>();
        int n = 0;
        int num = low;
        while(num > 0){
            ++n;
            num = num/10;
        }
        
        int start = 0;
        while(start < high){
            start = getStartNum(n);
            int diff = getDif(n);
            //System.out.println(" n = "+n +" start  = " + start + " diff = " + diff);
            int count = 1;
            
            while(start <= high && count <= (10-n)){
                if(start>=low)res.add(start);
                start += diff;
                count++;
            }
            n++;
        }
        return res;
    }
    int getStartNum(int n){
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        int num = 0;
        for(int  i = 0; i <n; i++){
            num = arr[i%9]+num*10;
        }
        return num;
    }
    int getDif(int n){
        int num = 1;
        while(--n > 0){
            num = num*10+1;
        }
        return num;
    }
    int getpow(int a, int x){
        if(x == 0)
            return 1;
        
        if(x%2 == 0){
            int y = getpow(a,x/2);
            return y*y;
        }
        
        return a*getpow(a,x-1);
    }
}
