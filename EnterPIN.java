import java.util.Scanner;

public class EnterPIN {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    pin = 12345;
    // begin study drill
    String pEntry, password = "vesper";

    System.out.println( "WELCOME TO THE BANK OF JAVA" );
    System.out.print( "ENTER YOUR PASSWORD: " );
    pEntry = keyboard.next();

    while ( ! pEntry.equals(password) ) {
      System.out.println( "\nINCORRECT PASSWORD, TRY AGAIN." );
      System.out.print( "ENTER YOUR PASSWORD:" );
      pEntry = keyboard.next();
    }
    System.out.println( "\nPASSWORD ACCEPTED" );
    // end study drill

    System.out.print( "\nENTER YOUR PIN: " );
    entry = keyboard.nextInt();

    while ( entry != pin ) {
      System.out.println( "\nINCORRECT PIN, TRY AGAIN." );
      System.out.print( "ENTER YOUR PIN: " );
      entry = keyboard.nextInt();
    }

    System.out.println( "\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17" );
  }
}
