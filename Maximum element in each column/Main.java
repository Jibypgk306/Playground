#include<iostream>
using namespace std;
int main()
{
  int m,n,i,j;
	cin>>m>>n;	
  int a[m][n],max[100];
	for(i=0;i<m;++i)
	{
		for(j=0;j<n;j++)
		cin>>a[i][j];
	}
	for(j = 0;j < n;j++){

int max = a[0][j];

for(i = 1;i<m;i++){

if(max < a[i][j])
  max = a[i][j];
}
cout<<max<<endl;
}
}