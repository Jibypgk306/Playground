#include<iostream>
using namespace std;
void divide(int x,int y)
{
  try
  {
    if(y!=0)
    {
      int z=x/y;
      cout<<z;
    }
    else
    {
      throw "Division by zero Exception";
    }
  }
  catch(const char *s)
  {
    cout<<s;
  }
}
int main() 
{
   int a,b;
  cin>>a;
  cin>>b;
  divide(a,b);
  return 0;
}
