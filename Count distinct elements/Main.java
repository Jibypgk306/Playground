#include<iostream>
using namespace std;
int main()
{
 int n,a[100],count=0,i=0,j=0;
cin>>n;
for(i=0;i<n;i++)
 
cin>>a[i];
 
for(i=0;i<n;i++)
  {
for(j=0;j<i;j++)
    {
if(a[i]==a[j])
     
break;
     
    }
if(i==j)
   
count=count+1;
   
  }
cout<<"There are"<<" "<<count<<" "<<"distinct element in the array.";

}
