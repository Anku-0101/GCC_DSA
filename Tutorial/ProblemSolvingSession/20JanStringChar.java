// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        //PrintAscii('0', '9');
        //PrintASCIIString("a12BbC9");
        //GetBinary(12345); //11000000111001
        System.out.println(GetInteger("11000000111001"));
    }
    static int GetInteger(String binary){
        int multiplier = 1;
        int ans = 0;
        for(int i = binary.length()-1; i>=0; i--){
            int num = (int)binary.charAt(i)-48;
            ans += num*multiplier;
            multiplier = multiplier*2;
        }
        return ans;
    }
    
    static void GetBinary(int x){
        String ans = "";
        if(x == 0)
            ans = "0";
        
        for(int i = x ; x != 0; ){
            if(x%2 == 1)
                ans += "1";
            else
                ans += "0";
            
            x = x/2;
        }
        
        System.out.println(Reverse(ans));
    }
    
    static String Reverse(String str){
        String res = "";
        for(int i = str.length()-1; i >=0; i--){
            res += str.charAt(i);
        }
        return res;
    }
    /// This method is printing ASCII values of all the characters between first and second including first and scond
    static void PrintAscii(char first, char second){
        for(int i = (int)first; i <= (int)second; i++)
            System.out.println("Char = " + (char)i + " ASCII = "+ i + " \n");
    }
    
    static void PrintASCIIString(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + ": " + (int) str.charAt(i)+"\n");
        }
    }
  
   public static void For_Loop(int n){

     for(int i = 1; i <= n; i++){
         if(i%2 == 0)
            System.out.print("even ");
         else
            System.out.print("odd ");
     }
}

static int GetInteger(String binary){
        int multiplier = 1;
        int ans = 0;
        for(int i = binary.length()-1; i>=0; i--){
            int num = (int)binary.charAt(i)-48;
            ans += num*multiplier;
            multiplier = multiplier*2;
        }
        return ans;
    }
  
  import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        //System.out.println("n = " + n);
        String str = sc.nextLine();
        //System.out.println("Str = " + str);
        
        int count = 0; 
        String ans = "";
        String binary = "";
        
        for(int i = str.length()-1; i >= 0; i--){
            if(count < 3){
                binary += str.charAt(i);
                count++;
            }
            if(count == 3){
                int decimal = GetInteger(binary);
                //System.out.println("Binary = " + binary + " Decimal = " + decimal);
                ans += (char)(decimal+48);
                binary = "";
                count = 0;
            }
        }
        if(count > 0){
            int decimal = GetInteger(binary);
            //System.out.println("Binary = " + binary + " Decimal = " + decimal);
            ans += (char)(decimal+48);
        }

        System.out.println(Reverse(ans));
    }

    static int GetInteger(String binary){
        binary = Reverse(binary);
        int multiplier = 1;
        int ans = 0;
        for(int i = binary.length()-1; i>=0; i--){
            int num = (int)binary.charAt(i)-48;
            ans += num*multiplier;
            multiplier = multiplier*2;
        }
        return ans;
    }

    static String Reverse(String str){
        String res = "";
        for(int i = str.length()-1; i >=0; i--){
            res += str.charAt(i);
        }
        return res;
    }
}

}
