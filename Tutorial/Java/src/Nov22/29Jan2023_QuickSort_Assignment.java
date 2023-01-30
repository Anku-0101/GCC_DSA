import java.util.*;

class Main{
    public static void main(String[] args){
        int[] arr = {3,5,9,0,1,2,8,4,3,1,4};
        //int partitionIndex = partition(arr, 0, arr.length-1);
        //System.out.println("partition Index = " + partitionIndex);
        System.out.println("array before sorting");
        print(arr);
        
        QuickSort(arr, 0, arr.length-1);
        System.out.println("array after sorting");
        print(arr);
    }
    
    public static void QuickSort(int[] arr, int start, int end){
        if(start >= end) // invalid segment or segment with 1 element 
            return;
        int partitionIndex = partition(arr, start, end);
        // left half
        QuickSort(arr, start, partitionIndex-1);
        // right half
        QuickSort(arr, partitionIndex+1, end);
    }
    
    public static int partition(int [] a, int low, int high){
        int partition = low;
        int pivot = a[high];
        
        // for this loop the invariant is,
        // before partition index all the elements will be less than equal to pivot
        for(int i = low; i < high; i++){
            if(a[i] <= pivot){ // if descending then do, a[i] >= pivot
                swap(a,i,partition);
                partition++;
            }
        }        
        swap(a, partition, high);//pivot is located in last index so swap them
        return partition;
    }
    
    public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print(int[] arr){
        
        for(int i =0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
        
        System.out.println();
    }
}



// prime factors : 30 : 2*3*5
    // any number having at least one of the factors as 2, 3 or 5
    // will be divisible by 30 
    // any number -> 10 and 3 
    // the number should be divisible by 10 and 3   
    // a number having unit place as 0 is always divisible by 10
    // a number whose sum of digits is divisible by 3 is divisible by 3
    // NOTE 
    // a number A is divisible by B 
    // if All the prime factors of B are present in A atleast once
    //
    public static void DivisibilityTest(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int sum = 0;
        
        // number is not divisible by 10 so return No
        // O(1) -> constant 
        if(str.charAt(str.length() - 1) != '0'){
            System.out.println("No");
            return;
        }

        // the number is divisible by 10, so check for 3
        // O(n) : for checking divisiblity by 3
        for(int i = 0; i < str.length(); i++){
            sum += str.charAt(i)-48;
        }
        if(sum%3 == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

public static void CleanTheRoom(String[] args) {
    // count the number of rows which are same
    Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       String[] arr = new String[n];
       
       for(int i = 0; i < n; i++)
            arr[i] = sc.next();
        
        int res = 0;

        for(int i = 0; i < n; i++){
            int counter = 0;
            for(int j = 0; j < n; j++){
                if(arr[i].equals(arr[j]))
                    counter++;
            }
            res = Math.max(res, counter);
        }
        System.out.println(res);
    }   
