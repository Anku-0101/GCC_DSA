import java.util.*;

class Main{
    
    public static void main(String[] args){
        //int arr[] = {2,-9,3,5,7,8};
        //arr = Delete(arr, 2);
        
        //for(int i = 0; i< arr.length; i++){
        //    System.out.println(arr[i]);
        //}
        //Factorial(5);
        
        String var = "name";
        System.out.println(Reverse(var));
        
    }
    public static String Reverse(String str){
        if(str.length() == 1)
            return str;
        
        String ans = Reverse(SubString(str,1)) + str.charAt(0);
        
        System.out.println("String str = " + str + " ans = " + ans);
        return ans;
    }
    
    public static String SubString(String str, int Startindex){
        String ans = "";
        for(int i = Startindex; i <str.length(); i++)
            ans += str.charAt(i);
            
        return ans;
    }
    
    
    public static int Factorial(int n){
     if( n == 0)
        return 1;
     
     int ans = n*Factorial(n-1);
     System.out.println("value of n = " + n + ", res = " +ans);
     return ans;   
    }
    
    public static int[] Delete(int [] arr,int index){
        int[] newar=new int[arr.length- 1];

        for(int i=0;i<arr.length;i++){
            if(i==index){
                continue;
            }
            else if (i<index){
                newar[i]=arr[i];
            }
            else if (i>index){
                newar[i- 1]=arr[i];
            }
        } 
        return newar;
    }
}

