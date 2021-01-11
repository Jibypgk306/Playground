#include<iostream>
using namespace std;
class sum
{
private: int a,i,flag=0;

public:
void check()
{
int c;
  cin>>a;
for(i=1;i<=a;i++)
{
  if(i%2!=0)
  {
   flag=1;
}
  else
  {
    flag=0;
  }
}
  if(flag==1)
  {
    cout<<"ODD";
  }
  else
  {
    cout<<"EVEN";
}
}
};
int main()
{
sum s;
s.check();
}