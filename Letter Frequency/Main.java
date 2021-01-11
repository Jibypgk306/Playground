import java.util.Scanner;
public class Main{
 static int MAX = 26;  
     
    // Function to print the frequency  
    // of each of the characters of  
    // s in alphabetical order  
    static void compressString(String s, int n)  
    {  
        // To store the frequency  
        // of the characters  
        int freq[] = new int[MAX] ;  
     
        // Update the frequency array  
        for (int i = 0; i < n; i++)  
        {  
            freq[s.charAt(i) - 'a']++;  
        }  
     
        // Print the frequency in alphatecial order  
        for (int i = 0; i < MAX; i++)
        {  
     
            // If the current alphabet doesn't  
            // appear in the string  
            if (freq[i] == 0)  
                continue;  
     
            System.out.println((char)(i + 'a') +""+ freq[i]);  
        }  
    }  
     
    // Driver code  
    public static void main (String[] args)
    {  Scanner sn=new Scanner(System.in);
        String s =sn.nextLine();;  
        int n = s.length();  
     
        compressString(s, n);  
    }  
} 