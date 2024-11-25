using System;
namespace DesignPatterns.SolidPrinciples.DependencyInversionPrinciple.Followed
{
    public class DIP_Followed
    {
        public DIP_Followed()
        {
        }
    }

    public class BusinessLogicLayer
    {
        private readonly IRepositoryLayer DAL;

        public BusinessLogicLayer(IRepositoryLayer repositoryLayer)
        {
            DAL = repositoryLayer;
        }

        public void saveData(object details)
        {
            DAL.Save(details);
        }
    }

    public interface IRepositoryLayer
    {
        void Save(object details);
    }


    public class DataAccessLayer : IRepositoryLayer
    {
        public void Save(Object details)
        {
            //Permorms saving operation to database
        }
    }
}

