import java.util.Scanner;
class Main
{
  static int fib(int n) 
    { 
        if (n <= 1) 
            return n; 
        return fib(n - 1) + fib(n - 2); 
    } 
  
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
         int n =s.nextInt(); 
System.out.println("The term "+n+" in the fibonacci series is "+fib(n-1)); 
    }
  
}