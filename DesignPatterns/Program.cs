using System;
using System.Threading.Tasks;
using DesignPatterns.DesignPatterns.Behavioural.ChainOfResponsibility;
using DesignPatterns.DesignPatterns.Behavioural.Command;
using DesignPatterns.DesignPatterns.Behavioural.Iterator;
using DesignPatterns.DesignPatterns.Behavioural.Mediator;
using DesignPatterns.DesignPatterns.Behavioural.Memento;
using DesignPatterns.DesignPatterns.Behavioural.Observer;
using DesignPatterns.DesignPatterns.Behavioural.Observer.YouTube;
using DesignPatterns.DesignPatterns.Behavioural.State;
using DesignPatterns.DesignPatterns.Behavioural.Strategy;
using DesignPatterns.DesignPatterns.Behavioural.Template;
using DesignPatterns.DesignPatterns.Behavioural.Visitor;
using DesignPatterns.DesignPatterns.Creational.Builder;
using DesignPatterns.DesignPatterns.Creational.Factory;
using DesignPatterns.DesignPatterns.Prototype;
using DesignPatterns.DesignPatterns.Singleton;
using DesignPatterns.DesignPatterns.Structural.Adapter;
using DesignPatterns.DesignPatterns.Structural.Bridge;
using DesignPatterns.DesignPatterns.Structural.Composite;
using DesignPatterns.DesignPatterns.Structural.Decorator;
using DesignPatterns.DesignPatterns.Structural.Facade;
using DesignPatterns.DesignPatterns.Structural.Flyweight;
using DesignPatterns.DesignPatterns.Structural.Proxy;
using DesignPatterns.SolidPrinciples.OpenClosedPrinciple.Implemented;

namespace DesignPatterns
{
    class Program
    {
        static void Main(string[] args)
        {
            Program dp = new Program();
            //dp.TestOCP();
            //dp.TestSingletonNormalClass();
            //dp.TestSingletonClass();
            //dp.TestSingletonInheritance();
            //dp.DemoSingletonThreadSafety();
            //dp.FactoryDesignDemo();
            //dp.AbstractFactoryDemo();
            //dp.MealBuilderDemo();
            //dp.PrototypeDemo();
            //dp.AdapterDemo();
            //dp.BridgePatternDemo();
            //dp.CompositeDemo();
            //dp.BeverageDecoratorDemo();
            //dp.DecoratorPatternDemo();
            //dp.FacadeDemo();
            //dp.FlyWeightDemo();
            //dp.ProxyPatternDemo();
            //dp.ChainOfResponsibilityPatternDemo();
            //dp.CommandPatternDemo();
            //dp.IteratorPatternDemo();
            //dp.MediatorPatternDemo();
            //dp.MementoPatternDemo();
            //dp.ObserverPatternDemo();
            //dp.ObserverDemo();
            //dp.StatePatternDemo();
            //dp.StrategyPatternDemo();
            dp.TemplatePatternDemo();
            //dp.VisitorDemo();

            Console.ReadKey();

        }

        public void VisitorDemo()
        {
            VisitorPattern vp = new VisitorPattern();
            vp.VisitorPatternDemo();
        }

        public void TemplatePatternDemo()
        {
            TemplatePattern tp = new TemplatePattern();
            tp.TemplatePatternDemo();
        }

        public void StrategyPatternDemo()
        {
            StrategyPattern sp = new StrategyPattern();
            sp.StrategyPatternDemo();
        }
        public void StatePatternDemo()
        {
            StatePattern sp = new StatePattern();
            sp.StatePatternDemo();
        }
        public void ObserverDemo()
        {
            ObserverPattern op = new ObserverPattern();
            op.ObserverPatternDemo();
        }

        public void ObserverPatternDemo()
        {
            YouTube yt = new YouTube();
            yt.DemoSubscriberNotification();
        }

        public void MementoPatternDemo()
        {
            MementoPattern mp = new MementoPattern();
            mp.MementoPatternDemo();
        }
        public void MediatorPatternDemo()
        {
            MediatorPattern mp = new MediatorPattern();
            mp.DemoMediatorPattern();
        }


        public void IteratorPatternDemo()
        {
            IteratorDemo id = new IteratorDemo();
            id.DemoIteratorPattern();
        }
        public void CommandPatternDemo()
        {
            CommandPattern cp = new CommandPattern();
            cp.CommandPatternDemo();
        }

        public void ChainOfResponsibilityPatternDemo()
        {
            ChainPatternDemo.DemoChainPattern();
            
        }

        public void ProxyPatternDemo()
        {
            ProxyPattern pp = new ProxyPattern();
            pp.Client();
        }

        public void FlyWeightDemo()
        {
            Engineering.TestFlyWeightImplementation();
        }


