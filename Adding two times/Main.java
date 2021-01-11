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
	
    cin>>obj.hour1;
    cin>>obj.minute1;
    cin>>obj.second1;

	//taking the input from user
	 cin>>obj.hour2;
	 cin>>obj.minute2;
	 cin>>obj.second2;

	//adding the entered times
	obj.secondd=obj.second1+obj.second2;
	obj.minutee=obj.minute1+obj.minute2+(obj.secondd/60);
	obj.hourr=obj.hour1+obj.hour2+(obj.minutee/60);
	obj.minutee=obj.minutee % 60;
	obj.secondd=obj.secondd%60;
    cout<<obj.hourr<<":"<<obj.minutee<<":"<<obj.secondd;
  }