using System;
using System.Collections.Generic;

namespace DesignPatterns.SolidPrinciples.OpenClosedPrinciple
{
    public class AreaCalculator
    {
        public double CalculateArea(object shape)
        {
            if (shape is Circle)
            {
                double radius_ = ((Circle)shape).radius;
                return Math.PI * (radius_*radius_);
            }
                
            if(shape is Square)
            {
                double side_ = ((Square)shape).side;
                return side_ * side_;
            }
            else
            {
                throw new Exception("Undefined shape");
            }
                
        }
    }

    public class Circle
    {
        public double radius;
    }

    public class Square
    {
        public double side;
    }
}

namespace DesignPatterns.SolidPrinciples.OpenClosedPrinciple.Implemented
{
    public interface IArea
    {
        double CalculateArea();
    }

    public class Circle : IArea
    {
        public double radius;

        public double CalculateArea()
        {
            return Math.PI * radius * radius;
        }
    }

    public class Rectangle : IArea
    {
        public double length;
        public double width;

        public double CalculateArea()
        {
            return length * width;
        }

    }

    /// <summary>
    /// Client class
    /// </summary>
    public class AreaCalculator
    {
        public double GetArea(IArea shape) 
        {
            return shape.CalculateArea();
        }
    }
}

