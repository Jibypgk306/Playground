#include<iostream>
using namespace std;
int main()
{
  int n=0,i,j,cnt=0;
cin>>n;
  int a[n][n];
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      cin>>a[i][j];
      if(a[i][j]%2==0)
        cnt++;
    }
  }
  if(cnt==n*n||cnt==0)
  {
    cout<<"Yes";
  }
  else
  {
    cout<<"No";
  }
 return 0;
}