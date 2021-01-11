import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		String str, word;
       Scanner scan = new Scanner(System.in);
       str = scan.nextLine();
       str = str.replaceAll("the","");
      String ltrim = str.replaceAll("^\\s+", "");
       System.out.print(ltrim);       
   }
}