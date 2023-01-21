import java.util.*;

class Main{
    public static void main(String[] args){
        int arr[] = {3,4,7,-2,4,6,0,1};
        //swap(arr, 1, 3);
        //print(arr);
        //BubbleSort(arr);
        //Insertionsort(arr);
        //int[] a = {2,3,5,7,9,12,13,17,19,20};
        //int[] b = {0,4,6,7,11};
        //int[] merged = new int[a.length+b.length];
        //merge(a,b, merged);
        MergeSort(arr,arr.length);
        print(arr);
    }
    
    public static void MergeSort(int[] arr, int n){
        if(n < 2) // n == 1 ; base condition
            return;
        
        int mid = n/2;
        int left[] = new int[mid];
        int right[] = new int[n-mid];
        
        for(int i =0; i< mid; i++) // 0 to mid-1 -> mid
            left[i] = arr[i];
        
        for(int i = mid; i < n; i++) // mid to n-1 -> n-1-mid+1 -> n-mid
            right[i-mid] = arr[i]; 
        
        MergeSort(left, mid);
        MergeSort(right, n-mid);
        merge(left, right, arr);
    }
    
    // TC - O(n)
    public static void merge(int [] a, int []b, int[] merged){
        //int merged[] = new int[a.length+b.length];
        int i=0, j = 0, k = 0;
        
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                merged[k]=a[i];
                i++;
            }
            else{
                merged[k] = b[j];
                j++;
            }
            k++;
        }
        
        // if there are remaining elements in A put them in merged arr
        while(i<a.length){
            merged[k]=a[i];
            i++;
            k++;
        }
        // if there are remaining elements in B put them in merged arr
        while(j<b.length){
            merged[k] = b[j];
            j++;
            k++;
        }

    }
    
    public static void Insertionsort(int arr[]){
        for (int i=1; i<arr.length; ++i){
            
            int value= arr[i];
            int hole = i;
        
            while (hole > 0 && arr[hole-1] > value){
                arr[hole] = arr[hole-1];
                hole = hole-1;
            }
            arr[hole] = value;
        }
    }
    
    public static void BubbleSort(int arr[]){
        int n = arr.length;
        
        for(int i = 0; i < n-1; i++){
            boolean flag =false;
            
            for(int j = 0; j < n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    flag = true;
                }
            }
            
            if(flag == false)
                return; // break;
        }
    }
    
    public static void swap(int[] a,int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    public static void print(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void SimpleTranspose(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        for(int i =0 ; i < n*n; i++)
            arr[i/n][i%n] = sc.nextInt();
        
        for(int i =0; i<n*n; i++){
            System.out.print(arr[i%n][i/n] + " ");
            if((i+1) % (n) == 0)
                System.out.println();
        }
    }
}
