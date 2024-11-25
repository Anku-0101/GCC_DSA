using System;
using System.Collections.Generic;

namespace DesignPatterns.DesignPatterns.Structural.Flyweight
{
    public class FlyWeightPattern
    {
        public FlyWeightPattern()
        {
        }
    }

    public interface IEmployeeIT
    {
        void AssignSkills(string skill);
        void Task();
    }

    public class Developer : IEmployeeIT
    {
        private string job;
        private string skill;

        public Developer()
        {
            this.job = "Fix the issue";
        }

        public void AssignSkills(string skill_)
        {
            this.skill = skill_;
        }

        public void Task()
        {
            Console.WriteLine("Developer with Skill: " + this.skill + " with Job : " + job);
        }
    }

    public class Tester : IEmployeeIT
    {
        private string job;
        private string skill;

        public Tester()
        {
            this.job = "Test for issue";
        }

        public void AssignSkills(string skill_)
        {
            this.skill = skill_;
        }

        public void Task()
        {
            Console.WriteLine("Tester with Skill: " + this.skill + " with Job : " + job);
        }
    }

    public class EmployeeFactory
    {
        private static Dictionary<string, IEmployeeIT> map = new Dictionary<string, IEmployeeIT>();

        public static IEmployeeIT GetEmployee(string type)
        {
            IEmployeeIT emp = null;

            if (map.ContainsKey(type))
            {
                emp = map[type];
            }
            else
            {
                switch (type)
                {
                    case "Developer":
                        Console.WriteLine("Developer Created");
                        emp = new Developer();
                        break;
                    case "Tester":
                        Console.WriteLine("Tester Created");
                        emp = new Tester();
                        break;
                    default:
                        Console.WriteLine("No such employee");
                        break;
                }
                map.Add(type, emp);
            }
            return emp;
        }
    }

    public class Engineering
    {
        private static string[] employeeType = { "Developer", "Tester" };
        private static string[] skills = { "Java", "C++", ".NET", "Python" };

        public static void TestFlyWeightImplementation()
        {
            for(int i = 0; i < 10; i++)
            {
                IEmployeeIT employee = EmployeeFactory.GetEmployee(GetRandomEmployee());
                employee.AssignSkills(GetRandomSkills());

                employee.Task();
            }
            
        } 

        public static string GetRandomEmployee()
        {
            Random r = new Random();
            int randInt = r.Next(employeeType.Length);

            return employeeType[randInt];
        }

        public static string GetRandomSkills()
        {
            Random r = new Random();
            int randInt = r.Next(skills.Length);

            return skills[randInt];
        }

    }
}

