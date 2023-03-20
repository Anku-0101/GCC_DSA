import java.util.*;


class ArrayListCustom{
    int[] arr;
    int size;

    ArrayListCustom(){
        arr = new int[5];
        size = -1;
    }

    void add(int val){
        if(size + 1 == arr.length){ 
            int[] newArr = new int[arr.length*2]; // increase size to 2 times
            // copy element from smaller ArrayList
            for(int i = 0; i < arr.length; i++){
                newArr[i] = arr[i];
            }
            newArr[++size] = val;
            arr = newArr;
        }
        else{// 0 to 9
            arr[++size] = val;  
        }
    }

    int get(int index){
        if(index >= size || index < 0){
            System.out.println("Index out of bounds");
            return -1;
        }
        return arr[index];
    }

    int Size(){
        return size+1;
    }

    void remove(int index){
        
    }

    void print(){
        for(int i = 0; i <= size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class Main{
    public static void main(String[] args){        
        
        ArrayListCustom mylist = new ArrayListCustom();
        mylist.add(3);
        mylist.add(8);
        System.out.println("list size = " + mylist.Size());
        mylist.print();
        mylist.add(-2);
        mylist.add(0);
        mylist.add(4);
        System.out.println("list size = " + mylist.Size());
        mylist.print();

        mylist.add(12);
        mylist.add(30);
        mylist.add(41);
        mylist.add(7);
        System.out.println("list size = " + mylist.Size());
        mylist.print();


        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(40, 90, 80, 40, 50, 60));
        //System.out.println(lcm(15,20));
    }

    public static int lcm(int a,int b){
        return (a*b)/euclid_gcd_recursive(a,b);
    }
    // a = 10, b = 6
    // euclid_gcd_recursive(2,0)
    // euclid_gcd_recursive(4,2)
    // euclid_gcd_recursive(6,4)
    // 
    //
    // a = 6, b = 10
    // euclid_gcd_recursive(10,6),-> self adjusting step where a becomes b if a < b 
    public static int euclid_gcd_recursive(int a, int b){
        /*
        if(b == 0)
            return a;
        
        return euclid_gcd_recursive(b, a%b); */
        return b == 0 ? a : euclid_gcd_recursive(b, a%b);
    }

    // O(log10(smallerOf(a,b))) -> O(number of digits in smaller of(a,b))
    public static int euclid_gcd_iterative(int a, int b){
        int divident = a > b ? a : b;
        int divisor = a > b ? b : a;

        while(divisor != 0){
            int rem = divident%divisor;
            divident = divisor;
            divisor = rem;
        }
        return divident;
    }
    // method to find hcf or gcd
    // TC : O(N^2)
    public static int hcf(int a, int b){
        ArrayList<Integer> factor_a = getFactor(a); // O(sqrt(n))
        ArrayList<Integer> factor_b = getFactor(b); // O(sqrt(n))

        ArrayList<Integer> common_factors = getCommon(factor_a, factor_b); // O(n^2)
        
        int res = getMax(common_factors); // O(n)
        return res;
    }

    // TC - O(N) : YES : post optimization - TC : O(sqrt(N))
    // SC - O(N)
    public static ArrayList<Integer> getFactor(int n){
        ArrayList<Integer> factor = new ArrayList<>();
        
        for(int i=1; i*i <= n; i++){
            if(n%i==0){
                if(n/i != i){
                    factor.add(i);
                    factor.add(n/i);
                }
                else{
                    factor.add(i);
                }
            }
        }
        return factor;
    }

    // TC : O(N^2)
    // SC : O(N)
    public static ArrayList<Integer> getCommon(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> list3 = new ArrayList<>();
        
        for(int i=0; i<list1.size();i++){
            for(int j=0; j<list2.size(); j++){
                if(list1.get(i)==list2.get(j)){
                    list3.add(list1.get(i)); // index is getting stored, we need to store value instead
                }
            }
        }
        return list3;
    }

    // TC - O(N)
    // SC - O(1)
    public static int getMax(ArrayList<Integer> list){
        int max = list.get(0);
        
        for(int i=0; i<list.size(); i++){
            if(list.get(i)>max){
                max =list.get(i);
            }
        }
        return max;
    }   
}
