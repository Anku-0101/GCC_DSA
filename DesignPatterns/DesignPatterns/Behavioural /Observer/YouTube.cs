using System;
using System.Collections.Generic;

namespace DesignPatterns.DesignPatterns.Behavioural.Observer.YouTube
{
    public interface Subject
    {
        void Subscribe(Subscriber sub);
        void UnSubscriber(Subscriber sub);
        void NotifySubscribers();
        void Upload(string title);
    }

    public interface Observer
    {
        void Update();
        void SubscribeChannel(Channel ch);
    }

    public class Subscriber : Observer
    {
        private string name;
        private Channel channel;

        public Subscriber(string Name)
        {
            this.name = Name;
        }

        public void SubscribeChannel(Channel ch)
        {
            channel = ch;
        }

        public void Update()
        {
            string message = "Hey " + name + " Video " + channel.title + " Uploaded";
            Console.WriteLine(message);
        }
    }


    public class Channel : Subject
    {
        private List<Subscriber> subs = new List<Subscriber>();
        public string title;


        public void NotifySubscribers()
        {
            foreach (Subscriber sub in subs)
                sub.Update();
        }

        public void Subscribe(Subscriber sub)
        {
            if(subs.Contains(sub) == false)
                subs.Add(sub);
        }

        public void UnSubscriber(Subscriber sub)
        {
            if(subs.Contains(sub))
                subs.Remove(sub);
        }

        public void Upload(string Title)
        {
            this.title = Title;
            NotifySubscribers();
        }
    }

    public class YouTube
    {
        public void DemoSubscriberNotification()
        {
            Channel T_Series = new Channel();

            Subscriber s1 = new Subscriber("Aman");
            Subscriber s2 = new Subscriber("Mahesh");
            Subscriber s3 = new Subscriber("Nisha");
            Subscriber s4 = new Subscriber("Shaqib");
            Subscriber s5 = new Subscriber("Sid");

            T_Series.Subscribe(s1);
            T_Series.Subscribe(s2);
            T_Series.Subscribe(s3);
            T_Series.Subscribe(s4);
            T_Series.Subscribe(s5);
            T_Series.UnSubscriber(s1);

            
            s1.SubscribeChannel(T_Series);
            s2.SubscribeChannel(T_Series);
            s3.SubscribeChannel(T_Series);
            s4.SubscribeChannel(T_Series);
            s5.SubscribeChannel(T_Series);
            
            T_Series.Upload(" vande mataram ");


        }
    }
}

