#include<iostream>
using namespace std;

class Abc
{
  public:
 int hour1,minute1,second1;
	//for second time
	int hour2,minute2,second2;
	//for the total(sum) time
	int hourr,minutee,secondd;
};
  
  int main()
{
    Abc obj;
	//taking the input from user
	cout<<"Enter time:\n";
	cout<<"Hours : \n";
    cin>>obj.hour1;
	cout<<"Minutes : \n";
    cin>>obj.minute1;
	cout<<"Seconds : \n";
    cin>>obj.second1;

	//taking the input from user
	cout<<"Enter time:\n";
	cout<<"Hours : \n"; cin>>obj.hour2;
	cout<<"Minutes : \n"; cin>>obj.minute2;
	cout<<"Seconds : \n"; cin>>obj.second2;

	//adding the entered times
	obj.secondd=obj.second1+obj.second2;
	obj.minutee=obj.minute1+obj.minute2+(obj.secondd/60);
	obj.hourr=obj.hour1+obj.hour2+(obj.minutee/60);
	obj.minutee=obj.minutee % 60;
	obj.secondd=obj.secondd%60;
    cout<<"Time after add: "<<obj.hourr<<":"<<obj.minutee<<":"<<obj.secondd;
  }