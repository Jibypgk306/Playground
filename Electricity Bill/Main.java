#include<iostream>
using namespace std;
int main()
{
  int unit,amnt;
  float cost,extra;
  cin>>unit;
  if(unit<=200)
  {
    cost=0.5;
    amnt=unit*cost;
    cout<<"Rs."<<amnt;
}
  else if(unit<=400)
  {
    cost=0.65;
    extra=100;
    amnt=unit*cost+extra;
    cout<<"Rs."<<amnt;
  }
  else if(unit<=600)
  {
    cost=0.80;
    extra=200;
    amnt=unit*cost+extra;
    cout<<"Rs."<<amnt;
  }
  else
  {
    cost=1.25;
    extra=425;
  amnt=unit*cost+extra;
    cout<<"Rs."<<amnt;
  }
}