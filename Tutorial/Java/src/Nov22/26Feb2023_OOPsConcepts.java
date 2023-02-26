import java.util.*;
import java.io.*;

class Main {  
    public static void main(String args[]) {
       //Rectangle r1 = new Rectangle();
       //Rectangle r2 = new Rectangle(2,3);
       //System.out.println(r1.getBreadth());
       //System.out.println(r1.getLength());
       //Point p1 = new Point(1,2);
       //Point p2 = new Point(2,2);
       
       //System.out.println(p1.equal(p2));
       
       subClassB b = new superClassA();
       b.foo();
       b.bar();
    }    
}

class superClassA{
    public void foo(){
        System.out.println("superClassA foo method");
    }
}

class subClassB extends superClassA{
    public void bar(){
        System.out.println("subClassB bar method");
    }
    
    public void foo(){
        System.out.println("subClassB foo method");
    }
}

class Point{
    int x,y;

    Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public boolean equal(Point pt){
        if(this.x==pt.x && this.y==pt.y){
            return true;
        }
        else{
            return false;
        }
    }
}

// how to invoke constructor using this keyword
class Rectangle{
    private int length;
    private int breadth;
    
    Rectangle(int length){
        this(length,1);
    }
    
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    
    Rectangle(){
        this(1,1);
    }
    
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
}
