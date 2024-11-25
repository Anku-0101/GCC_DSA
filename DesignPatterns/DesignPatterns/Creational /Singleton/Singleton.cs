using System;
namespace DesignPatterns.DesignPatterns.Singleton
{
    /*
    public class DerivedSingleton : Singleton
    {
        // SHOW THE ERROR WHILE TRYING TO EXTEND SINGLETON CLASS OUTSIDE OF SINGLETON CLASS
    }
    */
    

    /// <summary>
    /// Why to seal Singleton class??
    /// </summary>
    public class Singleton
    {
        private static Singleton instance = null;

        private static int counter1 = 0;
        private int counter2 = 0;


        /// <summary>
        /// Private constructor ensures that object is not
        /// instantiated other than within the class itself 
        /// </summary>
        private Singleton()
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
        public static Singleton GetInstance()
        {
            if (instance == null)
                return instance = new Singleton();
            else
                return instance;
        }

        public void PrintDetails(string message)
        {
            Console.WriteLine("Message ::  " + message);
        }

        /// <summary>
        /// NESTED class DerivedClass
        /// Ingeriting Singleton class
        /// </summary>
        public class DerivedClass : Singleton
        {
            
            
        }
    }
}

