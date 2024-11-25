using System;
namespace DesignPatterns.DesignPatterns.Singleton
{
    /// <summary>
    /// Making a singleton class which is thread safe 
    /// </summary>
    public sealed class SingletonThreadSafety
    {

        private static SingletonThreadSafety instance = null;
        private static readonly object obj = new object(); // TBD

        private static int counter1 = 0;
        private int counter2 = 0;


        /// <summary>
        /// Private constructor ensures that object is not
        /// instantiated other than within the class itself 
        /// </summary>
        private SingletonThreadSafety()
        {
            counter1++;
            Console.WriteLine("Counter 1 = {0}", counter1);

            counter2++;
            Console.WriteLine("Counter 2 = {0}", counter2);

        }

        /// <summary>
        /// Without-Lock , NOT GOING TO work in case of multithreaded application
        /// </summary>
        /// <returns></returns>

        /*
        public static SingletonThreadSafety GetInstance()
        {
            if (instance == null)
            {
                return instance = new SingletonThreadSafety();
            }
            return instance;
        }
        
        */

        
        public static SingletonThreadSafety GetInstance()
        {
            if(instance == null)
            {
                // Another thread should wait out 
                lock (obj)
                {
                    if (instance == null)
                        return instance = new SingletonThreadSafety();
                }
            }
            return instance;
            
        }
        

        public void PrintDetails(string message)
        {
            Console.WriteLine("Message ::  " + message);
        }
    }
}

