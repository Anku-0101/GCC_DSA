using System;
namespace DesignPatterns.SolidPrinciples.LiskovSubstitutionPrinciple
{
    public class Liskov
    {
        public void ApplicationLayer()
        {
            //List<Employee> employees = new List<Employee>();
            //Employee contractEmp = new ContractEmployee(21, "Mike");
            //contractEmp.CalculateBonus(50000);
        }
        
        

    }

    /// <summary>
    /// LISKOV substitution principle violated
    /// Sub class can't replace base class i.e Employee
    /// Sub class will throw exception 
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

        public TemporaryEmployee(int id, string name) : base(id, name)
        {

        }
        public override double CalculateBonus(double salary)
        {
            return salary * 0.1;
        }
    }

    public class ContractEmployee : Employee
    {
        public ContractEmployee()
        {

        }

        public ContractEmployee(int id, string name) : base(id, name)
        {

        }

        public override double CalculateBonus(double salary)
        {
            throw new NotImplementedException();
        }
    }

}

////// Following Liskov substitution Principle 
namespace DesignPatterns.SolidPrinciples.LiskovSubstitutionPrinciple.Followed
{
    public interface IEmployeeBonus
    {
        double CalculateBonus(double salary);
    }

    public interface IEmployee
    {
        int ID { get; set; }
        string Name { get; set; }
        double GetMinimumSalary();
    }

    public abstract class Employee : IEmployee, IEmployeeBonus
    {
        public int ID { get; set; }
        public string Name { get; set; }

        public Employee()
        {

        }

        public Employee(int Id, string name)
        {
            this.ID = Id;
            this.Name = name;
        }

        public abstract double CalculateBonus(double salary);
        public abstract double GetMinimumSalary();
        
    }

    public class PermanentEmployee : Employee
    {
        public override double CalculateBonus(double salary)
        {
            return salary * 0.2;
        }

        public override double GetMinimumSalary()
        {
            return 50000;
        }
    }

    public class TemproryEmployee : Employee
    {
        public override double CalculateBonus(double salary)
        {
            return salary * 0.1;
        }

        public override double GetMinimumSalary()
        {
            return 35000;
        }
    }

    public class ContractEmployee : IEmployee
    {
        public int ID { get; set; }
        public string Name { get; set; }

        public double GetMinimumSalary()
        {
            return 10000;
        }
    }
}


