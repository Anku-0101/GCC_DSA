class Main{
    public static void main(String[] args){        
        int[] arr = {-5 ,-2,-1,2,3,4,7};

        int[] ans = square(arr);
        for(int i =0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
        
    }

    static int[] square(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        int k = n-1;
        int[] res = new int[n];
        // TC : O(N)
        while(i <= j){
            if(abs(arr[i]) > abs(arr[j])){ // arr[i]*arr[i] < arr[j]*arr[j]
                res[k--] = arr[i]*arr[i];
                i++;
            }else{
                res[k--] = arr[j]*arr[j];
                j--;
            }
        }
        return res;
    }

    static int abs(int x){
        if(x<0){
            return (-1*x);
        }
        return x;
    }


    /*
    static void mergeSort(int[] arr){
        int n = arr.length;
        
        // base condition, sorted array
        if(n < 2)
            return;
        int mid = n/2;
        // left and right // 2 to 5 -> endIndex - startIndex +1 -> 4
        // left -> 0 to mid-1;
        // right -> mid to n-1

        int[] left = new int[mid];
        for(int i = 0; i < mid; i++)
            left[i] = arr[i];

        int[] right = new int[n-mid];
        for(int i = mid; i < n; i++){
            right[i-mid] = arr[i]; 
        }

        mergeSort(left);
        mergeSort(right);

        mergeArray(left,right,arr);
    }

    static void mergeArray(int[] arr1, int[] arr2, int[] arr3){
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                arr3[k] = arr1[i];
                i++;
            }else{
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i < arr1.length){
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while(j < arr2.length){
            arr3[k] = arr2[j];
            j++;
            k++;
        }
    }*/
}
