import java.util.*;

class Main{
    
    public static void main(String[] args){
        //ConvertToBinary(1234);
        //GetFactors(96);
        //System.out.println(Exponent(3,4));
        System.out.println(Power(3,4));
        
    }
    
    public static int Power(int num, int pow){
        if(pow == 0)
            return 1;
        
        if(pow%2 == 0){
            int y = Power(num,pow/2);
            return y*y;
        }
        else
            return num*Power(num, pow-1);
    }
    
    public static int Exponent(int num, int pow) {
        if(pow==1) {
            return num;
        } 

        return num*Exponent(num,pow-1);
    }
    
    // Time complexity 
    // O(sqrt(n))
    public static void GetFactors(int n){
        for(int i = 1; i *i <= n; i++){
            if(n%i == 0)
                System.out.print(" " + i + " " + n/i);
        }
    }
    
    public static void ConvertToBinary(int n){
        if(n == 0 || n == 1){
            System.out.println(n);
            return;
        }    
        ConvertToBinary(n/2);
        System.out.println(n%2);
    }
    
    public static void Binary(int n){
        ArrayList<Integer> binary = new ArrayList<>();
        int index=0;

        while(n>0){
            binary.add(n%2);
            n=n/2;
            index++;
        }
        // ANS is reverse of binary 
        System.out.print(binary);
    }
    
    
    public static void ToBinary(int n, String s){
        if (n==0) {
            System.out.println(s);
            return;
        }
        
        int mod = n%2;
        ToBinary(n/2, mod + s);
    }
}
