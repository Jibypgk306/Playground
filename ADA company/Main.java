#include<iostream>
using namespace std;
void ADA(int n)
{
  try
  {
    if(n>50)
    {
      cout<<"first round cleared";
      throw "\neligible for second round";
    }
    else
    {
      cout<<"first round not cleared";
    }
  }
  catch( const char *s)
  {
    cout<<s;
  }
}

int main() 
{
  int m;
  cin>>m;
  ADA(m);
    return 0;
}
