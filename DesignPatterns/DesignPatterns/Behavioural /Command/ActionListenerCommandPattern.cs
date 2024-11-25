using System;
namespace DesignPatterns.DesignPatterns.Behavioural.Command
{
    public class ActionListenerCommandPattern
    {
        public ActionListenerCommandPattern()
        {
        }
    }

    /// <summary>
    /// Creating a ActionListernerCommand interface that will act as a Command.
    /// </summary>
    public interface IActionListenerCommand
    {
        public void Execute();
    }

    /// <summary>
    /// Creating a Document class that will act as a Receiver.
    /// </summary>
    public class Document
    {
        public void Open()
        {
            Console.WriteLine("Document Opened");
        }

        public void Save()
        {
            Console.WriteLine("Document Saved");
        }
    }

    /// <summary>
    /// Create a ActionOpen class that will act as an ConcreteCommand.
    /// </summary>
    public class ActionOpen : IActionListenerCommand
    {
        private Document doc;

        public ActionOpen(Document document)
        {
            this.doc = document;
        }
        public void Execute()
        {
            doc.Open();
        }
    }

    public class ActionSave : IActionListenerCommand
    {
        private Document doc;

        public ActionSave(Document document)
        {
            this.doc = document;
        }

        public void Execute()
        {
            doc.Save();
        }
    }

    /// <summary>
    /// Create a MenuOptions class that will act as an Invoker or broker.
    /// </summary>
    public class MenuListener
    {
        IActionListenerCommand openCommand;
        IActionListenerCommand saveCommand;

        public MenuListener(IActionListenerCommand OpenCommand, IActionListenerCommand SaveCommand)
        {
            this.openCommand = OpenCommand;
            this.saveCommand = SaveCommand;
        }

        public void OpenClick()
        {
            openCommand.Execute();
        }

        public void SaveClick()
        {
            openCommand.Execute();
        }
    }

    /// <summary>
    /// Create a CommanPatternClient class that will act as a Client.
    /// </summary>
    public class CommandPatternClient
    {

    }
}

