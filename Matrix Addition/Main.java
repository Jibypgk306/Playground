#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j;
  cin>>r;
  cin>>c;
  int a[r][c];
  int b[r][c];
  int cc[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
}
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>b[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
   cc[i][j]=a[i][j]+b[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cout<<cc[i][j]<<" ";
}
    cout<<endl;
  }
}