import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
String str= sc.nextLine();
 String str2= sc.nextLine();
      str=str.concat(str2);
System.out.print(str);             
}  
}