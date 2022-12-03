// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World! 26Nov\n");
        
        //Taking input
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number(a) \n");
        int a = sc.nextInt();
        System.out.println("Enter Second Number(b) \n");
        int b = sc.nextInt();
        
        // Processed input
        GetMax(a,b);
        GetMin(a,b);
        
        Boolean ans = IsEven(a);
        String outpt = (ans) ? "Even" : "ODD";
        
        System.out.println("\n a is " + outpt);
        
        ans = IsEven(b);
        outpt = (ans) ? "Even" : "ODD";
        
        System.out.println("\n b is " + outpt);
        
    }
    
    public static void GetMax(int x, int y){
        int max = (x>y) ? x : y;
        System.out.println("\n max = " + max);
    }
    
    public static void GetMin(int x, int y){
        int min = (x > y) ? y : x;
        System.out.println("\n min = " + min);
    }
    
    public static Boolean IsEven(int num){
        Boolean result = (num%2 == 0) ? true : false;
        return result;
    }
}