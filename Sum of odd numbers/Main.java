#include<iostream>
using namespace std;
class sum
{
private: int a,i;

public:
void add()
{
int c;
  cin>>a;
for(i=1;i<=a;i++)
{
  if(i%2!=0)
  {
    c=c+i;
}
}
  cout<<c;
}
};
int main()
{
sum s;
s.add();
}