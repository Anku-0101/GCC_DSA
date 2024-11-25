using System;
namespace DesignPatterns.SolidPrinciples.OpenClosedPrinciple
{
    /// <summary>
    /// Violates SRP
    /// doesn't follow OCP 
    /// </summary>
    public class Employee
    {
        public int ID;
        public string Name;
        public string EmployeeType;
        
        public Employee(int id, string name, string empType)
        {
            this.ID = id;
            this.Name = name;
            this.EmployeeType = empType;
        }

        public decimal CalculateBonus(decimal salary)
        {
            if (this.EmployeeType == "Permanent")
                return salary * 0.2M;
            else
                return salary * 0.1M;
        }

        public override string ToString()
        {
            return String.Format("ID : {0} Name : {1}", ID, Name);
        }
    }

    public class Application_Class
    {
        public void GetEmployeeBonus()
        {
            Employee empJohn = new Employee(1, "John", "Permanent");
            Employee empClara = new Employee(1, "Clara", "Temporary");

            Console.WriteLine(empJohn.ToString() + " Bonus = " + empJohn.CalculateBonus(90000));
            Console.WriteLine(empClara.ToString() + " Bonus = " + empClara.CalculateBonus(100000));
        }
    }
}


namespace DesignPatterns.SolidPrinciples.OpenClosedPrinciple.OCP_Followed
{
    /// <summary>
    /// This class is open for extension and close for modification 
    /// </summary>
    public abstract class Employee
    {

        public int ID;
        public string Name;
       
        public Employee()
        {

        }

        public Employee(int id, string name)
        {
            this.ID = id;
            this.Name = name;
        }

        public abstract double CalculateBonus(double salary);

        public override string ToString()
        {
            return String.Format("ID : {0} Name : {1}", ID, Name);
        }
    }

    public class PermanentEmployee : Employee
    {
        public PermanentEmployee()
        {

        }

        public PermanentEmployee(int id, string name) : base(id, name)
        {

        }
        public override double CalculateBonus(double salary)
        {
            return salary * 0.2;
        }
    }

    public class TemporaryEmployee : Employee
    {
        public TemporaryEmployee()
        {

        }

        public TemporaryEmployee(int id, string name):base(id, name)
        {

        }
        public override double CalculateBonus(double salary)
        {
            return salary * 0.1;
        }
    }

    public class Application_Class
    {
        public void GetEmployeeBonus()
        {
            Employee empJohn = new PermanentEmployee(1, "John");
            Employee empClara = new TemporaryEmployee(1, "Clara");

            Console.WriteLine(empJohn.ToString() + " Bonus = " + empJohn.CalculateBonus(90000));
            Console.WriteLine(empClara.ToString() + " Bonus = " + empClara.CalculateBonus(100000));
        }
    }
}

