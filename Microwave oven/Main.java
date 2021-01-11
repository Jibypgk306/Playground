#include<iostream>
using namespace std;
int main()
{
int a;
 float b;
 cin>>a>>b;
 switch(a)
 {
   case 1:
 cout<<b;
 break;
 case 2:
 cout<<(b+0.5*b);
 break;
 case 3:
 cout<<2*b;
 break;
 default:
 cout<<"Number of items is more";
   break;
}
 return(0);
}
