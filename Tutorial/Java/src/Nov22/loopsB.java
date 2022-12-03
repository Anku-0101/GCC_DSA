// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        // Nested loop demo
        /*
        for(int i = 2; i< 10; i += 2){
            for(int j = 2; j<10;  j *= i ){
                 System.out.println("JAVA TEST \n");
            }
        }*/
        //System.out.println("Enter the number till which you want multiplication table");
        //int n = new Scanner(System.in).nextInt();
        //MultiplicationTable(n);
        
        //TestingInnerLoopBreak();
        AskUser();
    }
    
    
    public static void LuckUnLuckyNumber(){
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String num = sc.next();

        //System.out.print("n = " + n );
        //System.out.print("num = " + num );

        // 0 to n-1 , n = 3 , 123456
        // n to 2*n-1

        long firstHalf = 0;
        long secondHalf = 0;

        for(int i = 0; i < num.length(); i++){
            // first half
            if(i < n){
                //System.out.println("half1 = " + num.charAt(i));
                // 48 is subtracted to get actual sum
                // 0 in ASCII == 48
                // char - 48 gives actual number
                //we can ignore 48 and still get correct answer
                firstHalf += (int)num.charAt(i) - 48; 
            } // second half
            else{
                //System.out.println("half2 = " + num.charAt(i));
                secondHalf += (int)num.charAt(i) - 48;
            }
        }
        //System.out.println("firstHalf = " + firstHalf);
        //System.out.println("SecondHalf = " + secondHalf);
        System.out.println((firstHalf == secondHalf)? "LUCKY" : "UNLUCKY");
    }
}
    }
    public static void AskUser(){
        while(true){
            System.out.println("enter a number \n");
            int n = new Scanner(System.in).nextInt();
            
            if(n < 1 || n > 10)
              continue;
            
            System.out.println("Number is between 1 to 10 \n");
            break;
        }
    }
    
    public static void TestingInnerLoopBreak(){
        for(int i = 0; i< 10; i++){
            
            if(i == 5){
                break;
            }
            
            for(int j = 1; j < 3; j++){
                System.out.println("\n inner i = " + i + " inner j = " + j);
            }
            
            System.out.println("\n outer i = " + i);
        }
    }
    
    public static void MultiplicationTable(int n){
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <=n; j++){
                System.out.print(i*j + " ");
            }
            System.out.print("\n");
        }
    }
}