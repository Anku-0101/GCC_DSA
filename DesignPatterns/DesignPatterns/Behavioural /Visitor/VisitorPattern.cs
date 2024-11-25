using System;
using System.Reflection;
using System.Threading;

namespace DesignPatterns.DesignPatterns.Behavioural.Visitor
{
    /// <summary>
    /// Define an interface to represent element.
    /// 
    /// </summary>
    public interface ComputerPart
    {
        public void Accept(ComputerPartVisitor computerPartVisitor);
    }

    public class Keyboard : ComputerPart
    {
        public void Accept(ComputerPartVisitor computerPartVisitor)
        {
            computerPartVisitor.visit(this);
        }
    }

    public class Monitor : ComputerPart
    {
        public void Accept(ComputerPartVisitor computerPartVisitor)
        {
            computerPartVisitor.visit(this);
        }
    }

    public class Mouse : ComputerPart
    {
        public void Accept(ComputerPartVisitor computerPartVisitor)
        {
            computerPartVisitor.visit(this);
        }
    }

    public class Computer : ComputerPart
    {
        ComputerPart[] parts;

        public Computer()
        {
            parts = new ComputerPart[] { new Mouse(), new Keyboard(), new Monitor() };
        }
        public void Accept(ComputerPartVisitor computerPartVisitor)
        {
            for (int i = 0; i < parts.Length; i++)
                parts[i].Accept(computerPartVisitor);

            computerPartVisitor.visit(this);
        }
    }
    /// <summary>
    /// Define an interface to represent visitor.
    /// </summary>
    public interface ComputerPartVisitor
    {
        public void visit(Computer computer);
        public void visit(Mouse mouse);
        public void visit(Keyboard keyboard);
        public void visit(Monitor monitor);
    }

    public class ComputerPartDisplayVisitor : ComputerPartVisitor
    {
        public void visit(Computer computer)
        {
            Console.WriteLine("Displaying Computer ");
        }

        public void visit(Mouse mouse)
        {
            Console.WriteLine("Displaying Mouse ");
        }

        public void visit(Keyboard keyboard)
        {
            Console.WriteLine("Displaying Keyboard ");
        }

        public void visit(Monitor monitor)
        {
            Console.WriteLine("Displaying Monitor. ");
        }
    }

    public class VisitorPattern
    {
        public void VisitorPatternDemo()
        {
            ComputerPart computer = new Computer();
            computer.Accept(new ComputerPartDisplayVisitor());
        }
    }
}

