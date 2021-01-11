#include<iostream>
using namespace std;
int main()
{
  float item1,item2;
  float percent;
  cin>>item1>>item2>>percent;
  float x=item1+item2;
  float dis=x*percent/100;
  float saved=x-dis;
  cout<<x<<endl;
	cout<<saved<<endl;
  	cout<<dis<<endl;
}