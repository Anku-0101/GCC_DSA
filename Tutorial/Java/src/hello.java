class HelloWorld{
    public int foo(int x){
        return x*x;
    }
    public static void main(String[] args){
        HelloWorld hello = new HelloWorld();
        int y =hello.foo(2);
        System.out.println(y);
        System.out.println("Hello world");
    }
}