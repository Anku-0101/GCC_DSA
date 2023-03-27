import java.util.*;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    
    static int  firstOccerenceOne(int num){
        int index = 0;
        for(int i=32; i>=1; i--){
            if((num & 1)==1){
                index =i;
            }
            num = num>>1;
        }

       return index; 
    }

    static int lastOccereceOne(int num){
        for(int i=32; i>=1; i--){
            if((num & 1)==1){
                return i;
            }
            num = num>>1;
        }
        return -1;
    }
    
    static long maxNumber(int num){
        int index = firstOccerenceOne(num);
        
        /*for(int i=1; i<=(index-2); i++){
            num=num<<1;
        }*/
        //System.out.println("index for num = " + num + " = " + index);
        long res = (long)num;
        return res<<(index-1);
    }

    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int num = sc.nextInt();
            System.out.println(findMax(getArray(num)));
            
        }
        //2617245696
        /*
        int x = -1610612736; 
        */
    }
    static long findMax(int[] arr){
        long maxNumber = 0;
        for(int i = 0; i < 32; i++){
            long num = 0;
            for(int j = 0; j < 32; j++){
                num += pow(2,j)*arr[(i+j)%32];
            }
            if(num > maxNumber)
                maxNumber = num;
        }
        return maxNumber;
    }
    static long pow(int a, int n){
        if(n == 0)
            return 1;
        if(n == 1)
            return a;
        
        if(n%2 == 0){
            long y = pow(a,n/2);
            return y*y;
        }
        return a*pow(a,n-1);
    }
    static int[] getArray(int x){
        int arr[] = new int[32];
        for(int i=31; i>=0; i--){
            int bits = (x>>i) & 1;
            arr[i] = bits;
        }
        return arr;
    }
    
}







class Pair{
    int x;
    int y;
}

class Main{
    public static void main(String[] args){  
        int k = 9; // value type created on stack memory 
        String str = "abc"; // reference type, created on heap memory
        /*
     int x = 4, y = 9;
     System.out.println("before swaping in main" + ", x = " + x + " y = " + y);
     swap(x,y);
     System.out.println("After swaping in main" + ", x = " + x + " y = " + y);
     ////
     
     System.out.println("Taking x and y from a class variable");
     Pair p = new Pair();
     p.x = 12;
     p.y = 8;
     System.out.println("before swaping in main" + ", x = " + p.x + " y = " + p.y);
     swap(p);
     System.out.println("After swaping in main" + ", x = " + p.x + " y = " + p.y);*/

        int x = 5;
        int[] arr = {1,2,3};

        DoDouble(x);
        DoDouble(arr);
        System.out.println("x = " + x);
        for(int i = 0; i< arr.length; i++){
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

    }

    static void DoDouble(int x){
        x = 2*x;
    }

    static void DoDouble(int[] x){
        for(int   i = 0; i < x.length; i++){
            x[i] = 2*x[i];
        }
    }
    static void swap(Pair pair){
        System.out.println("Start of swap method in pair method execution" + ", x = " + pair.x + " y = " + pair.y);
        pair.x = pair.x^pair.y;
        pair.y = pair.y^pair.x;
        pair.x = pair.x^pair.y;
        System.out.println("End of swap method in pair method execution" + ", x = " + pair.x + " y = " + pair.y);

    }
    static void swap(int a, int b){
        System.out.println("Start of swap method execution" + ", x = " + a + " y = " + b);
        a = a^b;
        b = b^a;
        a = a^b;
        System.out.println("End of swap method execution" + ", x = " + a + " y = " + b);
    } 
}
