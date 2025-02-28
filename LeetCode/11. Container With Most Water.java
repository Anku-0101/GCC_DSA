class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxArea = 0;
        int start = 0;
        int end = n-1;
        while(start < end){
            int h1 = height[start];
            int h2 = height[end];
            int area = Math.min(h1, h2)*(end-start);
            maxArea = Math.max(maxArea, area);
            if(h1 > h2){
                end--;
            }else{
                start++;
            }
        }
        return maxArea;
    }
}
