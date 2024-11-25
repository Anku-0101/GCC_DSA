using System;
using System.Collections.Generic;

namespace DesignPatterns.DesignPatterns.Behavioural.Observer
{
    /// <summary>
    /// Creating Subject class
    /// </summary>
    public class Subject
    {
        private List<Observer> observers = new List<Observer>();
        private int state;

        public int GetState()
        {
            return state;
        }

        public void SetState(int State)
        {
            this.state = State;
            NotifyAllObservers();
        }

        public void Attach(Observer observer)
        {
            observers.Add(observer);
        }

        public void NotifyAllObservers()
        {
            foreach (Observer observer in observers)
                observer.Update();
        }
    }

    public abstract class Observer
    {
        protected Subject subject;
        public abstract void Update();
    }

    public class BinaryObserver : Observer
    {
        public BinaryObserver(Subject subject)
        {
            this.subject = subject;
            this.subject.Attach(this);
        }

        public override void Update()
        {
            Console.WriteLine("Binary String: " + Convert.ToString(subject.GetState(), 2));
        }
    }

    public class OctalObserver : Observer
    {
        public OctalObserver(Subject subject)
        {
            this.subject = subject;
            this.subject.Attach(this);
        }
        public override void Update()
        {
            Console.WriteLine("Octal string: " + Convert.ToString(subject.GetState(), 8));
        }
    }

    public class HexaObserver : Observer
    {
        public HexaObserver(Subject sub)
        {
            this.subject = sub;
            this.subject.Attach(this);
        }

        public override void Update()
        {
            Console.WriteLine("Hex string : " + subject.GetState().ToString("X"));
        }
    }

    public class ObserverPattern
    {
        public void ObserverPatternDemo()
        {
            Subject subject = new Subject();
            new HexaObserver(subject);
            new OctalObserver(subject);
            new BinaryObserver(subject);

            Console.WriteLine("First state change: 15");
            subject.SetState(15);
            Console.WriteLine("Second state change: 10");
            subject.SetState(10);
        }
    }
}

