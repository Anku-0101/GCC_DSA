using System;
namespace DesignPatterns.DesignPatterns.Creational.Factory
{

    public interface Bank
    {
        string GetBankName();
    }

    public class HDFC : Bank
    {
        private string bankName;

        public HDFC()
        {
            this.bankName = "HDFC Bank";
        }

        public string GetBankName()
        {
            return bankName;
        }
    }

    public class ICICI : Bank
    {
        private string bankName;

        public ICICI()
        {
            this.bankName = "ICICI Bank";
        }

        public string GetBankName()
        {
            return bankName;
        }
    }

    public class SBI : Bank
    {
        private string bankName;

        public SBI()
        {
            this.bankName = "SBI Bank";
        }

        public string GetBankName()
        {
            return bankName;
        }
    }

    public abstract class Loan
    {
        protected double interestRate;

        public abstract void GetInterestRate(double rate);

        public void CalculateLoanPayment(double loanamount, int years)
        {
            /* 
             to calculate the monthly loan payment i.e. EMI   

             rate=annual interest rate/12*100; 
             n=number of monthly installments;            
             1year=12 months. 
             so, n=years*12; 

           */

            double EMI;
            int n;

            n = years * 12;
            interestRate = interestRate / 1200;
            EMI = ((interestRate * Math.Pow((1 + interestRate), n)) / ((Math.Pow((1 + interestRate), n)) - 1)) * loanamount;

            Console.WriteLine("your monthly EMI is " + EMI + " for the amount " + loanamount + " you have borrowed");
        }
    }

    public class HomeLoan : Loan
    {
        public override void GetInterestRate(double rate)
        {
            this.interestRate = rate;
        }
    }

    public class BusinessLoan : Loan
    {
        public override void GetInterestRate(double rate)
        {
            this.interestRate = rate;
        }
    }

    public class EducationLoan : Loan
    {
        public override void GetInterestRate(double rate)
        {
            this.interestRate = rate;
        }
    }

    public abstract class AbstractFactory
    {
        public abstract Bank GetBank(String bank);
        public abstract Loan GetLoan(String loan);
    }

    public class BankFactory : AbstractFactory
    {
       public override Bank GetBank(String bank)
       {
            if (bank == null)
            {
                return null;
            }
            if (bank.ToUpper() == ("HDFC"))
            {
                return new HDFC();
            }
            else if (bank.ToUpper() == ("ICICI"))
            {
                return new ICICI();
            }
            else if (bank.ToUpper() == ("SBI"))
            {
                return new SBI();
            }
            return null;
       }

       public override Loan GetLoan(String loan)
       {
            return null;
       }
    }

    public class LoanFactory : AbstractFactory
    {
        public override Bank GetBank(String bank)
        {
            return null;
        }

        public override Loan GetLoan(String loan)
        {
            if (loan == null)
            {
                return null;
            }
            if (loan.ToLower() == ("home"))
            {
                return new HomeLoan();
            }
            else if (loan.ToLower() == ("business"))
            {
                return new BusinessLoan();
            }
            else if (loan.ToLower() == ("education"))
            {
                return new EducationLoan();
            }
            return null;
        }
    }

    public class FactoryCreator
    {
        public static AbstractFactory GetFactory(string factoryType)
        {
            if (factoryType.ToLower() == "bank")
                return new BankFactory();
            else if (factoryType.ToLower() == "loan")
                return new LoanFactory();
            else
                return null;
                
        }
    }
}

