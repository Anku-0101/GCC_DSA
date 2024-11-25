using System;
namespace DesignPatterns.SolidPrinciples.InterfaceSegregationPrinciple
{
   /// <summary>
   /// Overloaded interface, a single client might not be concerned about all these functionality 
   /// </summary>
    public interface IUser
    {
        bool Login(string uName, string password);
        bool Register(string uName, string password, string emailId);
        void LogError(string error);
        void SendEmail(string message);
    }

    public interface IUserManager
    {
        bool Login(string uName, string password);
        bool Register(string uName, string password, string emailId);
    }

    public interface ILogger
    {
        void LogError(string error);
    }

    public interface ICommunication
    {
        void SendEmail(string message);
    }

    ///////////////////////////////
    ///////////////////////////////
    //////////////////////////////
    /// Q find out if the below interface needs to be segreegated and if so do segreegate it

    public interface IPrinter
    {
        void PrintColorCopies();
        void PrintGreyScaleCopies();
        string ScanDocument();
        void FaxFile(string file);
        void SaveFax();
        void PrintDuplex();
    }

}

