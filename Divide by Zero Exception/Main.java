#include<iostream>
#include<math.h>
using namespace std;
void Exception(float x,float y)
{
  try
  {
    if(y!=0.0)
    {
     double z=x/y;
      cout<<"The quotient is "<<z;
    }
    else
    throw "Exception occurred \nMath error: Attempted to divide by Zero";

  }
  catch (const char *s)
  {
    cout<<s;
  }
}
int main()
{
  float a,b;
  cin>>a;
  cin>>b;
  Exception(a,b);
  return 0;
}
