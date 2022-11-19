// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] arr = {5,10,15,5,4,5,};
        HelloWorld hw = new HelloWorld();
        System.out.println(hw.CountDistinctElements(arr,arr.length));
    }
    
    public int CountDistinctElements(int arr[], int size){
    
        int res = 0;
    
        for(int i = 0; i<size; i++){
            boolean isRepeat = false;
            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    isRepeat = true;
                    break;
                }
            }
            if(isRepeat == false)
                res++;
        }
        return res;
    }
    public ArrayList<Integer> GetUnion(int[] arr1, int[] arr2){
        int m = arr1.length;
        int n = arr2.length;
        
        int i =0, j = 0;
        QuickSort(arr1, arr1.length);
        QuickSort(arr2, arr2.length);
        while(i<m && j<n){
            if(arr1[i])
        }
    }
    
    int Partition(int arr[], int start, int end)
    {
    
        int pivot = arr[end]; 
        int pivotIndex = start;
    

        for(int i = start; i <= end; i++)
        {
            if(arr[i] < pivot)
            {
                Swap(&arr[i], &arr[pivotIndex]);
                pivotIndex++;
            }
        }
       Swap(arr[pivotIndex], &arr[end]);
    }
    private void Swap(int[] arr1, int ind1, int ind2){
        int temp = arr1[ind1];
        arr1[ind1] = arr2[ind2];
        arr[ind2] = tmp;
        
    }
    
}