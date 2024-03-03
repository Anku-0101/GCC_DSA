class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        
        arr1.add(nums[0]); arr2.add(nums[1]);
        int idx1 = 0, idx2=0;
        
        for(int i = 2; i<n; i++){
            if(arr1.get(idx1)>arr2.get(idx2)){
                arr1.add(nums[i]);
                idx1++;
            }else{
                arr2.add(nums[i]);
                idx2++;
            }
        }
        int[] arr = new int[n];
        for(int i = 0; i < arr1.size(); i++){
            arr[i]=arr1.get(i);
        }
        int m = arr1.size();
        for(int i = m; i < m+arr2.size(); i++){
            arr[i]=arr2.get(i-m);
        }
        return arr;
    }
}
