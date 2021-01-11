#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  string str;
    getline(cin,str);
    int len = str.length();

    //using bubble sort to sort the characters
    for (int i = 0; i < len; i++)
	{
        for (int j = i+1; j < len; j++)
	    {
            if (str[i] > str[j]) //if previous has bigger ascii value than next,
	    {
		//swapping the prev and next characters
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
            }
        }
    }
    cout<<"The sorted string is "<<str;
    return 0;
}