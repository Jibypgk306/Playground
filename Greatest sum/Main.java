#include<iostream>
using namespace std;
int main()
{
int row,column,i,j,sum_row=0,sum_col=0,temp=0,count=0;
  cin>>row>>column;
  int mat[row][column];
  for(i=0;i<row;i++)
    for(j=0;j<column;j++)
      cin>>mat[i][j];
  
  // Sum of rows
  cout<<"Sum of rows is ";
  for(i=0;i<row;i++)
  {
    for(j=0;j<column;j++)
    {
      sum_row+=mat[i][j];
    }
    cout<<sum_row<<" ";
    if(sum_row>temp)
    {
      temp=sum_row;
      count++;
    }
      sum_row=0;
  } cout<<endl<<"Row "<<count<<" has maximum sum"<<endl;
    
  cout<<"Sum of columns is ";
  temp=0,count=0;
  for(j=0;j<column;j++)
  {
    for(i=0;i<row;i++)
    {
      sum_col+=mat[i][j];
    }
    cout<<sum_col<<" ";
    if(sum_col>temp)
    {
      temp=sum_col;
      count++;
    }
      sum_col=0;
  } cout<<endl<<"Column "<<count<<" has maximum sum";    
  
}
