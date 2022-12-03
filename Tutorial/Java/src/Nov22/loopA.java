// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        //EnterNumber();
        //RollDice();
        ForLoop();
    }
    
    public static void EnterNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number \n");
        int num = sc.nextInt();
        while(num <1 || num >10) {
            System.out.println(num + " is not between 1 to 10. Try again");
            num = sc.nextInt();
        }
        System.out.println(num + " number is b/w 1 to 10 thanks!\n");
    }
    public static void ForLoop(){
        for(int i = 0; i < 5; i++){
            System.out.println("LOOP 1 \n");
        }
        
        for(int i = 0; i < 5; ++i){
            System.out.println("LOOP 2 \n");
        }
    }
    
    public static void RollDice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dice score \n");
        int dice = sc.nextInt();
        
        if(dice > 6 || dice < 1){
            System.out.println("Invalid outcome \n");
            return;
        }
        int numberOfTimes = dice-1;
        
        if(numberOfTimes > 0){
            do
                System.out.println("Name \n");
            while(--numberOfTimes > 0);   
        }
        
        //while(numberOfTimes-- >0)
          //  System.out.println("Name \n");
            
    }
    
    public static void PrintName(){
        int i = 0;
        while(i++ < 5)
            System.out.println("Name \n");
    }
}