#include<iostream>
using namespace std;
class Color
{
  public:
  int squre,cube;
  void set(int s,int c)
  {
    squre=s;
    cube=c;
  }
};
class Cube:public Color
{
public:
void display()
{
cout<<"Enter an integer number:";
cout<<" Square of "<<squre<<" is: "<<squre*squre<<endl;
cout<<"Enter an integer number:";
cout<<" Cube of "<<cube<<" is: "<<cube*cube*cube<<endl;
}
};

int main()
{
Cube q;
  int s,c;
  cin>>s;
  cin>>c;
  q.set(s,c);
  q.display();
}