#include<iostream>
using namespace std;
int main()
{
   int L,Lit,c;
  cin>>L;
  cin>>Lit;
  c=L*L*L*1000;
  if(Lit>(c))
     {
       cout<<"Cannot store";
     }
     else
     {
       cout<<"Can store";
     }
     return 0;
}