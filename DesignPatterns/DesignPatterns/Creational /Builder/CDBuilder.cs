using System;
using System.Collections.Generic;

namespace DesignPatterns.DesignPatterns.Creational.Builder
{

    public interface Packing
    {
        string Name();
        int Price();
    }

    public abstract class CD : Packing
    {
        public abstract string Name();
        public abstract int Price();
    }

    public abstract class Company : CD
    {
        public abstract string CompanyName();
    }

    public class Sony : Company
    {
        public override string CompanyName()
        {
            return "Sony";
        }

        public override string Name()
        {
            return "Sony CD";
        }

        public override int Price()
        {
            return 20;
        }
    }

    public class Samsung : Company
    {
        public override string CompanyName()
        {
            return "Samsung";
        }

        public override string Name()
        {
            return "Samsung CD";
        }

        public override int Price()
        {
            return 15;
        }
    }

    public class CDType
    {
        private List<Packing> items = new List<Packing>();
        public void AddItem(Packing packing)
        {
            items.Add(packing);
        }

        public int GetCost()
        {
            int cost = 0;
            foreach (Packing pack in items)
                cost += pack.Price();

            return cost;
        }

        public void ShowItems()
        {
            foreach(Packing pack in items)
            {
                Console.WriteLine("CD Name = " + pack.Name());
                Console.WriteLine("CD Price = " + pack.Price());
            }
        }

    }

    public class CDBuilder
    {
        public CDType BuildSonyCD()
        {
            CDType cds = new CDType();
            cds.AddItem(new Sony());
            return cds;
        }

        public CDType buildSamsungCD()
        {
            CDType cds = new CDType();
            cds.AddItem(new Samsung());
            return cds;
        }
    }

    public class BuilderDemo
    {
        public void Demo()
        {
            CDBuilder cDBuilder = new CDBuilder();

            CDType cDType1 = cDBuilder.BuildSonyCD();
            cDType1.ShowItems();

            CDType cDType2 = cDBuilder.buildSamsungCD();
            cDType2.ShowItems();
        }
    }
}

