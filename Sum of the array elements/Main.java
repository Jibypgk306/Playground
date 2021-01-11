#include <iostream>
using namespace std;

void Sum(int a[],int num,int sum);
int main()
{
    int i,a[100],num,sum=0;
  cin>>num;
  for(i=0;i<num;i++)
   {
    cin>>a[i];
    }
   Sum(a,num-1,sum); 
}

void Sum(int a[],int num,int sum)
{
 
 if(num>=0)
 {
 
   sum+=(a[num]); 
 
  Sum(a,num-1,sum);
 }
 else
 {
    cout<<sum; 
  return;
 }
}