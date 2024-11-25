using System;
namespace DesignPatterns.SolidPrinciples.SingleResponsibilityPrinciple
{
    public class LoginService
    {
        internal static bool IsValidUser(string uName, string password)
        {
            // Connects to DB and checks for entry
            // process and compute is valid login
            return true; // OR false
        }

        internal static bool RegisterUser(string userName, string password, string emailAddress)
        {
            // Some registration logic
            throw new NotImplementedException();
        }
    }
}

