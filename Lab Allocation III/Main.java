import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
       int x,y,z,n,c=0;
  x=s.nextInt();
  y=s.nextInt();
  z=s.nextInt();
n=s.nextInt();
  if(x>=n)
  {
  c++;
  }
  if(y>=n)
  {
    c++;
  }
  if(z>=n)
  {
    c++;
  }
  if(c==0)
  {
    System.out.println(c);
  }
  else
  {
       System.out.println(c);
  }
}
}