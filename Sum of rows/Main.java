#include<iostream>
using namespace std;
int main()
{
   int m, n, sum = 0;
    cin >> m >> n;
    int i, j;
    int mat[m][n];
    for(i = 0; i < m; i++)
    {
        for(j=0;j <n;j++)
            cin >>mat[i][j];
    }
    for(i=0; i<m; i++)
    {
        sum = 0;
        for(j=0;j<n;j++)
        {
            sum= sum+mat[i][j];
        }
      cout<<sum<<endl;
    }
}