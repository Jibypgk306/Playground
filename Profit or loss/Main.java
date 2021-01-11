#include<iostream>
using namespace std;
int main()
{
int cp,sp;
  cin>>cp;
  cin>>sp;
  sp=sp*12;
  if(sp>cp)
  { int p=sp-cp;
  cout<<"Profit : Rs."<<p;
  } 
  else if(sp==cp)
  {
    cout<< "No profit nor loss";
  }
  else 
  {
    int p=cp-sp;
       cout<<"Loss : Rs."<<p;
      }
  return 0;
}


