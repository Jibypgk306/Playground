#include<iostream>
using namespace std;
int main()
{
  int m,n,i,j;
cin>>m>>n;
  int flag=0;
  int a[m][n];
for(i=0;i<m;++i)
{
 for(j=0;j<n;++j)
  cin>>a[i][j];
}
for(i=0;i<m;++i)
{
 for(j=0;j<n;++j)
 {
 if(a[i][j]!=a[j][i])
 {
flag=1;
 }
}
}
  if(flag==1)
  {
    cout<<"Not Symmetric";
  }
  else
  {
    cout<<"Symmetric";
}
}