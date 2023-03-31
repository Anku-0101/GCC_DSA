import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static long counter = 0;

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i <n; i++){
            arr[i] = sc.nextInt();
        }

        //System.out.println(getInversePairs(arr));
        mergeSort(arr);
        System.out.println(counter);
    }

    static void mergeSort(int[] arr){
        int n = arr.length;

        //array of size 1 is already sorted
        if(n < 2){
            return;
        }

        int mid = n/2;
        int[] left = new int[mid];//0 to mid-1 -> mid
        for(int i = 0; i < mid; i++){
            left[i] = arr[i];
        }
        int[] right = new int[n-mid];//mid to n-1 -> n-mid
        for(int i =0; i < n-mid; i++){
            right[i] = arr[mid+i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(left, right, arr);
    }

    static void merge(int[] left, int[] right, int[] arr){
        int sizel = left.length;
        int sizer = right.length;

        int n = arr.length;

        int i =0; // points to left sub-array 
        int j = 0; //// points to right sub-array 
        int k = 0; // points to parent array = arr
        while(i < sizel && j < sizer){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                counter += sizel-i;
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < sizel){
            arr[k++] = left[i++];
        }
        while(j < sizer){
            arr[k++] = right[j++];
        }
    }
    
    static int getInversePairs(int[] arr){
        int n = arr.length;
        int res = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] > arr[j]){
                    res++;
                }
            }
        }
        return res;
    }
}


//// Inheritance 
class Main{
    public static void main(String[] args){  
        Student ram = new Student("Ram Kumar", 11);
        ram.setMarks(98);
        System.out.println("marks = " + ram.getMarks());
        // ram -> rollNumber, name, getMarks, setMarks
        String ans = ram.toString();
        System.out.println("ans = " + ans);
        int code = ram.hashCode();
        System.out.println("code  = " + code);
    }
}

class Student{
    int rollNumber;
    String name;
    private int marks;

    Student(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }
    int getMarks(){
        return marks;
    }
    void setMarks(int marks){
        this.marks = marks;
    }
}
