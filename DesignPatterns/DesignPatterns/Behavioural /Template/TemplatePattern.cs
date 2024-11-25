using System;
namespace DesignPatterns.DesignPatterns.Behavioural.Template
{
    /// <summary>
    /// Create an abstract class with a template method.
    /// </summary>
    public abstract class Game
    {
        public abstract void Initialize();
        public abstract void StartPlay();
        public abstract void EndPlay();

        //template method
        public void Play()
        {
            //initialize the game
            Initialize();

            //start game
            StartPlay();

            //end game
            EndPlay();
        }
    }

    public class Cricket : Game
    {
        public override void EndPlay()
        {
            Console.WriteLine("Cricet Game finished");
        }

        public override void Initialize()
        {
            Console.WriteLine("Cricket Game Initialized! Start playing.");
        }
        
        public override void StartPlay()
        {
            Console.WriteLine("Cricket Game Started. Enjoy the game!");
        }
    }

    public class Football : Game
    {
        public override void EndPlay()
        {
            Console.WriteLine("Football Game finished");
        }

        public override void Initialize()
        {
            Console.WriteLine("Football Game Initialized! Start playing.");
        }

        public override void StartPlay()
        {
            Console.WriteLine("Football Game Started. Enjoy the game!");
        }
    }

    public class TemplatePattern
    {
        public void TemplatePatternDemo()
        {
            Game game = new Cricket();
            game.Play();

            
            game = new Football();
            game.Play();
        }
    }

}

