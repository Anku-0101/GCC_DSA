// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
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
        System.out.println("\n Test 5 = " + res6);
    }
    
    public static Boolean IsBetween(int n){
        //Boolean res = !(n < 1 || n > 11);
        // Nested ternary operator
        Boolean res = (n > 11) ? false : ((n > 0) ? true : false);
        Boolean res1 = (n < 11) ? ((n>0) ? true : false) : false;
        Boolean res2 = (n > 0) ? ((n <11)?true : false) : false;
        Boolean res3 = (n < 0) ? false : ((n <11)?true:false);
        return res2; // res, res1, res3
    }
}