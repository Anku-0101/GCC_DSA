using System;
namespace DesignPatterns.DesignPatterns.Singleton
{
    /// <summary>
    /// Sealed restricts inheritance 
    /// </summary>
    public sealed class SingletonClass
    {
        private static SingletonClass instance = null;

        private static int counter1 = 0;
        private int counter2 = 0;


        /// <summary>
        /// Private constructor ensures that object is not
        /// instantiated other than within the class itself 
        /// </summary>
        private SingletonClass()
        {
            counter1++;
            Console.WriteLine("Counter 1 = {0}", counter1);

            counter2++;
            Console.WriteLine("Counter 2 = {0}", counter2);

        }

        /// <summary>
        /// Here we can use public property as well ?? [Question to-do in class] 
        /// </summary>
        /// <returns></returns>
        public static SingletonClass GetInstance()
        {
            if (instance == null)
                return instance = new SingletonClass();
            else
                return instance;
        }

        public void  PrintDetails(string message)
        {
            Console.WriteLine("Message ::  " + message);
        }

        public static SingletonClass SingletonInstance
        {
            get
            {
                if (instance == null)
                    return instance = new SingletonClass();
                else
                    return instance;
            }
        
        }
    }
}

