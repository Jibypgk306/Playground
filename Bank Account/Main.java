#include<iostream>
using namespace std;
class Bank
{
  public:
  int accno;
  char name[20];
  char type[20];
  void get()
  {
    cout<<"Enter Details:";
    cout<<"\nAccout No:";cin>>accno;
    cout<<"\nName:";cin>>name;
    cout<<"\nAccount Type:";cin>>type;
  }
  void put()
  {
    cout<<"\nAccout No: "<<accno;
    cout<<"\nName: "<<name;
    cout<<"\nAccount Type: "<<type;
  }
};
class Account:public Bank
{
public:
int deposite,withdraw,balance,bb;
void detail()
{
cout<<"\nBalance:";
cin>>balance;
cout<<"\nEnter Deposit Amount =";
cin>>deposite;
cout<<"\nEnter Withdraw Amount =";
cin>>withdraw;
}
void cal()
{
bb=(balance+deposite)-withdraw;
}
void putdetail()
{
if(bb<0)
cout<<"\nCannot Withdraw Amount";
}
void print()
{
cout<<"\nBalance: "<<bb;
}
};
int main() 
{
   Account A;
  A.get();
  A.detail();
  A.cal();
  A.putdetail();
  A.put();
  A.print();
    return 0;
}
