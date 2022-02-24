public class ArrayIntro
{
  public static void main( String[] args )
  {
    String[] planets = { "Mercury", "Venus", "Earth", "Mars", "Jupiter",
                        "Saturn", "Uranus", "Neptune" };

    String[] cars = { "Pontiac", "Ford", "Chevy", "Alfa Romeo", "SAAB", "Volvo",
                      "Plymouth", "Daimler-Chrysler AG", "Lamborghini" };

    for ( String p : planets )
    {
      System.out.println( p + "\t" + p.toUpperCase() );
    }

    for ( String c : cars )
    {
      System.out.println( c );
    }
  }
}
