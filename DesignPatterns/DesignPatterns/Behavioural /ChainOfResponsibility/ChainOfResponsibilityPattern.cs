using System;
namespace DesignPatterns.DesignPatterns.Behavioural.ChainOfResponsibility
{
    public class ChainOfResponsibilityPattern
    {
        public ChainOfResponsibilityPattern()
        {
        }
    }

    public abstract class AbstractLogger
    {
        public static int INFO = 1;
        public static int DEBUG = 2;
        public static int ERROR = 3;

        // Level of severity, OR
        // Position in chain
        protected int level_;

        // Next element in chain or responsibility
        protected AbstractLogger nextLogger_;

        public void SetNextLogger(AbstractLogger nextLogger)
        {
            this.nextLogger_ = nextLogger;
        }

        public void LogMessage(int level, string message)
        {
            if (this.level_ <= level)
                Write(message);
            if (nextLogger_ != null)
                nextLogger_.LogMessage(level, message);
        }

        protected abstract void Write(string message);
    }

    //// CREATING CONCRETE CLASS EXTENDING THE LOGGER
    ////

    public class ConsoleLogger : AbstractLogger
    {
        public ConsoleLogger(int level)
        {
            this.level_ = level;
        }
        protected override void Write(string message)
        {
            Console.WriteLine("Standard Console::Logger: " + message);
        }
    }

    public class ErrorLogger : AbstractLogger
    {
        public ErrorLogger(int level)
        {
            this.level_ = level;
        }
        protected override void Write(string message)
        {
            Console.WriteLine("Error :: Logger :" + message);
        }
    }

    public class FileLogger : AbstractLogger
    {
        public FileLogger(int level)
        {
            this.level_ = level;
        }

        protected override void Write(string message)
        {
            Console.WriteLine("File::Logger: " + message);
        }
    }

    public class ChainPatternDemo
    {
        public static AbstractLogger GetChainOfLoggers()
        {
            AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
            AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
            AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

            // Forming chain
            errorLogger.SetNextLogger(fileLogger);
            fileLogger.SetNextLogger(consoleLogger);

            return errorLogger;
        }

        public static void DemoChainPattern()
        {
            AbstractLogger loggerChain = GetChainOfLoggers();

            loggerChain.LogMessage(AbstractLogger.INFO, "This is an information");
            loggerChain.LogMessage(AbstractLogger.DEBUG, "This is an debug level information");
            loggerChain.LogMessage(AbstractLogger.ERROR, "This is an error information");
        }
    }
}