        public void FacadeDemo()
        {
            FacadePattern fp = new FacadePattern();
            fp.Demo();
        }

        public void DecoratorPatternDemo()
        {
            DecoratorPattern dp = new DecoratorPattern();
            dp.Demo();
        }

        public void BeverageDecoratorDemo()
        {
            BeverageDecorator bd = new BeverageDecorator();
            bd.Demo();
        }

        public void CompositeDemo()
        {
            CompositePatternDemo cpd = new CompositePatternDemo();
            cpd.Demo();
        }
        public void BridgePatternDemo()
        {
            BridgeDemo bd = new BridgeDemo();
            bd.Demo();
        }


        public void AdapterDemo()
        {
            AudioPlayer audioPlayer = new AudioPlayer();

            audioPlayer.Play("mp3", "beyond the horizon.mp3");
            audioPlayer.Play("mp4", "alone.mp4");
            audioPlayer.Play("vlc", "far far away.vlc");
            audioPlayer.Play("avi", "mind me.avi");
        }
        public void PrototypeDemo()
        {
            PrototypeDemo pd = new PrototypeDemo();
            pd.DemoCopy();
        }
        public void MealBuilderDemo()
        {
            MealBuilder mealBuilder = new MealBuilder();
            Meal vegMeal = mealBuilder.PrepareVegMeal();
            Console.WriteLine("Veg meal ");
            vegMeal.ShowItems();
            Console.WriteLine("Total cost of veg Meal : " + vegMeal.GetCost());

            Meal nonVegMeal = mealBuilder.PrepareNonVegMeal();
            Console.WriteLine("Non veg meal ");
            nonVegMeal.ShowItems();
            Console.WriteLine("Total cost of non veg meal : " + nonVegMeal.GetCost());
        }

        public void AbstractFactoryDemo()
        {
            Console.WriteLine("Enter Bank name from where you wish to take loan");
            string bankName = Console.ReadLine();

            Console.WriteLine("Enter the type of loan you wish to take eg Home, Business, Education etc");
            string loanType = Console.ReadLine();

            AbstractFactory bankFactory = FactoryCreator.GetFactory("Bank");
            Bank b = bankFactory.GetBank(bankName);

            Console.WriteLine("Interest rate of " + bankName + " loan type " + loanType);
            double rate = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine("Enter the loan amount ");
            double amount = Convert.ToDouble(Console.ReadLine());


            Console.WriteLine("Enter the number of years to pay the loan amount");
            int years = Convert.ToInt32(Console.ReadLine());

            AbstractFactory loanFactory = FactoryCreator.GetFactory("Loan");
            Loan l = loanFactory.GetLoan(loanType);
            l.GetInterestRate(rate);
            l.CalculateLoanPayment(amount, years);

        }

        public void FactoryDesignDemo()
        {
            FactoryPatternDemo fpd = new FactoryPatternDemo();
            fpd.MainDemo();
        }

        public void DemoSingletonThreadSafety()
        {
            Parallel.Invoke(
                () => Instance1Creation(),
                () => Instance2Creation()
             );
            
            
        }

        private void Instance2Creation()
        {
            SingletonThreadSafety sg2 = SingletonThreadSafety.GetInstance();
            sg2.PrintDetails("Instance2");
        }

        private void Instance1Creation()
        {
            SingletonThreadSafety sg1 = SingletonThreadSafety.GetInstance();
            sg1.PrintDetails("Instance1");
        }

        public void TestSingletonInheritance()
        {
            Singleton sg1 = Singleton.GetInstance();
            sg1.PrintDetails("Instance 1");

            Singleton sg2 = Singleton.GetInstance();
            sg2.PrintDetails("Instance 2");

            Singleton.DerivedClass derived = new Singleton.DerivedClass();
            derived.PrintDetails("Derived Instance");

        }

        public void TestSingletonNormalClass()
        {
            NormalClass instance1 = new NormalClass();
            instance1.PrintDetails("Instance 1");

            NormalClass instance2 = new NormalClass();
            instance2.PrintDetails("Instance 2");
        }

        public void TestSingletonClass()
        {
            SingletonClass sg1 = SingletonClass.GetInstance();

            sg1.PrintDetails("Instance 1");

            SingletonClass sg2 = SingletonClass.GetInstance();
            sg2.PrintDetails("Instance 2");
        } 

        
        public void TestOCP()
        {
            Circle c1 = new Circle();
            c1.radius = 5;

            Rectangle r1 = new Rectangle();
            r1.length = 10;

            r1.width = 4;

            AreaCalculator areaCalculator = new AreaCalculator();
            Console.WriteLine("Area of circle = " + areaCalculator.GetArea(c1));
            Console.WriteLine("Area of Rectangle = " + areaCalculator.GetArea(r1));
            
        }
    }
}

