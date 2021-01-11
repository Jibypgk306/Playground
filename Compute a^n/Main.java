import java.util.Scanner;
class Main
{static int power(int N, int P) 
    { 
        if (P == 0) 
            return 1; 
        else
            return N * power(N, P - 1); 
    } 
  
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
		int N = s.nextInt(); 
        int P = s.nextInt(); 
  
        System.out.println("The value of "+N+" power "+P+" is "+power(N, P)); 
  
      }
}