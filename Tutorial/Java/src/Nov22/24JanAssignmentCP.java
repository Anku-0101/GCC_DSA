import java.util.*;

class Main{
    public static void main(String[] args){
        //String str = "134zz5";
        //System.out.println(convertStringToInt(str));
        int[] arr = {2,3,3,2,9,11,6,4,1,2,4,5,9,6,11,15};
        CountFrequency(arr);
    }
    
    public static void CountFrequency(int[] arr){
        // 1 -> find maximum element 
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        
        // 2 -> create an array of size max+1
        int[] hash = new int[max+1];
        
        // 3 -> store frequency in hash array
        for(int i = 0; i < arr.length; i++)
            hash[arr[i]]++;
        
        // 4 -> print all non-zero elements of hash
        for(int i = 0; i <= max; i++){
            if(hash[i] != 0)
                System.out.println(i + " " + hash[i]);
        }
    }
    
    public static int convertStringToInt(String str){
        int a = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)<48 || str.charAt(i)>57){
                System.out.println("Invalid numeric string");
                return -1;
            }
            else{
                a = a*10 + ((int)str.charAt(i) -48);
            }
        }

        return a;
    }
    
    public static boolean contains(String str, char key){
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)==key)
                return true;
        }
        return false;
    }
}
