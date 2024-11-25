using System;
namespace DesignPatterns.SolidPrinciples.DependencyInversionPrinciple
{
    public class Exercise_DIP
    {
        public Exercise_DIP()
        {
        }
    }

    /// <summary>
    /// What happens if we add more operations??
    /// </summary>
    public class Calculator
    {
        public double Add(double x, double y)
        {
            return x + y;
        }

        public double Subtract(double x, double y)
        {
            return x - y;
        }
    }
}























namespace DesignPatterns.SolidPrinciples.DependencyInversionPrinciple.ExerciseSolved
{

    public interface ICalculatorOperation
    {
        double Calculate(double x, double y);
    }


    public class Calculator
    {
        public ICalculatorOperation CalculatorOperation { get; }

        // ICalculatorOperation is "injected" via the constructor.
        // This guarantees that the Calculator cannot be created without a calculator operation.
        // This makes the Calculator "dependent" on the ICalculatorOperation.
        public Calculator(ICalculatorOperation calculatorOperation)
        {
            CalculatorOperation = calculatorOperation;
        }

        public double Solve(double x, double y)
        {
            // Calculations will be based on the "injected" ICalculatorOperation.
            return CalculatorOperation.Calculate(x, y);
        }
    }

    public class AddCalculatorOperation : ICalculatorOperation
    {
        public double Calculate(double x, double y)
        {
            return x + y;
        }
    }

    public class SubtractCalculatorOperation : ICalculatorOperation
    {
        public double Calculate(double x, double y)
        {
            return x - y;
        }
    }

    public class DivideCalculatorOperation : ICalculatorOperation
    {
        public double Calculate(double x, double y)
        {
            return x / y;
        }
    }

    public class MultiplyCalculatorOperation : ICalculatorOperation
    {
        public double Calculate(double x, double y)
        {
            return x * y;
        }
    }

    public class CalculatorProgram
    {
        public void AddSample()
        {
            Calculator calculator = new Calculator(new AddCalculatorOperation());
            double result = calculator.Solve(1, 1);
            // Result is 2.
        }

        public void SubtractSample()
        {
            Calculator calculator = new Calculator(new SubtractCalculatorOperation());
            double result = calculator.Solve(1, 1);
            // Result is 0.
        }

        public void MultiplySample()
        {
            Calculator calculator = new Calculator(new MultiplyCalculatorOperation());
            double result = calculator.Solve(1, 2);
            // Result is 2.
        }

        public void DivideSample()
        {
            Calculator calculator = new Calculator(new DivideCalculatorOperation());
            double result = calculator.Solve(10, 5);
            // Result is 2.
        }
    }
}