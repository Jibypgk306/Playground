import java.util.Scanner;
public class Main {
 public static void main(String args[])
   { Scanner i = new Scanner(System.in);
      int m, n, c, d;
     
 
      //System.out.println("Input number of rows of matrix");
      m = i.nextInt();
     
 
      int array1[] = new int[m];
      int array2[] = new int[m];
      int sum[] = new int[m];
 
      //System.out.println("Input elements of first matrix");
 
      for (  c = 0 ; c < m ; c++ )
       
            array1[c] = i.nextInt();
 
      //System.out.println("Input the elements of second matrix");
 
      for ( c = 0 ; c < m ; c++ )
        
            array2[c] = i.nextInt();
 
      for ( c = 0 ; c < m ; c++ )
        
             sum[c] = array1[c] + array2[c]; 
 
      //System.out.println("Sum of the matrices:-");
 
      for ( c = 0 ; c < m ; c++ )
      {
       
            System.out.print(sum[c]+"\t");
 
         System.out.println();
      }
   }
}