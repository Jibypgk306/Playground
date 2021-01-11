#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  int tb,tr,cr,cb;
  cin>>tb;
  cin>>tr;
  cin>>cr;
  cin>>cb;
  float t6=tb/6;
  float t=cb/6;
  float p=cb%6;
  float c6=(t+p/10);
  float crr=cr/c6;
  float trr=tr/t6;
  cout<<t6<<"\n"<<fixed<<setprecision(1)<<c6<<"\n"<<crr<<"\n"<<trr;
  if(crr>trr)
  {
    cout<<"\nEligible to Win";
  }
  else
  {
    cout<<"\nNot Eligible to Win";
  }
  return 0;
  
}