import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int l=s.nextInt();
    int w=s.nextInt();
    System.out.println((2*l)+(2*w)+"m");
    System.out.println(l*w+"sqm");
  }
}