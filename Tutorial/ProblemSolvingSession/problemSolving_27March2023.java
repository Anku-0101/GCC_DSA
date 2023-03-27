import java.util.*;

class Pair{
    int x;
    int y;
}

class Main{
    public static void main(String[] args){        
        /*
     int x = 4, y = 9;
     System.out.println("before swaping in main" + ", x = " + x + " y = " + y);
     swap(x,y);
     System.out.println("After swaping in main" + ", x = " + x + " y = " + y);
     ////
     
     System.out.println("Taking x and y from a class variable");
     Pair p = new Pair();
     p.x = 12;
     p.y = 8;
     System.out.println("before swaping in main" + ", x = " + p.x + " y = " + p.y);
     swap(p);
     System.out.println("After swaping in main" + ", x = " + p.x + " y = " + p.y);*/

        int x = 5;
        int[] arr = {1,2,3};

        DoDouble(x);
        DoDouble(arr);
        System.out.println("x = " + x);
        for(int i = 0; i< arr.length; i++){
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

    }

    static void DoDouble(int x){
        x = 2*x;
    }

    static void DoDouble(int[] x){
        for(int   i = 0; i < x.length; i++){
            x[i] = 2*x[i];
        }
    }
    static void swap(Pair pair){
        System.out.println("Start of swap method in pair method execution" + ", x = " + pair.x + " y = " + pair.y);
        pair.x = pair.x^pair.y;
        pair.y = pair.y^pair.x;
        pair.x = pair.x^pair.y;
        System.out.println("End of swap method in pair method execution" + ", x = " + pair.x + " y = " + pair.y);

    }
    static void swap(int a, int b){
        System.out.println("Start of swap method execution" + ", x = " + a + " y = " + b);
        a = a^b;
        b = b^a;
        a = a^b;
        System.out.println("End of swap method execution" + ", x = " + a + " y = " + b);
    } 
}
