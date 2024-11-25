using System;
using System.Collections.Generic;

namespace DesignPatterns.DesignPatterns.Creational.Builder
{
    public class BuilderPattern
    {
        public BuilderPattern()
        {
        }
    }

    public interface IItem
    {
        string Name();
        IPacking Packing();
        float Price();
    }

    public interface IPacking
    {
        string Package();
    }

    public class Wrapper : IPacking
    {
        public string Package()
        {
            return "Wrapper";
        }
    }

    public class Bottle : IPacking
    {
        public string Package()
        {
            return "Bottle";
        }
    }

    public abstract class Burger : IItem
    {
        public abstract string Name();
        

        public IPacking Packing()
        {
            return new Wrapper();
        }

        public abstract float Price();
    }

    public abstract class ColdDrink : IItem
    {
        public abstract string Name();
        

        public IPacking Packing()
        {
            return new Bottle();
        }

        public abstract float Price();
    }

    public class VegBurger : Burger
    {
        public override string Name()
        {
            return "Veg Burger";
        }

        public override float Price()
        {
            return 25.0f;
        }
    }

    public class ChickenBurger : Burger
    {
        public override float Price()
        {
            return 50.0f;
        }

        public override string Name()
        {
            return "Chicken Burger";
        }
    }

    public class Coke : ColdDrink
    {
        public override float Price()
        {
            return 30.0f;
        }

        public override string Name()
        {
            return "Coke";
        }
    }

    public class Pepsi : ColdDrink
    {
        public override float Price()
        {
            return 35.0f;
        }

        public override string Name()
        {
            return "Pepsi";
        }
    }

    public class Meal
    {
        private List<IItem> items = new List<IItem>();

        public void AddItem(IItem item)
        {
            items.Add(item);
        }

        public float GetCost()
        {
            float cost = 0.0f;
            foreach (IItem item in items)
                cost += item.Price();

            return cost;
        }

        public void ShowItems()
        {
            foreach(IItem item in items)
            {
                Console.WriteLine("Item name = " + item.Name());
                Console.WriteLine("package = " + item.Packing().Package());
                Console.WriteLine("Price = "+ item.Price());
                Console.WriteLine("-----------------");
            }
        }
    }

    public class MealBuilder
    {
        public Meal PrepareVegMeal()
        {
            Meal meal = new Meal();
            meal.AddItem(new VegBurger());
            meal.AddItem(new Coke());

            return meal;
        }

        public Meal PrepareNonVegMeal()
        {
            Meal meal = new Meal();
            meal.AddItem(new ChickenBurger());
            meal.AddItem(new Pepsi());
            return meal;
        }
    }
}

