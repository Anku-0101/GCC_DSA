using System;
using System.Collections.Generic;

namespace DesignPatterns.DesignPatterns.Behavioural.Memento
{
    /// <summary>
    /// Create Memento class
    /// </summary>
    public class Memento
    {
        private string state;

        public Memento(string State)
        {
            this.state = State;
        }

        public string GetState()
        {
            return state;
        }
    }

    /// <summary>
    /// Creating Originator class
    /// </summary>
    public class Originator
    {
        private string state;

        public void SetState(string State)
        {
            this.state = State;
        }

        public string GetState()
        {
            return state;
        }

        public Memento SaveStateToMemento()
        {
            return new Memento(state);
        }

        public void GetStateFromMemento(Memento memento)
        {
            this.state = memento.GetState();
        }
    }

    /// <summary>
    /// Creating CareTaker class
    /// </summary>
    public class CareTaker
    {
        private List<Memento> mementoList = new List<Memento>();

        public void Add(Memento state)
        {
            mementoList.Add(state);
        }

        public Memento Get(int index)
        {
            return mementoList[index];
        }
    }

    public class MementoPattern
    {
        public void MementoPatternDemo()
        {
            Originator originator = new Originator();
            CareTaker careTaker = new CareTaker();

            originator.SetState("State #1");
            originator.SetState("State #2");
            careTaker.Add(originator.SaveStateToMemento());

            originator.SetState("State #3");
            careTaker.Add(originator.SaveStateToMemento());

            originator.SetState("State #4");
            Console.WriteLine("Current State: " + originator.GetState());

            originator.GetStateFromMemento(careTaker.Get(0));
            Console.WriteLine("First saved State: " + originator.GetState());
            originator.GetStateFromMemento(careTaker.Get(1));
            Console.WriteLine("Second saved State: " + originator.GetState());
        }
    }

}

