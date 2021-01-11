#include<iostream>
using namespace std;
int main()
{
  int n,m,sum=0;
  cin>>n>>m;
  int x,y;
  int i,a[n];
  for(i=0;i<n;i++)
  {
    cin>>a[i];
}
  for(i=0;i<n;i++)
  {
    sum=sum+a[i];
    x=(sum/m)+1;
  }
  if(n<=3)
  {
    y=sum/m;
    cout<<y;
  }
  else
  {
    cout<<x;
  }
}
  