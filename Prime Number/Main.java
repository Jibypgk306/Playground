#include<iostream>
using namespace std;
class Sum
{
  private:
  int n,i,flag=0;
  public:
  void find()
  {
    cin>>n;
    for(i=2;i<=n/2;i++)
    {
      if(n%i==0)
      {
        flag=1;
        break;
      }
    }
    if(n==1)
    {
      cout<<"1 is neither prime or composite.";
    }
    else
    {
      if(flag==0)
      {
        cout<<"Prime";
      }
        else
        {
          cout<<"Not Prime";
        }
      }
    }
  };
int main()
{
Sum s;
  s.find();
}