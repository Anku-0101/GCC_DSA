using System;
namespace DesignPatterns.SolidPrinciples.DependencyInversionPrinciple
{
    public class DIP_Unfollowed
    {
        public DIP_Unfollowed()
        {
        }
    }

    public class BusinessLogicLayer
    {
        private readonly DataAccessLayer DAL;

        public BusinessLogicLayer()
        {
            DAL = new DataAccessLayer();
        }

        public void saveData(object details)
        {
            DAL.Save(details);
        }
    }

    public class DataAccessLayer
    {
        public void Save(Object details)
        {
            //Permorms saving operation to database
        }
    }
}

