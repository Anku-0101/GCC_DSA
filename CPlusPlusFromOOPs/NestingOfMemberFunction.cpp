#include<iostream>

using namespace std;

class Binary
{
    private:
        char str[1024];
        bool CheckBinary();
    
    public:
        void ReadBinary();
        void Display();
        void OnesCompliment();
};

void Binary :: ReadBinary()
{
    cout<<"Enter the binary number \n";
    cin>>str;
}

bool Binary :: CheckBinary()
{
    for(int i =0; str[i] != '\0'; i++)
    {
        if(str[i] != '0' && str[i] != '1')
        {
            return false;
        }
    }
    return true;
}

void Binary :: Display()
{
    for(int i = 0; str[i]!='\0'; i++)
    {
        cout<<str[i];
    }
    cout<<'\n';
}
void Binary :: OnesCompliment()
{
    if(!CheckBinary())
    {
        cout<<"Number is not in binary format \n";
        return;
    }
    cout<<"The Ones Compliment is \n";
    for(int i=0; str[i]!='\0'; i++)
    {
        if(str[i] == '0')str[i] = '1';
        else str[i] = '0';
    }
    Display();
}

int main()
{
    Binary data;
    data.ReadBinary();
    data.Display();
    data.OnesCompliment();
    return 0;
}