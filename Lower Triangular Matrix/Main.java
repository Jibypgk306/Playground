import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner in=new Scanner(System.in);
      int n;
      int flag=0;
   n  = in.nextInt();
      int mat[][] = new int[n][n];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      mat[i][j] = in.nextInt();
    }
  }
  for(int i=0;i<n-1;i++)
  {
  for(int j=i+1;j<n;j++)
  {
    if(mat[i][j]==0)
    {
      continue;
    }
    else
    {
      flag=1;
      break;
    }
  }
  }
  if(flag==1)
  {
       System.out.print("no");
  } 
  else 
       System.out.print("yes");
}
}