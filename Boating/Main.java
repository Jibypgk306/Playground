#include<iostream>
using namespace std;
int main()
{
  int x,y,z;
  cin>>x>>y>>z;
  int p=y*75;
  int q=z*30;
  int r=p+q;
  if(r>x)
  {
    cout<<"Boat will sink";
}
  else
  {
    cout<<"Boat is stable";
  }
}