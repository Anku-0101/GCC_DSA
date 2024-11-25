using System;
namespace DesignPatterns.DesignPatterns.Behavioural.Mediator
{
    

    public class ChatRoom
    {
        public static void ShowMessage(User user, string message)
        {
            Console.WriteLine(DateTime.Now.ToString() + "[ " + user.GetName() + "] : " + message);
        }
    }

    public class User
    {
        private string name;

        public User(string Name)
        {
            this.name = Name;
        }

        public string GetName()
        {
            return name;
        }

        public void SetName(string Name)
        {
            this.name = Name;
        }

        public void SendMessage(string message)
        {
            ChatRoom.ShowMessage(this, message);
        }
    }

    public class MediatorPattern
    {
        public void DemoMediatorPattern()
        {
            User rajeev = new User("Rajeev");
            User siddharth = new User("Siddharth");

            rajeev.SendMessage("Hi Sid");

            siddharth.SendMessage("Hi Raj");
        }
    }
}

