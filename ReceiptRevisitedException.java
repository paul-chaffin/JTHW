import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReceiptRevisitedException
{
  public static void main( String[] args )
  {
    PrintWriter fileout;
    double gasPrice, gallons, total;
    gasPrice = 3.478;
    Scanner keyboard = new Scanner(System.in);
    System.out.println( "Current gas price: " + gasPrice );
    System.out.println( "How many gallons would you like?\n> " );
    gallons = keyboard.nextDouble();
    total = Math.round(gasPrice * gallons);

    try
    {
      fileout = new PrintWriter("receipt.txt");
    }
    catch ( IOException Err )
    {
      System.out.println( "Sorry, I can't open 'receipt.txt' for writing." );
      System.out.println( "Maybe the file exists and is read-only?" );
      fileout = null;
      System.exit(1);
    }

    fileout.println( "+------------------------+");
    fileout.println( "|                        |");
    fileout.println( "|      CORNER STORE      |");
    fileout.println( "|                        |");
    fileout.println( "| 2014-06-25  04:38PM    |");
    fileout.println( "|                        |");
    fileout.println( "| Gallons:       "+gallons+"  |");
    fileout.println( "| Price/gallon: $ 3.478  |");
    fileout.println( "|                        |");
    fileout.println( "| Fuel total:  $ " + total + "   |");
    fileout.println( "|                        |");
    fileout.println( "+------------------------+");
    fileout.close();
  }
}
