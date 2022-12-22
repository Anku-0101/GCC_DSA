import java.util.*;

class Main{
    
    public static void main(String[] args){
        String str = "aaabbbaaa";
        //GetCount(str);
        System.out.println(str + " = " + ispalindrome(str));
    }
      
    
    public static String GetSubstring(String str, int startIndex, int endIndex){
      String s = "";

        for (int i= startI; i<=endI; i++){
            s = s + str.charAt(i);
        } 
        return s;
    }
  
    public static boolean ispalindrome(String str){
        int start=0,end=str.length()- 1;

        while(start<end){
            if(str.charAt(start)==str.charAt(end)){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    } 

    
    public static void GetCount(String str){
        int uc=0, lc=0, sb=0, num=0;
        for(int i=0;i<str.length();i++){
            int a=(int)str.charAt(i);

            if(a>=65 && a<=90){
                uc++;
            }
            else if(a>=97 && a<=122){
                lc++;   
            }
            else if(a>=48 && a<=57){
                num++;
            }
            else
                sb++;
            
        }
        System.out.println("Uppercase = "+uc);
        System.out.println("lowercase = "+lc);
        System.out.println("Symbol = "+sb);
        System.out.println("Number = "+num);
    }

}
