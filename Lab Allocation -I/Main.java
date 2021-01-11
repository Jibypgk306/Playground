#include<iostream>
using namespace std;
int main()
{
 int l1,l2,l3;
  cin>>l1>>l2>>l3;
  if(l1<l2 && l1<l3)
  {
    cout<<"L1";
}
  else if(l2<l1 && l2<l3)
  {
    cout<<"L2";
  }
  else
  {
    cout<<"L3";
  }
}