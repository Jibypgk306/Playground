#include<iostream>
using namespace std;
int main()
{ 
  int n;
	cin>>n;
	int arr1[n], arr2[n];
	int i,j,temp;
	for(i = 0; i < n ; i++)
		{
			cin>>arr1[i];
		}
	for(i = 0; i < n ; i++)
		{
			cin>>arr2[i];
		}
for(i=0;i<n;i++)
	{		
		for(j=i+1;j<n;j++)
		{
			if(arr2[i]>arr2[j])
			{
				temp  =arr2[i];
				arr2[i]=arr2[j];
				arr2[j]=temp;
			}
		}
	}
//fill the code;
int sum = 0;
	for(i = 0; i < n ; i++)
		{
			sum = sum + (arr1[i] * arr2[i]);
		}
	cout<<sum;
	return 0;
}