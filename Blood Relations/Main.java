#include<iostream>
using namespace std;
class Grandfather
{
  public: 
  char gf[30];
  void getgf() 
  {
    cin>>gf;
    cout<<"\nEnter the grand parent name:";
  }
};
class Father:public Grandfather
{
  public:
  char f[20];
  void getf()
  {
    cin>>f;
    cout<<"\nEnter the father name:";
  }
};
class Son:public Father
{
public:
char s[10];
void gets()
{
cin>>s;
cout<<"Enter the son name:";
}
};
int main() 
{
 Son s1;
  s1.gets();
  s1.getf();
  s1.getgf();
    return 0;
}
