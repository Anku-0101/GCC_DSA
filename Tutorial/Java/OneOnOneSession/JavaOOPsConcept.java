import java.util.*;

class Main{
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        Rectangle r3 = new Rectangle();

        r1.width = 10;
        r1.length = 15;

        r2.width = 10;
        r2.length = 12;
        boolean isSame = r1.isEqual(r2);
        System.out.println(isSame);

        Circle circle = new Circle();
        circle.setRadius(4);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

    }
}

class Circle {
    double radius;
    double getArea() {
        return radius * radius;
    }
    
    double getPerimeter() {
        return (2 * radius * 3.14);
    }

    void setRadius(int radius) {
        this.radius = radius;
    }
    boolean isEqual(Circle circle) {
        return (this.radius == circle.radius);
    }

}


class Rectangle{
   int width;
   int length;
    
   int   getArea(){
      return width*length;
   }
  boolean isEqual(Rectangle r){
   return (this.width == r.width &&  this.length == r.length);
  }
}
