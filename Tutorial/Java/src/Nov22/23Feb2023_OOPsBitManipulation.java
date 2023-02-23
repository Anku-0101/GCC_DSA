import java.util.*;
import java.io.*;

/*
class Array{
    public int length;
    Array(int len){
        this.length = len;
    }
}

class String{
    // dynamic character array
    public static int length(){
        // return the length of dynamic character
        return -1;
    }
    
}*/

public interface car{
    
}

class Main {  
      
    public static void main(String args[]) {
       
        int[] arr = {3,3,4,3,5,5,6,7,6,7,7,6,5};
        //findTwoNonRepeating(arr);
        int res = repeated(arr);
        System.out.println(res);
        
    }
    
    
    public static int repeated(int[]arr){
        int[] b=new int[32];
        
        // a = {7,9,7,9};
        // 7 -> 0 0 0 0 0 .. 0 1 1 1
        for(int i=0;i<arr.length;i++){
            int index = 0;
            while(arr[i] > 0){
                b[index++] += arr[i]&1;
                arr[i] = arr[i]>>1;
            }
            
            // for(int j=0; j < 32;j++){
            //     if((a[i] & 1) == 1){
            //         b[j]++;
            //     }
            //     a[i]=a[i]>>1;
            // }
        }
        for(int i=31;i>=0;i--){
            b[i]=b[i]%3;
        }
        int decimal=0;
        for(int i=0; i <32; i++){
            decimal += b[i]*pow(2,i);
        }
        return decimal;
    }
    
    //public static long[] arr=new long[50];
    
    public static int pow(int num, int p){
        if(num == 0)
            return 0;
            
        if(p == 0)
            return 1;
        
        if(p%2 == 0){
            int y = pow(num,p/2);
            return y*y;
        }
        
        return num*pow(num,p-1);
    }
    
    public static void findTwoNonRepeating(int[] arr){
        int res = 0;
        int n = arr.length;
        for(int i = 0; i< n; i++){
            res = res^arr[i];
        }
        int num = res;
        int index = 0;
        while(num>0){
            if((num&1) == 1){
                break;
            }
            index++;
            num = num>>1;
        }
        
        int part1 = 0;
        for(int i = 0; i < n; i++){
            if(find(arr[i], index) == 1)
                part1 = part1^arr[i]; // part1 ^= arr[i];
        }
        
        int num1 = part1;
        int num2 = part1^res;
        
        System.out.println("num1 = " + num1 + " num2 = " + num2);
    }
    
    public static int find(int n, int pos){
        int mask = 1<< pos;
        int ans = n & mask;
        //System.out.println(ans);
            if(ans !=0)
                return 1;
            
        return 0;
    }    
}
