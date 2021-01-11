#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int temp,v;
  cin>>temp>>v;
  float wcf = 35.74 + 0.6215*temp + (0.4275*temp - 35.75) * pow(v,0.16);
cout<<wcf;
}