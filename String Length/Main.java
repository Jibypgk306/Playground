#include<iostream>
using namespace std;
int main()
{
 int i,count=0;
   char ch[50];
    cin>>ch;
 
   for(i=0;ch[i]!='\0';i++)
   {
        count++;
   }
   cout<<"The length of word "<<ch<<" is "<<count<<"\n";}