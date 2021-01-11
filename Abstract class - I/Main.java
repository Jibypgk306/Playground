#include<iostream>
using namespace std;

class Shape
{
  public:
  virtual void draw()=0;
};
class Rect:public Shape
{
public:
void draw()
{
int l;
cout<<"Rectangle"<<endl;
cin>>l;
cout<<"The given input is "<<l<<endl;
}
};
class Circle:public Shape
{
public:
void draw()
{
int r;
cout<<"Circle"<<endl;
cin>>r;
cout<<"The given input is "<<r<<endl;
}
};
int main()
{
  Rect r1;
  r1.draw();
  Circle c1;
  c1.draw();
}