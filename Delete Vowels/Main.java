import java.util.*;
public class Main
{
   public static void main(String[] args)
   {Scanner s=new Scanner(System.in);
      String str = s.nextLine();
      //System.out.println("Given string: " + str);
      str = str.replaceAll("[AaEeIiOoUu]", "");
      System.out.println( str);
   }
}