#include<iostream>
using namespace std;

class A
{
  public:
  int r;
};
  
  int main()
{
    A obj;
    cout<<"Enter the value of Radius :\n";
  cin>>obj.r;
    cout<<"Area of Circle : "<<obj.r*obj.r*3.14<<endl;
       }