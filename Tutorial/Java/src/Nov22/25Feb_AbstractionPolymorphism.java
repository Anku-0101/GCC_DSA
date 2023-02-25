import java.util.*;
import java.io.*;

class Main {  
    public static void main(String args[]) {
       
       shape mycircle = new Circle(4);
       // dot(.) operator is used to access all the public fields and methods of the class
       
       shape myrectangle = new Rectangle(9,10);
       shape mysquare = new Square(5);
       
       
       //System.out.println(mysquare.getEdge());
       
       System.out.println("Area of circle = " + mycircle.getArea());
       System.out.println("Area of square = " + mysquare.getArea());
       System.out.println("Area of rectangle = " + myrectangle.getArea());
       
       
       System.out.println("\nperimeter of circle = " + mycircle.perimeter());
       System.out.println("perimeter of square = " + mysquare.perimeter());
       System.out.println("perimeter of rectangle = " + myrectangle.perimeter());
       
       
       System.out.println("\nNumberOfEdges in square " + mysquare.NumberOfEdges());
       System.out.println("NumberOfEdges in Rectangle " + myrectangle.NumberOfEdges());
       System.out.println("NumberOfEdges in circle " + mycircle.NumberOfEdges());
       
       System.out.println("\nDimension in square " + mysquare.GetDimensionOfShapes());
       System.out.println("Dimension in Rectangle " + myrectangle.GetDimensionOfShapes());
       System.out.println("Dimension in circle " + mycircle.GetDimensionOfShapes());
    }
    
}

abstract class shape{
    // abstract methods
    abstract float getArea();
    abstract float perimeter();
    
    // vitual methods are having a default impplmentation and the implementation can be @Overriden by inheriting classes
    public int NumberOfEdges(){
        return Integer.MAX_VALUE;
    } 
    
    public String GetDimensionOfShapes(){
        return "2D";
    } 
}

class Circle extends shape{
    float radius;

    Circle(float Radius){
        this.radius = Radius; 
    }
    
    public void setRadius(float radius){
        if(radius > 0)
            this.radius = radius;
        
        System.out.println("Invalid radius");
    }
    
    @Override
    public float getArea(){
        return (3.141f)*radius*radius;
    }
    
    public float perimeter(){
        return 2*(3.141f)*radius;
    }
    
    
    
}

class Square extends shape{
    float side;
    
    
    Square(float side){
        this.side = side;
    }
    
    public float getArea(){
        return side*side;
    }

    public float perimeter(){
        return 4*side;
    }
    // @Overridding abstract class`implementation
    public int NumberOfEdges(){
        return 4;
    }
}

class Rectangle extends shape{
    float length;
    float breadth;
    
    public Rectangle(float length, float breadth){
        this.length = length;
        this.breadth = breadth;
    }
    
    public Rectangle(float breadth){
        this.breadth = breadth;
        length = 3;
    }
    
    public float getArea(){
        return length*breadth;
    }
    public float perimeter(){
        return 2*(length + breadth);
    }
}

/*
*
*
*
/// INTERFACE EXERCISE
interface shape{
    float getArea();
    float perimeter();
}


class Circle implements shape{
    float radius;

    Circle(float Radius){
        this.radius = Radius; 
    }
    
    
    @Override
    public float getArea(){
        return (3.141f)*radius*radius;
    }
    
    public float perimeter(){
        return 2*(3.141f)*radius;
    }
    
    
    
}

class Square implements shape{
    float side;
    
    
    Square(float side){
        this.side = side;
    }
    
    public float getArea(){
        return side*side;
    }

    public float perimeter(){
        return 4*side;
    }
    
    public int getEdge(){
        return 4;
    }
}

class Rectangle implements shape{
    float length;
    float breadth;
    
    public Rectangle(float length, float breadth){
        this.length = length;
        this.breadth = breadth;
    }
    
    public Rectangle(float breadth){
        this.breadth = breadth;
        length = 3;
    }
    
    public float getArea(){
        return length*breadth;
    }
    public float perimeter(){
        return 2*(length + breadth);
    }
}
*
*
*/
