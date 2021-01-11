#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  string str1;
  int i;
  getline(cin,str1);
  for(i=0;str1[i]!='\0';i++)
  {
    if(str1[i]>='A'&& str1[i]<='Z')
    {
      str1[i]=str1[i]+32;
  }
}
  cout<<"String in lowercase is "<<str1;
}