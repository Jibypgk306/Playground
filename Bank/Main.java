#include<iostream>
#include<stdio.h>
#include<string.h>
using namespace std;
class bank
{
        int acno;
        string acctype;
  		string namee;
        float bal;  
   public:
        bank(int acc_no, string name, string acc_type, float balance)  //Parameterized Constructor
        {
                acno=acc_no;
                namee=name;
                 acctype=acc_type;
                bal=balance;
        }
        void deposit();
        void withdraw();
        void display();
};
void bank::deposit()   //depositing an amount
{
        int damt1;
        cout<<"\nEnter Deposit Amount = ";
        cin>>damt1;
        bal=bal+damt1;
}
void bank::withdraw()  //withdrawing an amount
{
        int wamt1;
        cout<<"\nEnter Withdraw Amount = ";
        cin>>wamt1;
        if(wamt1>bal)
                cout<<"\nCannot Withdraw Amount";
        bal-=wamt1;
}
void bank::display()  //displaying the details
{
        cout<<"\nAccout No. : "<<acno;
        cout<<"\nName : "<<namee;
        cout<<"\nAccount Type : "<<acctype;
        cout<<"\nBalance : "<<bal;  
}
int main()
{
        int acc_no;
        string name, acc_type;
        float balance;
        cout<<"Enter Details: \n";
        cout<<"Account No. ";
        cin>>acc_no;
        cout<<"\nName : ";
        cin>>name;
        cout<<"\nAccount Type : ";
        cin>>acc_type;
        cout<<"\nBalance : ";
        cin>>balance;
  
        bank b1(acc_no, name, acc_type, balance);  //object is created
        b1.deposit(); //
        b1.withdraw(); // calling member functions
        b1.display(); //
        return 0;
}