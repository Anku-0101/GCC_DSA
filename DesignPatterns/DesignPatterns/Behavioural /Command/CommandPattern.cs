using System;
using System.Collections.Generic;

namespace DesignPatterns.DesignPatterns.Behavioural.Command
{
    /// <summary>
    /// Creating a command Interface 
    /// </summary>
    public interface IOrder
    {
        void Execute();
    }

    /// <summary>
    /// Creating a request class
    /// </summary>
    public class Stock
    {
        private string name;
        private int quantity;

        public Stock(string Name, int Quantity)
        {
            this.name = Name;
            this.quantity = Quantity;
        }

        public void Buy()
        { 
            Console.WriteLine("Stock [ Name : " + name + ", Quantity  initial : " + quantity + " ] + 1 bought");
            this.quantity += 1;
        }

        public void Sell()
        {
            if(this.quantity < 1)
                Console.WriteLine("Number of stocks is less than order placed, can't sell");
            else
            {
                Console.WriteLine("Stock [ Name : " + name + ", Quantity initial : " + quantity + " ] 1 Sold");
                this.quantity -= 1;

            }
        }
    }

    /// <summary>
    /// Create concrete classes implementing the Order interface.
    /// </summary>
    public class BuyStock : IOrder
    {
        private Stock stockType;

        public BuyStock(Stock stock)
        {
            this.stockType = stock;
        }
        public void Execute()
        {
            stockType.Buy();
        }
    }

    public class SellStock : IOrder
    {
        private Stock stockType;

        public SellStock(Stock stock)
        {
            this.stockType = stock;
        }

        public void Execute()
        {
            stockType.Sell();
        }
    }

    /// <summary>
    /// Create command invoker class.
    /// </summary>
    public class Broker
    {
        private List<IOrder> orderList; // Command List

        public Broker()
        {
            orderList = new List<IOrder>();
        }

        public void TakeOrder(IOrder order)
        {
            orderList.Add(order); // Receiveing commands 
        }

        public void PlaceOrders()
        {
            foreach (IOrder order in orderList)
            {
                order.Execute();
            }

            orderList.Clear();

        }
    }

    public class CommandPattern
    {
        public void CommandPatternDemo()
        {
            Stock mahindra = new Stock("Mahindra", 10034);

            BuyStock buyStock = new BuyStock(mahindra);
            SellStock sellStock = new SellStock(mahindra);


            Broker broker = new Broker();
            broker.TakeOrder(buyStock);
            broker.TakeOrder(sellStock);
            broker.TakeOrder(sellStock);
            broker.TakeOrder(sellStock);
            broker.TakeOrder(sellStock);
            broker.TakeOrder(sellStock);
            broker.TakeOrder(sellStock);
            broker.TakeOrder(buyStock);

            broker.PlaceOrders();

        }
    }


}

