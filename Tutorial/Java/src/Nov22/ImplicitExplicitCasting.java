// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        // Implicit Conversion
        double d1 = 4; // int -> double
        double d2 = 5.7f; // float->double
        long l1 = 100; // int-> long
        
        float x = 8; // Implicit conversion 
        
        // Explicit 
        int i1 = (int)4.5; // error double->int
        int i2 = (int)8L; //error long->int
        float f1 = (int)7.9; // error double->float 
    }
}