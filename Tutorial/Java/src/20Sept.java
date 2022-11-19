// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] arr = {5,10,15,5,4,5,};
        HelloWorld hw = new HelloWorld();
        System.out.println(hw.CountDistinctElements(arr,arr.length));
        int[] arr1 = {10,5,15,9};
        System.out.println(hw.GetUnion(arr, arr1));
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
        QuickSort(arr1, 0,arr1.length-1);
        QuickSort(arr2, 0,arr2.length-1);
        ArrayList<Integer> al = new ArrayList<>();
        
        while(i<m && j<n){
            if(arr1[i] < arr2[j]){
                if(!al.contains(arr1[i]))
                    al.add(arr1[i]);
                i++;
            }
            else if(arr2[j] < arr1[i]){
                if(!al.contains(arr2[j]))
                    al.add(arr2[j]);
                j++;
            }
            else {
                if(!al.contains(arr1[i]))
                    al.add(arr1[i]);
                i++;
                j++;
            }
        }
        return al;
    }
    
    int Partition(int[] arr, int start, int end)
    {
    
        int pivot = arr[end]; 
        int pivotIndex = start;
    

        for(int i = start; i <= end; i++)
        {
            if(arr[i] < pivot)
            {
                Swap(arr,i, pivotIndex);
                pivotIndex++;
            }
        }
       Swap(arr, pivotIndex, end);
       return pivotIndex;
    }
    private void Swap(int[] arr, int ind1, int ind2){
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
    
    void QuickSort(int[] arr, int start, int end)
    {
        if(start >= end)
            return;
        
        int pivotIndex = Partition(arr, start, end);
    
        QuickSort(arr, start, pivotIndex-1);
        QuickSort(arr, pivotIndex+1, end);
    }
    
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        HelloWorld hw = new HelloWorld();
        int[] arr = {1,2,1,2,3,3,4,4};
        System.out.println(hw.GetDistinct(arr,arr.length));
    }
    
    public int GetDistinct(int[] arr, int size){
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i = 0; i<size; i++){
            hs.add(arr[i]);
        }
        
        return hs.size();
    }
}


// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] arr2  = {5,10,15,5,4,5,};
        int[] arr1 = {10,5,15,9};
        
        //HelloWorld.intersection(arr1,arr2);
        //int[] arr = 
        HelloWorld hw = new HelloWorld();
        
        int[] arr = hw.FindIntersection(arr1,arr2);
        //System.out.println(arr);
        System.out.println("arr length =" + arr.length);
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);

        }
    }
    
    public int[] FindIntersection(int[] arr1,int[] arr2)
    {
        
        int s1=arr1.length;
        int s2=arr2.length;
        
        int[] arr3=GetDistinct(arr1,s1);
        int[] arr4=GetDistinct(arr2,s2);
        
        int s3=arr3.length;
        int s4=arr4.length;
        //int[] res=new int[s3+s4];
        int len = 0;
        for(int i=0;i<s3;i++)
        {
            for(int j=0;j<s4;j++)
            {
                if(arr3[i]==arr4[j])
                {
                    //int temp=arr4[j];
                    //res[i]=temp;
                    len++;
                }
            }
        }
        
        int[] res=new int[len];
        for(int i=0;i<s3;i++)
        {
            for(int j=0;j<s4;j++)
            {
                if(arr3[i]==arr4[j])
                {
                    int temp=arr4[j];
                    res[i]=temp;
                    //len++;
                }
            }
        }
        return res;
    }
    public int[] GetDistinct(int[]arr,int size)
    {
        //int[] temp=new int[size];
        int len = 0;
        
        for(int i=0;i<size;i++)
        {
          for(int j=0;j<=i;j++)
          {
              if(j==i)
                {
                    //int t=arr[i];
                    //temp[i]=t;
                    len++;
                }
                if(arr[i]==arr[j])
                {
                    break;
                }
          }
        }
        
        int[] temp = new int[len];
        for(int i=0;i<size;i++)
        {
          for(int j=0;j<=i;j++)
          {
              if(j==i)
                {
                    int t=arr[i];
                    temp[i]=t;
                }
                if(arr[i]==arr[j])
                {
                    break;
                }
          }
        }
        return temp;
    }


    public static int[]  GetIntersection (int[] arr1, int[] arr2){
       int[] temp = new int[arr1.length+arr2.length];
       int k = 0;
        for(int i = 0; i<arr1.length; i++ ) {
            for(int j = 0; j<arr2.length; j++) {
                if(arr1[i]==arr2[j]){ 
                    temp[k++] = arr2[j];
                }
            }
        }
        return temp;
   }


    public static void  intersection (int[] arr1, int[] arr2){
        for(int i = 0; i<arr1.length; i++ ) {          
            for(int j = 0; j<arr2.length; j++) {             
                if(arr1[i]==arr2[j]) {                
                    System.out.println(arr2[j]);             
                }          
            }       
        }
    }
}