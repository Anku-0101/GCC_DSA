// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        /*
        Boolean res1 = IsBetween(13);
        System.out.println("\n Test 0 = " + res1);
        Boolean res2 = IsBetween(1);
        System.out.println("\n Test 1 = " + res2);
        Boolean res3 = IsBetween(10);
        System.out.println("\n Test 2 = " + res3);
        Boolean res4 = IsBetween(-2);
        System.out.println("\n Test 3 = " + res4);
        Boolean res5 = IsBetween(0);
        System.out.println("\n Test 4 = " + res5);
        Boolean res6 = IsBetween(5);
        System.out.println("\n Test 5 = " + res6);*/
        //SwitchTest('A');
        PrintDays(3);
        //PrintDays(11);
        //IsLucky(1111);
        //IsLucky(121);
        //IsLucky(23141);
        //IsLucky(8392);
        //IsLucky(-8392);
        //DemoWhileLoop();
        //IsLucky(-8392);
    }
    
    public static void DemoWhileLoop(){
        int i = 0;
        while(i > -5){
            System.out.println("Anku kumar \n");
            i--;
        }
        
        IsLucky(-8392);
    }
    public static void IsLucky(int n){
        // 1234 -> 1234%10 -> 4, 4th digit
        // 1234/10 -> 123 -> 123%10 -> 3rd digit
        // 123/10 -> 12 -> 12%2 -> 2nd digit
        // 12/10 -> 1 -> 1%10 -> 1st digit
        
        if(n <= 999 || n > 9999){
            System.out.println("Unlucky number \n");
        }
        else{ // this means number is 4 digit number
            int fourthDigit = n%10;
            n = n/10;
            int thirdDigit = n%10;
            n = n/10;
            int secondDigit = n%10;
            n = n/10;
            int firstDigit = n%10;
            
        if(firstDigit + secondDigit == thirdDigit + fourthDigit){
                System.out.println("Lucky number \n");
            }
            else{
                System.out.println("Unlucky number \n");
            }
        }
        
        
        
    }

    public static void PrintDays(int n){
        switch(n){
            case 1:
                System.out.println("Monday");
                
            case 2:
                System.out.println("Tuesday");
                
            case 3:
                System.out.println("Wednesday");
                
            case 4:
                System.out.println("Thursday");
                
            case 5:
                System.out.println("Friday");
                
            case 6:
                System.out.println("Saturday");
                
            case 7:
                System.out.println("Sunday");
                
            default:
                System.out.println("Not a correct input");
        }
    }

    public static void SwitchTest(char c){
        switch(c){
            case 'A':
                System.out.println("character A");
                break; 
            case 'B':
                System.out.println("character B");
                break; 
            default:
                System.out.println("other character  ");
        }
    }
    
    //public static Boolean IsBetween(int n){
        // 1. Using only AND operator 
        //Boolean check = (n > 0) && (n < 11);
        //if((n > 0) && (n < 11))
          //  return true;
        //else
          //  return false;
          //return ((n > 0) && (n < 11)) ? true : false;
          
    //}
}