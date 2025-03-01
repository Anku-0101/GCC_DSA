class Solution {
    public int trap(int[] height) {
        int n = height.length,res=0;
        int[] prefixMax = new int[n];
        int[] suffixMax = new int[n];
        prefixMax[0] = height[0];
        suffixMax[0] = height[n-1];
        for(int i = 1; i<n; i++){
            prefixMax[i] = Math.max(height[i], prefixMax[i-1]);
        }
        for(int i = 1; i<n; i++){
            suffixMax[i] = Math.max(height[n-1-i], suffixMax[i-1]);
        }
        /*
        for(int i = 0; i<n; i++){
            System.out.print(prefixMax[i]+ " ");
        }
        System.out.println();
        for(int i = n-1; i>=0; i--){
            System.out.print(suffixMax[i]+ " ");
        }*/

        for(int i = 0; i<n; i++){
            int water = Math.min(prefixMax[i], suffixMax[n-1-i])-height[i];
            //System.out.println(" i = " + i+ " water = "+water);
            if(water > 0)res += water;
        }
        return res;
    }
}
