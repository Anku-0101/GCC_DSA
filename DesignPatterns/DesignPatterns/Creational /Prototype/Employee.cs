using System;
using System.Net;
using System.Text;
using System.Xml.Linq;

namespace DesignPatterns.DesignPatterns.Prototype
{
    public class Employee
    {
        public string ID { get; set; }
        public string Name { get; set; }
        public Address EmpAddress { get; set; }

        #region Copy Methods
        public Employee ShallowCopy()
        {
            return (Employee)this.MemberwiseClone();
        }

        public Employee DeepCopy()
        {
            Employee other = (Employee)this.MemberwiseClone();

            other.EmpAddress = new Address(this.EmpAddress.DoorNumber,
                this.EmpAddress.StreetNumber, this.EmpAddress.Zipcode,
                this.EmpAddress.Country);

            return other;
        }

        public override string ToString()
        {
            return string.Format("Emp ID :{0}, Emp Name : {1}, {2}",
                this.ID, this.Name, this.EmpAddress.ToString());
        }

        #endregion
    }

    public class Address
    {

        public int DoorNumber { get; set; }
        public int StreetNumber { get; set; }
        public int Zipcode { get; set; }
        public string Country { get; set; }

        public Address() { }

        public Address(int doorNumber, int streetNumber,
            int zipCode, string country)
        {
            this.Country = country;
            this.DoorNumber = doorNumber;
            this.StreetNumber = streetNumber;
            this.Zipcode = zipCode;
        }

        public override string ToString()
        {
            return string.Format("\nEmp Address: {0}",
                string.Format("{0}, {1}, {2}, {3}",
                this.DoorNumber, this.StreetNumber,
                this.Zipcode.ToString(), this.Country));
        }
    }

    public class PrototypeDemo
    {
        Employee emp = new Employee() { EmpAddress = new Address() };
        Employee empCopied;

        public void DemoCopy()
        {
            Console.WriteLine("Shallow Copy");
            Emp1Details();
            ShallowCopy();
            Refresh();
            Console.WriteLine("Updating employee1 to employee2");
            Emp2Details();
            Refresh();

            Console.WriteLine("Deep Copy");
            Emp1Details();
            DeepCopy();
            Refresh();
            Console.WriteLine("Updating employee1 to employee2");
            Emp2Details();
            Refresh();
        }

        private void Emp1Details()
        {
            emp.ID = "123";
            emp.Name = "Ramesh";
            emp.EmpAddress.Country = "USA";
            emp.EmpAddress.DoorNumber = 234;
            emp.EmpAddress.StreetNumber = 6;
            emp.EmpAddress.Zipcode = 8753;
        }
        private void Emp2Details()
        {
            emp.ID = "910";
            emp.Name = "Kathy";
            emp.EmpAddress.Country = "Germany";
            emp.EmpAddress.DoorNumber = 873;
            emp.EmpAddress.StreetNumber = 16;
            emp.EmpAddress.Zipcode = 10034;
        }

        private void ShallowCopy()
        {
            empCopied = (Employee)this.emp.ShallowCopy();
        }

        private void DeepCopy()
        {
            empCopied = (Employee)this.emp.DeepCopy();
        }

        private void Refresh()
        {
            StringBuilder sb = new StringBuilder();
            //sb.Clear();
            sb.AppendLine("---------------------------------");
            sb.AppendLine(string.Format("Main Employee : {0} ",
                this.emp.ToString()));
            sb.AppendLine();
            sb.AppendLine(string.Format("Copied Employee : {0} ",
                empCopied.ToString()));
            sb.AppendLine("-----------------------------------");

            Console.WriteLine(sb);
        }
    }
}

