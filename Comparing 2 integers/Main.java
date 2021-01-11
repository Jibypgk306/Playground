import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      int x=s.nextInt();
      int y=s.nextInt();
      if(x==y)
      {
        System.out.println(x+" and "+y+" are equal");
      }
      else if(x<y)
      {
         System.out.println(x+" less than "+y);
      }
      else
      {
        System.out.println(x+" greater than "+y);
      }
    }
}