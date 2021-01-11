#include<iostream>
using namespace std;
class Bill
 
{
  public:
  int billno,units,bill;
  string name;
  
  void set()
  {
    cin>>billno>>name>>units;
  }
  void display()
  {
    if(units<=100)
    bill=units*1.20;
    else if(units<=300)
      bill=100*1.20+(units-100)*2;
    else
      bill=100*1.20+200*2+(units-300)*3;
    cout<<billno<<endl<<name<<endl<<units<<endl<<bill;
  }
};
int main()
{
	Bill b;
  b.set();
  b.display();
	return 0;
}