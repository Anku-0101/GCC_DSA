// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter first number");
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        
        System.out.println("Enter 2nd number");
        int secondNum = sc.nextInt();
        
        int sum = firstNum+secondNum;
        System.out.println("Sum = " + sum);
        
        int multiply = firstNum*secondNum;
        System.out.println("Multiply = " + multiply);
        
        int subtract = firstNum-secondNum;
        System.out.println("Subtraction = " + subtract);
        
        int div = firstNum/secondNum;
        System.out.println("division = " + div);
    }
}