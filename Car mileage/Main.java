#include<iostream>
using namespace std;
int main()
{
  float a;
  int b,c;
 int x;
  cin>>a;
  cin>>b>>c;
  x=c/a;
  if(x>=b)
  {
    cout<<"Cannot reach";
  }
  else
  {
    cout<<"Can reach";
  }
}