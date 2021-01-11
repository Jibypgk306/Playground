import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
String s1= sc.nextLine();  
  String s2= sc.nextLine();      
if(s1.compareTo(s2)==0)
{
  System.out.println("Strings are same");
} 
      else
      {
        System.out.println("Strings are not same");
  
      }
}  
}