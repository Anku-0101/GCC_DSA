using System;
namespace DesignPatterns.SolidPrinciples.SingleResponsibilityPrinciple
{
    /// <summary>
    /// Class is heavily loaded
    /// There are plenty of reason for user class to be changed
    /// Loaded with multiple responsibility
    /// </summary>
    public class User
    {
        public bool Login(string userName, string passWord)
        {
            // Calling Login Serives to manage Login functionalities
            bool isLogin = LoginService.IsValidUser(userName, passWord);
            return isLogin;
        }

        public bool Register(string userName, string password, string emailAddress)
        {
            bool isRegistrationSuccess = LoginService.RegisterUser(userName, password, emailAddress);
            return isRegistrationSuccess;
        }

        public void LogError(string error)
        {
            LogService.LogError(error);
        }

        public void SendEmail(string email)
        {
            SenderService.SendEmail(email);
        }
    }


    /// <summary>
    /// Managing user entry and login 
    /// Follows SRP
    /// Responsible to perform only one job
    /// </summary>
    public class UserManagement
    {
        public bool Login(string userName, string passWord)
        {
            // Calling Login Serives to manage Login functionalities
            bool isLogin = LoginService.IsValidUser(userName, passWord);
            return isLogin;
        }

        public bool Register(string userName, string password, string emailAddress)
        {
            bool isRegistrationSuccess = LoginService.RegisterUser(userName, password, emailAddress);
            return isRegistrationSuccess;
        }
    }

    /// <summary>
    /// Deals with user log
    /// </summary>
    public class UserLogging
    {
        public void LogError(string error)
        {
            LogService.LogError(error);
        }
    }

    /// <summary>
    /// Deals with user communication 
    /// </summary>
    public class UserCommunication
    {
        public void SendEmail(string email)
        {
            SenderService.SendEmail(email);
        }
    }
}

