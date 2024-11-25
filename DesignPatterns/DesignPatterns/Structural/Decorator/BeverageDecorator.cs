using System;
namespace DesignPatterns.DesignPatterns.Structural.Decorator
{
    public abstract class Beverage
    {
        public virtual string GetDescription()
        {
            return "Beverage";
        }
        public abstract double Cost();
    }

    public class Espresso : Beverage
    {
        public override string GetDescription()
        {
            return "Espresso";
        }
        public override double Cost()
        {
            return 3.8;
        }
    }

    public class HouseBlend : Beverage
    {
        public override string GetDescription()
        {
            return "House Blend Coffee";
        }
        public override double Cost()
        {
            return 5.7;
        }
    }

    public abstract class CondimentDecorator : Beverage
    {
        
    }

    public class Mocha : CondimentDecorator
    {
        private Beverage beverage;

        public Mocha(Beverage beverage_)
        {
            this.beverage = beverage_;
        }

        public override string GetDescription()
        {
            return beverage.GetDescription() + ", Mocha";
        }

        public override double Cost()
        {
            return beverage.Cost() + 1.5;
        }
    }

    public class Whip : CondimentDecorator
    {
        private Beverage beverage;

        public Whip(Beverage beverage_)
        {
            this.beverage = beverage_;
        }

        public override string GetDescription()
        {
            return beverage.GetDescription() + ", Whip";
        }

        public override double Cost()
        {
            return beverage.Cost() + 0.5D;
        }
    }

    public class BeverageDecorator
    {
        public void Demo()
        {
            Espresso espresso = new Espresso();
            Mocha mocha1 = new Mocha(espresso);
            Mocha mocha2 = new Mocha(mocha1);
            Whip whip = new Whip(mocha2);

            Console.WriteLine(whip.GetDescription());
            Console.WriteLine("Total cost = {0} ", whip.Cost());
        }
    }
}

