#include <iostream>
using namespace std;

int main() 
{
   int n,i,v,sum=0;
  cin>>n;
  cin>>v;
  int a[n];
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
    sum=sum+a[i];
  }
  if(sum<=v)
  {
    cout<<"YES";
  }
  else
  {
    cout<<"NO";
  }
}