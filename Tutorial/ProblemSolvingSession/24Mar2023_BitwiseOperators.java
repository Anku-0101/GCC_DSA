import java.util.*;


class Main{
    public static void main(String[] args){        
        //System.out.println(subtract(20,25));
        //print32Bit(-6);
        print64Bit(-1234);
        //System.out.println(~5);

    }

    static int divideby2(int num){
        return num >> 1;
    }
    static int Multiplyby2(int num){
        return num << 1;
    }
    
    static boolean isEven(int num){
        if(num & 1 == 0)
            return true;
        
        if(num & 1 == 1)
            return false;
    }

    static void print64Bit(long num){
        for(int i=63; i>=0; i--){
            System.out.print((num>>i) & 1);
        }
        System.out.println();
    }

    static void print32Bit(int num){
        for(int i=31; i>=0; i--){
            System.out.print((num>>i) & 1);
        }
        System.out.println();
    }

    public static int add(int a, int b){
        return a+b;
    }
    public static int subtract(int a, int b){
        //int b1 = ~b;
        int b1 = ~b; // 1's compliment
        b1 = b1 + 1; // 2's compliment
        return a+b1; // can be replaced by bit wise operator ~ and then be added
    }
    // Refactor the logic and avoid using * sign 
    public static int multiply(int a, int b){
        int times = a;
        
        if(times < 0){
            times = times*-1; // REMOVE * SIGN 
        }
        int res = 0;
        while(times-- > 0){
            res += b;
        }
        return res;
    }

    // / -> Divison operator not used, % operator not used
    public static int divide(int a, int b){
        int divisor = a > b ? b: a;
        int divident = a > b ? a : b;
        
        int count = 0;
        while(divident >= divisor){
            divident = subtract(divident,divisor);
            count++;
        }
        System.out.println("modulo " + a + " % " + b + " = " + divident);
        return count;
    }
}
