#include <iostream>
using namespace std;
int main()
{
  int i,j,n;
  cin>>n;
  int a[n][n],temp;
  for(i=0;i<n;i++)
    for(j=0;j<n;j++)
      cin>>a[i][j];
  //diaplay matrix:
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      cout<<a[i][j]<<" ";
    }
  cout<<"\n";
  }
  //transpose matrix:
  cout<<"Transpose matrix is:"<<"\n";
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      if(i<j)
      {
        temp=a[i][j];
        a[i][j]=a[j][i];
        a[j][i]=temp;
      }
      cout<<a[i][j];
      cout<<" ";
    }
    cout<<"\n";
  }
  return 0;
 }