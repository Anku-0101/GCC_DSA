// Sum.cs
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ComponentModel;

namespace wpf_INotifyPropertyChanged
{
    public class Sum : INotifyPropertyChanged
    {
        private string num1;
        private string num2;
        private string result;

        public Sum()
        {
            Num1 = "0";
            Num2 = "0";
            Result = "0";
        }
        public string Num1 
        {
            get
            {
                return num1;
            }
            set
            {
                int number;
                bool res = int.TryParse(value, out number);
                if (res) num1 = value;
                OnPropertyChanged("Num1");
                OnPropertyChanged("Result");
            }
        }
        public string Num2
        {
            get
            {
                return num2;
            }
            set
            {
                int number;
                bool res = int.TryParse(value, out number);
                if (res) num2 = value;
                OnPropertyChanged("Num2");
                OnPropertyChanged("Result");
            }
        }

        public string Result
        {
            get
            {
                int res = int.Parse(Num1) + int.Parse(Num2);
                return res.ToString();
            }

            set
            {
                int res = int.Parse(Num1) + int.Parse(Num2);
                result = res.ToString();
                OnPropertyChanged("Result");
            }
        }
        public event PropertyChangedEventHandler PropertyChanged;

        private void OnPropertyChanged(string property)
        {
            if(PropertyChanged != null)
            {
                PropertyChanged(this, new PropertyChangedEventArgs(property));
            }
        }
    }
}

// MainWindow.xaml.cs

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace wpf_INotifyPropertyChanged
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public Sum SumObj { get; set; }
        public MainWindow()
        {
            InitializeComponent();
            SumObj = new Sum();
            this.DataContext = SumObj;
        }
    }
}

// MainWindow.xaml

<Window x:Class="wpf_INotifyPropertyChanged.MainWindow"
        xmlns="http://schemas.microsoft.com/winfx/2006/xaml/presentation"
        xmlns:x="http://schemas.microsoft.com/winfx/2006/xaml"
        xmlns:d="http://schemas.microsoft.com/expression/blend/2008"
        xmlns:mc="http://schemas.openxmlformats.org/markup-compatibility/2006"
        xmlns:local="clr-namespace:wpf_INotifyPropertyChanged"
        mc:Ignorable="d"
        Title="MainWindow" Height="450" Width="800">
    <StackPanel>
        <Label Content="Num1"/>
        <TextBox Width="100" Height="30" Text="{Binding Path=Num1, Mode=TwoWay}" />
        <Label Content="Num2"/>
        <TextBox Width="100" Height="30" Text="{Binding Path=Num2, Mode=TwoWay}" />
        <Label Content="SUM of Num1 and Num2"/>
        <TextBox Width="100" Height="30" Text="{Binding Path=Result, Mode=TwoWay}" />
    </StackPanel>
</Window>
