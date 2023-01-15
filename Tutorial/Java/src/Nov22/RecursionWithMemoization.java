import java.util.*;

class Main{
    
    public static int[] arr = new int[100];
    
    public static void main(String[] args){
        System.out.println("New Fib executing");
        System.out.println(Fib(60));
        System.out.println("New Fib executed");
        
        System.out.println("Old Fib executing");
        System.out.println(FibOld(60));
        System.out.println("Old Fib executed");
    }
    
    // TC - O(n)
    // SC - O(n)
    public static int Fib(int n){
        if(n < 2){
            arr[n] = n;
            return n;
        }
        
        if(arr[n] != 0)
            return arr[n];
        
        //arr[n] = Fib(n-1) + Fib(n-2);
        //return arr[n]; 
        return arr[n] = Fib(n-1) + Fib(n-2);
    }
    
    public static int FibOld(int n){
        if(n < 2)
            return n;
            
        return FibOld(n-1) + FibOld(n-2);
    }
    
    public static void Print(int n) {
        if (n==1) {
            System.out.println(n);
            return;   
        }
        else{
            Print(n-1);
            System.out.println(n);
        }
    }

}
