using System;
namespace DesignPatterns.DesignPatterns.Creational.Factory
{
    public class FactoryPatternDemo
    {
        public void MainDemo()
        {
            Console.WriteLine("Enter shape");
            string inputShape = Console.ReadLine();

            if (ShapeFactory.GetShape(inputShape) == null)
                throw new Exception("Invalid or Undefined shape");

            Shape shape = ShapeFactory.GetShape(inputShape);
            shape.Draw();
        }
    }

    public interface Shape
    {
        void Draw();
    }

    public class Rectangle_ : Shape
    {
        public void Draw()
        {
            Console.WriteLine("Drawing Circle");
        }
    }

    public class Circle_ : Shape
    {
        public void Draw()
        {
            Console.WriteLine("Drawing Circle");
        }
    }

    public class Square_ : Shape
    {
        public void Draw()
        {
            Console.WriteLine("Drawing Square");
        }
    }

    public class ShapeFactory
    {
        public static Shape GetShape(string shapeType)
        {
            if (shapeType.ToLower() == "rectangle")
                return new Rectangle_();
            if (shapeType.ToLower() == "square")
                return new Square_();
            if (shapeType.ToLower() == "circle")
                return new Circle_();

            return null;
        }
    }

}

