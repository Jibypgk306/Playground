import java.util.Scanner;
class Main
{
  static int countDigit(long n)
    {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            ++count;
        }
        return count;
    }
    public static void main(String args[])
    {
Scanner s=new Scanner(System.in);
      int n=s.nextInt();
        System.out.print("The number of digits in "+n+" is "+ countDigit(n));   
    }
}