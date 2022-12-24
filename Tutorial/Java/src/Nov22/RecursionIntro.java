import java.util.*;

class Main{
    
    public static void main(String[] args){
        //System.out.println(FactorialR(4));                    
        //System.out.println(Fib(9));                    
        System.out.println(Fibr(8));                    
    }
    public static int Fibr (int n){
        if(n<=1)
            return n;
        
        return Fibr(n-1)+Fibr(n-2);
    }
    
    public static int FactorialR(int n){
        if(n == 0)
            return 1;
        
        return n*FactorialR(n-1);
    }
    
    public static int Factorial(int n){    
        if(n == 0) // n<2 -> return n-1
            return 1;
        
        int ans = 1;
        
        for(int i = 1; i <= n; i++)
            ans = ans*i;
        
        return ans;
    }
    
    public static int Fib (int n){
        int first = 0;
        int second = 1;
        
        if (n <= 1)
            return n;

        int term = 0 ;
        
        for (int i = 2; i <= n; i++){
            term = first + second;
            first = second;
            second = term;
        }
        return term;
    }
}

