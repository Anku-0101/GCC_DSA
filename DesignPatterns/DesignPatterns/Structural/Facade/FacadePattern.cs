using System;
namespace DesignPatterns.DesignPatterns.Structural.Facade
{
    public interface IMobileShop
    {
        string ModelNumber();
        int Price();
    }

    public class IPhone : IMobileShop
    {
        public string ModelNumber()
        {
            return "IPhone";
        }

        public int Price()
        {
            return 70000;
        }
    }

    public class Samsung : IMobileShop
    {
        public string ModelNumber()
        {
            return "Samsung Galaxy S20";
        }

        public int Price()
        {
            return 55000;
        }
    }

    public class BlackBerry : IMobileShop
    {
        public string ModelNumber()
        {
            return "Blackberry Z10";
        }

        public int Price()
        {
            return 45000;
        }
    }

    public class ShopKeeper
    {
        private IMobileShop mobiles;

        public void IPhoneSale()
        {
            mobiles = new IPhone();
            Console.WriteLine("Model = {0} ", mobiles.ModelNumber());
            Console.WriteLine("Price = {0}", mobiles.Price());
        }

        public void SamsungSale()
        {
            mobiles = new Samsung();
            Console.WriteLine("Model = {0} ", mobiles.ModelNumber());
            Console.WriteLine("Price = {0}", mobiles.Price());
        }

        public void BlackBerrySale()
        {
            mobiles = new BlackBerry();
            Console.WriteLine("Model = {0} ", mobiles.ModelNumber());
            Console.WriteLine("Price = {0}", mobiles.Price());
        }
    }

    public class FacadePattern
    {
        public void Demo()
        {
            while (true)
            {
                Console.WriteLine("=========== Mobile Shop ==============\n");
                Console.WriteLine("             1.IPhone                  \n");
                Console.WriteLine("             2.Samsung                 \n");
                Console.WriteLine("             3. BlackBerry             \n");
                Console.WriteLine("             4. Exit                    \n");

                Console.WriteLine("Enter your choice");
                int choice = Convert.ToInt32(Console.ReadLine());

                ShopKeeper sk = new ShopKeeper();

                switch (choice)
                {
                    case 1:
                        {
                            sk.IPhoneSale();
                        }
                        break;

                    case 2:
                        {
                            sk.SamsungSale();
                        }
                        break;

                    case 3:
                        {
                            sk.BlackBerrySale();
                        }
                        break;
                    default:
                        {
                            Console.WriteLine("Enter a phone to purchase");
                            return;
                        }
                }
            }
            
        }
    }
}

