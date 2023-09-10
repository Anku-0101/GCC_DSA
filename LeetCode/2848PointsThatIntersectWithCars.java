class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int n = nums.size();
        int[] arr = new int[101];
        for(int i = 0;  i<n; i++){
            for(int j = nums.get(i).get(0); j <= nums.get(i).get(1); j++){
                arr[j] = 1;
            }
        }
        
        int count = 0;
        for(int i = 0; i < 101; i++){
            if(arr[i]==1){
                count++;
            }
        }
        return count;
        
    }
}
