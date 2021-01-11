#include<iostream>
using namespace std;
class Square
{
  public:
  int s;
  void get()
  {
   cout<<"Enter the side :" ;
  cin>>s;
  }
  void cal()
  {
    cout<<"\nThe square value is : "<<s*s;
  }
};
class Cube:public Square
{
public:
void put()
{
cout<<"\nThe cube value is : "<<s*s*s;
}
};
int main() 
{
 Cube c;
  c.get();
  c.cal();
  c.put();
    return 0;
}
