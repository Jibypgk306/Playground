#include<iostream>
using namespace std;
int main()
{
int n,m,i,j;
cin>>n>>m;
  int a[n][m];
  int sum=0;
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      cin>>a[i][j];
    }
}
 for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      if(i==0||j==0||i==m-1||j==n-1)
      {
        sum=sum+a[i][j];
}
    }
 }
  cout<<"Sum of boundaries is "<<sum;
}