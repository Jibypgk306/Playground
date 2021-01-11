#include<iostream>
using namespace std;
int main()
{
  int m,n,sum=0,row=0,col=0,diag=0;
  cin>>m>>n;
  int i,j;
  int mat[m][n];
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
      cin>>mat[i][j];
}
  }
  for(j=0;j<n-1;j++)
  {
    row=row+mat[0][j];
  }
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
      if((i+j)==(m-1))
      {
        diag=diag+mat[i][j];
      }
    }
  }
  
  for(j=1;j<m;j++)
  {
    col=col+mat[n-1][j];
  }
  cout<<"Sum of Zig-Zag pattern is "<<diag+row+col;
}