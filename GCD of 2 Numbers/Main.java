import java.util.Scanner;
class Main
{
  static int gcd(int a, int b)
    {
        // Everything divides 0 
        if (a == 0)
          return b;
        if (b == 0)
          return a;
      
        // base case
        if (a == b)
            return a;
      
        // a is greater
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
    public static void main(String args[])
    {
Scanner s=new Scanner(System.in);
      int a=s.nextInt();
           int b=s.nextInt(); 
      System.out.println("G.C.D of " + a +" and " + b + " is " + gcd(a, b));
    }
}