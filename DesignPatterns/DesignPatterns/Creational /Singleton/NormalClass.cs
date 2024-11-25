using System;
namespace DesignPatterns.DesignPatterns.Singleton
{
    public class NormalClass
    {
        private static int counter1 = 0;
        private int counter2 = 0;

        public NormalClass()
        {
            counter1++;
            Console.WriteLine("Counter1 = {0}", counter1);

            counter2++;
            Console.WriteLine("Counter2 = {0}", counter2);
        }

        public void PrintDetails(string message)
        {
            Console.WriteLine("Message :: " + message);
        }
    }
}

