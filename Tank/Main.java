#include<iostream>
#include<math.h>
using namespace std;
int main()
{
 float r,h,wphr,thr,volume;
  int full;
  cin>>r;
  cin>>h;
  cin>>wphr;
  cin>>thr;
  volume=((22/7)*r*r*h);
  full=ceil(volume/wphr);
  if(full<=thr)
  {
    cout<<"The tank can be filled within "<<thr<<" hours";
  }
  else
  {
    cout<<"The tank cannot be filled within "<<thr<<" hours";
  }
  return 0;
 }
