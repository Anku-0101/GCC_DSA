import java.util.*;

class Main{
    
    public static void main(String[] args){
        System.out.println(EuclidGCD(36,90));
    }
    
    public static int EuclidGCD(int a, int b){
        return (b == 0) ? a : EuclidGCD(b, a%b);
    }
    
    public static int GCDIteration(int a, int b){
        
        while(b != 0){
            int remainder = a%b;
            a = b;
            b = remainder;
        }
        
        return a;
    }
    
    // time complexity O(log b)
    // Space complexity O(log b)
    public static int GCDrecursion(int a,int b){
        if(b==0)
            return a;

        return GCDrecursion(b,a%b);

}
    
    public static int GCD(int a, int b){
        ArrayList<Integer> arr1 = GetFactors(a); // factors of a
        ArrayList<Integer> arr2 = GetFactors(b); // factors of b
        
        ArrayList<Integer> common = GetCommon(arr1, arr2); // common factors of a and b
        return GetMax(common); // maximum common factors of a and b
    }
    
    // Time complexity
    // O(n^2)
    // Space complexity
    // O(n) : n -> min of size of arr1 and arr2
    public static ArrayList<Integer> GetCommon(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
        ArrayList<Integer> common = new ArrayList<>();
        
        for(int i = 0; i < arr1.size(); i++){
            for(int j = 0; j < arr2.size(); j++){
                if(arr1.get(i) == arr2.get(j)){
                    common.add(arr1.get(i));
                    break;
                }
            }
        }
        return common;
    }
    
    //Time complexity
    // O(n)
    // Space complexity
    // O(1)
    static int GetMax(ArrayList<Integer> arr){
        int max = -1;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) > max)
                max = arr.get(i);
        }
        return max;
    }
    
    // Time complexity 
    // O(sqrt(n))
    // Space complexity
    // O(n)
    public static ArrayList<Integer> GetFactors(int n){
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i = 1; i *i <= n; i++){
            if(n%i == 0){
                if(i != n/i){
                    res.add(i);
                    res.add(n/i);
                }
                else{
                    res.add(i);
                }
                
            }
        }
        return res;
    }
        
}
