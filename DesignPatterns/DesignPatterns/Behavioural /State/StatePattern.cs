using System;
namespace DesignPatterns.DesignPatterns.Behavioural.State
{
    /// <summary>
    /// State interface
    /// </summary>
    public interface State
    {
        public void DoAction(Context context);
    }

    public class StopState : State
    {
        public void DoAction(Context context)
        {
            Console.WriteLine("Player is in Stop state");
            context.SetState(this); // setting state to object which behaviour depends on state
        }

        public override string ToString()
        {
            return "Stop State";
        }
    }

    public class StartState : State
    {
        public void DoAction(Context context)
        {
            Console.WriteLine("Player is in start state");
            context.SetState(this);
        }

        public override string ToString()
        {
            return "Start State";
        }
    }
    public class Context
    {
        private State state;

        public Context()
        {
            state = null;
        }

        public void SetState(State state)
        {
            this.state = state;
        }

        public State GetState()
        {
            return state;
        }
    }

    public class StatePattern
    {
        public void StatePatternDemo()
        {
            Context context = new Context();

            StartState startState = new StartState();
            startState.DoAction(context);

            Console.WriteLine(context.GetState().ToString()); // state of object

            StopState stopState = new StopState();
            stopState.DoAction(context); 

            Console.WriteLine(context.GetState().ToString()); // state of object
        }
    }
}

