class Main{
    public static void main(String[] args){
      //int[] arr1 = {0,5,9};
      //int[] arr2 = {3,7,8};

      //int[] arr = merge(arr1, arr2);
      int[] arr = {2,1,0,-9,-7,3,11,14,13,7,9};
      mergeSort(arr);

      for(int i = 0; i < arr.length; i++){
          System.out.print(arr[i] + " ");
      }
    } 
    
    static void mergeSort(int[] arr){
        int n = arr.length;

        // base condition 
        if( n < 2)
            return;
        
        int mid = n/2;
        int[] left = new int[mid];
        
        // copying elements from arr to left array
        // from index 0 till mid
        for(int i = 0; i < mid; i++){
            left[i] = arr[i]; 
        }
        
        int[] right = new int[n-mid]; // (mid to n-1) ->
        // copying elements from arr to right array
        // from index mid+1 till end i.e n-1
        for(int i = mid; i < n; i++){
            right[i-mid] = arr[i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(left, right, arr);

    }
    static void merge(int[] arr1, int[] arr2, int[] arr){
        int n1 = arr1.length;
        int n2 = arr2.length;

        //int[] arr = new int[n1+n2];
        int i = 0, j = 0, k = 0;
        
        while(i < n1 && j < n2){
            if(arr1[i] < arr2[j]){
                arr[k++] = arr1[i++];
            }
            else{
                arr[k++] = arr2[j++];
            }
        }
        
        // After the above loop either of the array i.e arr1 or arr2 might be un-exhausted

        // checking for left out elements in arr1
        while(i < n1){
            arr[k++] = arr1[i++];
        }

        // checking for left out elements in arr2
        while(j < n2){
            arr[k++] = arr2[j++];
        }

       // return arr;
    }
}
