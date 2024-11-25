using System;
using System.Collections.Generic;

namespace DesignPatterns.DesignPatterns.Structural.Composite
{
    /// <summary>
    /// This is an employee interface i.e Component 
    /// </summary>
    public interface IEmployee
    {
        int GetID();
        string GetName();
        double GetSalary();
        void Print();
        void Add(IEmployee employee);
        void Remove(IEmployee employee);
        IEmployee GetChild(int i);
    }

    /// <summary>
    /// This is BankManager class i.e Composite
    /// </summary>
    public class BankManager : IEmployee
    {
        private int id;
        private string name;
        private double salary;

        public BankManager(int id, string name, double salary)
        {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        List<IEmployee> employees = new List<IEmployee>();

        public void Add(IEmployee employee)
        {
            employees.Add(employee);
        }

        public IEmployee GetChild(int i)
        {
            return employees[i];
        }

        public int GetID()
        {
            return id;
        }

        public string GetName()
        {
            return name;
        }

        public double GetSalary()
        {
            return salary;
        }

        public void Print()
        {
            Console.WriteLine("========");
            Console.WriteLine("ID = " + GetID());
            Console.WriteLine("Name = " + GetName());
            Console.WriteLine("Salary = " + GetSalary());
            Console.WriteLine("========");

            foreach (IEmployee employee in employees)
                employee.Print();
        }

        public void Remove(IEmployee employee)
        {
            employees.Remove(employee);
        }
    }

    /// <summary>
    /// Cashier class will be a leaf and it will implement to the IEmployee interface.
    /// </summary>
    public class Cashier : IEmployee
    {
        private int id;
        private String name;
        private double salary;

        public Cashier(int id, String name, double salary)
        {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        List<IEmployee> employees = new List<IEmployee>();

        /// <summary>
        /// this is leaf node so this method is not applicable to this class.  
        /// </summary>
        /// <param name="employee"></param>
        /// <exception cref="NotImplementedException"></exception>
        public void Add(IEmployee employee)
        {
            employees.Add(employee);
        }

        public IEmployee GetChild(int i)
        {
            return null;
        }

        public int GetID()
        {
            return id;
        }

        public string GetName()
        {
            return name;
        }

        public double GetSalary()
        {
            return salary;
        }

        public void Print()
        {
            Console.WriteLine("========");
            Console.WriteLine("ID = " + GetID());
            Console.WriteLine("Name = " + GetName());
            Console.WriteLine("Salary = " + GetSalary());
            Console.WriteLine("========");
        }

        /// <summary>
        /// this is leaf node so this method is not applicable to this class.  
        /// </summary>
        /// <param name="employee"></param>
        /// <exception cref="NotImplementedException"></exception>
        public void Remove(IEmployee employee)
        {
            employees.Remove(employee);
        }
    }

    /// <summary>
    /// Accountant class acts as Composite class
    /// </summary>
    public class Accountant : IEmployee
    {
        private int id;
        private String name;
        private double salary;
        public Accountant(int id, String name, double salary)
        {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        List<IEmployee> employees = new List<IEmployee>();

        public void Add(IEmployee employee)
        {
            employees.Add(employee);
        }

        public IEmployee GetChild(int i)
        {
            return employees[i];
        }

        public int GetID()
        {
            return id;
        }

        public string GetName()
        {
            return name;
        }

        public double GetSalary()
        {
            return salary;
        }

        public void Print()
        {
            Console.WriteLine("========");
            Console.WriteLine("ID = " + GetID());
            Console.WriteLine("Name = " + GetName());
            Console.WriteLine("Salary = " + GetSalary());
            Console.WriteLine("========");

            foreach (IEmployee employee in employees)
                employee.Print();
        }

        public void Remove(IEmployee employee)
        {
            employees.Remove(employee);
        }
    }

    /// <summary>
    /// AssistantAccountant class acts as a leaf node
    /// </summary>
    public class AssistantAccountant : IEmployee
    {
        private int id;
        private String name;
        private double salary;

        public AssistantAccountant(int id, String name, double salary)
        {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        List<IEmployee> employees = new List<IEmployee>();

        /// <summary>
        /// this is leaf node so this method is not applicable to this class.  
        /// </summary>
        /// <param name="employee"></param>
        public void Add(IEmployee employee)
        {
            employees.Add(employee);
        }

        public IEmployee GetChild(int i)
        {
            return null;
        }

        public int GetID()
        {
            return id;
        }

        public string GetName()
        {
            return name;
        }

        public double GetSalary()
        {
            return salary;
        }

        public void Print()
        {
            Console.WriteLine("========");
            Console.WriteLine("ID = " + GetID());
            Console.WriteLine("Name = " + GetName());
            Console.WriteLine("Salary = " + GetSalary());
            Console.WriteLine("========");

        }

        /// <summary>
        /// this is leaf node so this method is not applicable to this class.  
        /// </summary>
        /// <param name="employee"></param>
        /// <exception cref="NotImplementedException"></exception>
        public void Remove(IEmployee employee)
        {
            employees.Remove(employee);
        }
    }

    public class CompositePatternDemo
    {
        public void
            Demo()
        {
            IEmployee emp1 = new Cashier(102, "Mohan Kumar", 293001);
            IEmployee emp2 = new Cashier(104, "Rohan Adani", 882913);
            IEmployee accountant = new Accountant(403, "Dinesh", 788414);
            IEmployee emp3 = new AssistantAccountant(307, "Kartik", 98841);
            IEmployee manager1 = new BankManager(504, "Shaloni", 9348513);

            accountant.Add(emp3);
            Console.WriteLine("Accountant Tree");
            accountant.Print();

            
            manager1.Add(accountant);
            manager1.Add(emp1);
            manager1.Add(emp2);
            Console.WriteLine("Manager Tree");
            manager1.Print();
        }
    }
}

