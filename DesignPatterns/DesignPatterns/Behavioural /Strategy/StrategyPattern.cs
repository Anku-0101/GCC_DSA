using System;
namespace DesignPatterns.DesignPatterns.Behavioural.Strategy
{
    /// <summary>
    /// Decalring Strategy Interface
    /// </summary>
    public interface Strategy
    {
        public int DoOperation(int num1, int num2);
    }

    /// <summary>
    /// Create concrete classes implementing the same interface.
    /// </summary>
    public class OperationAdd : Strategy
    {
        public int DoOperation(int num1, int num2)
        {
            return num1 + num2;
        }
    }

    public class OperationSubtract : Strategy
    {
        public int DoOperation(int num1, int num2)
        {
            return num1 - num2;
        }
    }

    public class OperationMultiply : Strategy
    {
        public int DoOperation(int num1, int num2)
        {
            return num1 * num2;
        }
    }

    /// <summary>
    /// Creating Context class
    /// </summary>
    public class Context
    {
        private Strategy strategy;

        public Context(Strategy strategy)
        {
            this.strategy = strategy;
        }

        public int executeStrategy(int num1, int num2)
        {
            return strategy.DoOperation(num1, num2); // it can do any operation
        }
    }

    public class StrategyPattern
    {
        public void StrategyPatternDemo()
        {
            Context context = new Context(new OperationAdd());
            Console.WriteLine("10 + 5 = " + context.executeStrategy(10,5));

            context = new Context(new OperationSubtract());
            Console.WriteLine("10 - 5 = " + context.executeStrategy(10, 5));

            context = new Context(new OperationMultiply());
            Console.WriteLine("10 * 5 = " + context.executeStrategy(10, 5));
        }
    }

}

