/// Using three pointer approach
class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        // 0 to low-1 -> 0
        // low to mid-1 -> 1
        // mid to high -> unsorted part
        // high+1 to n-1 -> 2
        while(mid <= high ){
            System.out.println("start "+ "low = "+low +"mid = " + mid + " high = " +high);

            if(arr[mid] == 0){
                int tmp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = tmp;
                low++;mid++;
            }
            
            else if(arr[mid] == 2){
                int tmp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = tmp;
                high--;
                continue;
            }
            else{
                mid++;
            }
            //System.out.println("end "+ "low = "+low +"mid = " + mid + " high = " +high);
        }
    }
}
