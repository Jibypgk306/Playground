#include<iostream>
using namespace std;
int main()
{

      int range;
  int* a1 = NULL;   // Pointer to int, initialize to nothing.
  cout<<"Enter the number of elements in the array"<<endl;
int size;
  cin>>size;      // Read in the size
a1 = new int[size];
//System.out.println("enter elements");
  cout<<"Enter the elements in the array"<<endl;
for(int i=0;i<size;i++)
cin>>a1[i];
int max=a1[0];
      int min=a1[0];
for(int i=0;i<size;i++)
if(a1[i]>max)
{
max=a1[i];
}
      for(int i=0;i<size;i++)
if(a1[i]<min)
{
min=a1[i];
}
      range=max-min;
cout<<"The range of the array is "<<range;
}