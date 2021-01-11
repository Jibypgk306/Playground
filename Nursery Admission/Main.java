#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str1[50];
  int x;
  gets(str1);
 x=strlen(str1);
  cout<<"The number of letters in the name is "<<x;
}