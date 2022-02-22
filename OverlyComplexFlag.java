import static java.lang.System.*;

public class OverlyComplexFlag {
  public static void main( String[] args ) {
    printTopHalf();

    print48Colons();
    print48Ohs();
    print48Colons();
    print48Ohs();
    print48Colons();
    print48Ohs();
  }

  public static void print48Colons()
  {
    out.println( "|::::::::::::::::::::::::::::::::::::::::::::::::|" );
  }

  public static void print48Ohs()
  {
    out.println( "|OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|" );
  }

  public static void print34Colons()
  {
    out.println( "|::::::::::::::::::::::::::::::::::|" );
  }

  public static void printPledge()
  {
    out.println( "I pledge allegiance to the flag." );
  }

  public static void print34Ohs()
  {
    out.println( "|OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO|" );
  }

  public static void print6Stars()
  {
    out.print( "| * * * * * * " );
  }

  public static void print5Stars()
  {
    out.print( "|  * * * * *  " );
  }

  public static void printSixStarLine()
  {
    print6Stars();
    print34Ohs();
  }

  public static void printFiveStarLine()
  {
    print5Stars();
    print34Colons();
  }

  public static void printTopHalf()
  {
    out.println( " ________________________________________________" );

    printSixStarLine();
    printFiveStarLine();
    printSixStarLine();
    printFiveStarLine();
    printSixStarLine();
    printFiveStarLine();
    printSixStarLine();
  }
}
