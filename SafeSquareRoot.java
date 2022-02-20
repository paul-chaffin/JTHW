import java.util.Scanner;

public class SafeSquareRoot {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double x, y;
    // begin study drill additions
    String z = "NO!";
    while(! z.equals("YES!"))
    {
      System.out.print( "ARE YOU READY?!?\n> " );
      z = keyboard.next();
    }
    //end study drill additions

    System.out.println( "Give me a numer, and I'll find its square root." );
    System.out.println( "(No negatives, please.)" );
    System.out.print( "> " );
    x = keyboard.nextDouble();

    while(x < 0)
    {
      System.out.print( "I won't take the square root of a negative." );
      System.out.println( " New number:" );
      System.out.print( "> " );
      x = keyboard.nextDouble();
    }

    y = Math.sqrt(x);

    System.out.println( "The square root of "+x+" is "+y);
  }
}
