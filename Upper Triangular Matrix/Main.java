import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner in=new Scanner(System.in);
      int n;
   n  = in.nextInt();
      int mat[][] = new int[n][n];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      mat[i][j] = in.nextInt();
    }
  }
  for(int i=1;i<n;i++)
  {
    for(int j=0;j<i;j++)
    {
      if(mat[i][j]==0)
      {
        continue;
      }
      else
      {
      System.out.print("no");
        return;
      }
    }
    
    
  }
       System.out.print("yes");
}
}