#include <iostream>
using namespace std;

int main() 
{
int n,i,j;
  int even=0,odd=0;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array"<<endl;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)
    {
      even++;
    }
    else if(a[i]%2!=0)
    {
      odd++;
    }
  }
  if(even==n)
  {
    cout<<"The array is Even";
  }
  else if(odd==n)
  {
    cout<<"The array is Odd";
  }
  else
  {
    cout<<"The array is Mixed";
  }
    return 0;
}