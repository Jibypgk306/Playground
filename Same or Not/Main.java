#include<iostream>
using namespace std;
int main()
{
  int r,c,count=0;
cin>>r>>c;
int a[r],b[c];
for(int i=0;i<r;i++)
  {
cin>>a[i];
  }
for(int j=0;j<c;j++)
  {
cin>>b[j];
  }
for(int i=0;i<r;i++)
  {
for(int j=i;j<=i;j++)
    {
if(a[i]==b[j])
      {
count++;
      }
    }
  }
if(count==r)
cout<<"Same";
else
cout<<"Not Same";

}
