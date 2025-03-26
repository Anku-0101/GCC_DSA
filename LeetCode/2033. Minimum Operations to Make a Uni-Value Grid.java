class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;
        int[] arr = new int[m*n];
        int idx = 0;

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                arr[idx++] = grid[i][j];
            }
        }
        if(arr.length < 3){
            if(arr.length == 1)return 0;
            int diff = arr[0]-arr[1] > 0? arr[0]-arr[1] : arr[1]-arr[0];
            if(diff%x != 0)return -1;
            return diff/x;
        }
        Arrays.sort(arr);
        int right = arr[idx/2 - 1];
        int mid = arr[idx/2];
        int left = arr[idx/2+1];
        int count1 = 0,count2 =0, count3 = 0;
        
        for(int i = 0; i<arr.length; i++){
            int num = arr[i];
            int diff1 = right-arr[i] > 0 ? right-arr[i]:arr[i]-right;
            int diff2 = mid-arr[i] > 0 ? mid-arr[i]:arr[i]-mid;
            int diff3 = left-arr[i] > 0 ? left-arr[i]:arr[i]-left;
            if(diff1%x !=0 || diff2%x != 0 || diff3%x !=0)return -1;
            count1 += diff1/x; count2 += diff2/x; count3 += diff3/x;
        }
        return Math.min(count1, Math.min(count2, count3));
    }
}

// Optimized

class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;
        int[] arr = new int[m*n];
        int idx = 0;

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if((grid[i][j]-grid[0][0]) % x != 0)return -1;
                arr[idx++] = grid[i][j];
            }
        }
        
        Arrays.sort(arr);
        int mid = arr[idx/2];
        int count = 0;
        
        for(int i = 0; i<arr.length; i++){
            int num = arr[i];
            int diff = mid-arr[i] > 0 ? mid-arr[i]:arr[i]-mid;
            if(diff%x !=0 )return -1;
            count += diff/x;
        }
        return count;
    }
}
