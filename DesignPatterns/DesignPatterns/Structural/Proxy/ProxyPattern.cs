using System;
using System.Collections.Generic;

namespace DesignPatterns.DesignPatterns.Structural.Proxy
{
    public class ProxyPattern
    {
        public void Client()
        {
            Internet internet = new ProxyInternet();

            try
            {
                internet.ConnectTo("geeksforgeeks.com");
                internet.ConnectTo("abcd.com");
            }
            catch(Exception e)
            {
                Console.WriteLine(e.Message);
            }
        }
    }

    public interface Internet
    {
        public void ConnectTo(string serverHost);
    }

    public class RealInternet : Internet
    {
        public void ConnectTo(string serverHost)
        {
            Console.WriteLine("Connecting to " + serverHost);
        }
    }

    public class ProxyInternet : Internet
    {
        private Internet internet;
        private static List<string> bannedSites;

        static ProxyInternet()
        {
            bannedSites = new List<string>();

            bannedSites.Add("mnopq.com");
            bannedSites.Add("def.com");
            bannedSites.Add("abcd.com");
        }

        public void ConnectTo(string serverHost)
        {
            internet = new RealInternet();

            if (bannedSites.Contains(serverHost))
                throw new Exception("Access Denied");

            internet.ConnectTo(serverHost);
        }
    }
}

