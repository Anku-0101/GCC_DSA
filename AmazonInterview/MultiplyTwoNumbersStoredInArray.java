// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// two big integer -> can't stored 
// [5,6,7] * [8,9] = [...]
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] arr1 = {9,9,9,9};
        int[] arr2 = {9,9,9};
        
        ArrayList<Integer> res = Multiply(arr1, arr2);
        System.out.println(res);
    }
    
    static ArrayList<Integer> addZero(int i){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(i > 0){
            arr.add(0);
            i--;
        }
        return arr;
    }
    
    static ArrayList<Integer> addList(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
        int n1 = arr1.size();
        int n2 = arr2.size();
        ArrayList<Integer> res = new ArrayList<Integer>();
        int size = n1 < n2 ? n1 : n2;
        int carry = 0;
        for(int i = 0; i < size; i++){
            int num1 = arr1.get(i);
            int num2 = arr2.get(i);
        
            int addn = num1+num2 + carry;
            carry = addn/10;
            res.add(addn%10);
        }
        
        while(size < n1){
            int sum = carry + arr1.get(size);
            carry = sum/10;
            res.add(sum%10);
            size++;
        }
        while(size < n2){
            int sum = carry + arr2.get(size);
            carry = sum/10;
            res.add(sum%10);
            size++;
        }
        return res;
    }
    static ArrayList<Integer> Multiply(int[] arr1, int[] arr2){
        ArrayList<Integer> res = new ArrayList<Integer>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        
        
        for(int i = 0; i<n1; i++){
            ArrayList<Integer> row = addZero(i);
            int carry = 0;
            for(int j = 0; j < n2; j++){
                int multiply = arr1[i]*arr2[j]+carry;
                carry = multiply/10;
                row.add(multiply%10);
            }
            row.add(carry);
            res = addList(row, res);
            //System.out.println(row);
            System.out.println();
            //System.out.println(res);
        }
        
        return res;
    }
}
