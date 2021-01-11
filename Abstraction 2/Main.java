import java.util.*;
abstract class Movie {
  // Abstract method (does not have a body)
  public abstract void name();
  // Regular method
  
}

// Subclass (inherit from Animal)
class Moviename extends Movie {
      Scanner s=new Scanner(System.in);

  public void name() {
    String n;
    n=s.nextLine();
    System.out.println("The title is: "+n);
  }
}

class Main {
  public static void main(String[] args) {
    
   Moviename m=new Moviename(); // Create a  object
    m.name();
  }
}
