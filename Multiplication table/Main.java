#include<iostream>
using namespace std;
int main()
{
  int num, end;
  cout<<"Enter n"<<endl;
	cin >> num;
    cout<<"Enter m"<<endl;
	cin >> end;
  cout<<"The multiplication table of "<<num<<" is"<<endl;
	int i;
	for(i = 1; i <= end; i++)
	{
		cout << i << "*" << num << "=" << num*i << endl;
	}
	return 0;
}