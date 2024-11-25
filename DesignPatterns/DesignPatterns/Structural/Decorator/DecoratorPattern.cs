using System;
namespace DesignPatterns.DesignPatterns.Structural.Decorator
{
    public interface IFood
    {
        string PrepareFood();
        double FoodPrice();
    }

    public class VegFood : IFood
    {
        public double FoodPrice()
        {
            return 50.0;
        }

        public string PrepareFood()
        {
            return "Veg Food";
        }
    }

    /// <summary>
    /// Food decorator abstract class will implement the Food interface and
    /// It has the ability to decorate more foods
    /// </summary>
    public abstract class FoodDecorator : IFood
    {
        private IFood newFood;

        protected FoodDecorator(IFood newFood)
        {
            this.newFood = newFood;
        }

        public double FoodPrice()
        {
            return newFood.FoodPrice();
        }

        public string PrepareFood()
        {
            return newFood.PrepareFood();
        }
    }

    public class NonVegFood : FoodDecorator
    {
        public NonVegFood(IFood newFood) : base(newFood)
        {

        }

        public new string PrepareFood()
        {
            return base.PrepareFood() + " With roasted chicken curry ";
        }
        public new double FoodPrice()
        {
            return base.FoodPrice() + 150.0; 
        }
    }

    public class ChineseFood : FoodDecorator
    {
        public ChineseFood(IFood newFood) : base(newFood)
        {

        }

        public new string PrepareFood()
        {
            return base.PrepareFood() + " With Fried Rice and Noodles ";
        }

        public new Double FoodPrice()
        {
            return base.FoodPrice() + 65.0;
        }
    }

    public class DecoratorPattern
    {
        public void Demo()
        {
            Console.WriteLine("Veg Food");
            IFood vf = new VegFood();
            Console.WriteLine(vf.PrepareFood());
            Console.WriteLine(vf.FoodPrice());

            Console.WriteLine("veg + Non veg food");
            IFood f1 = new VegFood();
            NonVegFood nonVegFood = new NonVegFood(f1);
            Console.WriteLine(nonVegFood.PrepareFood());
            Console.WriteLine(nonVegFood.FoodPrice());

            Console.WriteLine("veg + Chinese Food ");
            IFood f2 = new VegFood();
            ChineseFood cf = new ChineseFood(f2);
            Console.WriteLine(cf.PrepareFood());
            Console.WriteLine(cf.FoodPrice());
        }
    }
}

