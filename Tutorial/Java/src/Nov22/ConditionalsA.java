// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        
        //DemoANDOperator();
         //DemoOROperator();
         //DemoNOTOperator();
         //Scanner sc = new Scanner(System.in);
         //int a = sc.nextInt();
         //int b = sc.nextInt();
         
         //IFDemo(a,b);
         DemoSwitchCase(7);
        
    }
    public static void DemoSwitchCase(int n){
        int rem = n%2;
        switch(rem){
            case 0 :
                System.out.println(n + " is even \n");
                break;
            case 1 :
                System.out.println(n + " is odd \n");
                break;
            default : 
                System.out.println("Number is invalid \n");
        }
    }
    
    public static void DemoIfElseLadder(int x, int y){
        if(x > y){ // condition 1 
            System.out.println("x is max"); // statement 1
        }
        else if(y > x){ // condition 2 
            System.out.println("y is max"); // statement 2
        }
        else{
            System.out.println("x is equal to y");
        }
        
    }
    
    public static void DemoIfElse(int x){
        if(x % 2 == 0){
            System.out.println("X is even");
        }
        else{
            System.out.println("X is odd");
        }
    }
    
    public static void DemoIfElseNested(int x, int y){
        if(x==y){
            System.out.println("Numbers are equal");
        }
        else{
            if(x>y)
                System.out.println("x is grater");
            else{
                System.out.println("y is grater");
            }
        }
    }
    
    
    public static void IFDemo(int x, int y){
        if(x > y)
            System.out.println("max = " + x );
        
        if(x < y)
            System.out.println("max = " + y );
        
        if(x == y)
            System.out.println("numbers are equal" );
            
        if(x%2 == 0)
            System.out.println(x + " is even" );
        
        if(x%2 == 1)
            System.out.println(x + " is odd");
    }
    public static void DemoNOTOperator(){
        Boolean res1 = !(8==0);// -> true
        Boolean res2 = !((5>3) && (6==6) && (-2 > -4)); //-> False
        
        System.out.println("\n Res1 = " + res1);
        System.out.println("\n Res2 = " + res2);
    }
    
    public static void DemoOROperator(){
        Boolean res1 = (5>3) || (6<4) || (false);
        Boolean res2 = (false) || (6 != 6) || (-5 == 5);
        System.out.println("Res1 = " + res1);
        System.out.println("Res2 = " + res2);
    }
    
    public static void DemoANDOperator(){
        Boolean res = (5 < 3 && 6==6 && -2 > -4) ;
        System.out.println("\n" + res);
    }
    
    public static void TestCircularNature(){
       // Circular value of primitive numeric data type
        int val = (int)2147483649L;
        System.out.println("value = " + val); 
    }
}