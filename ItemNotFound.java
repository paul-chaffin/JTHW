import java.util.Scanner;

public class ItemNotFound
{
  public static void main( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);

    String[] heroes = {
                      "Abderus", "Achilles", "Aeneas", "Ajax", "Amphityron",
                      "Bellerophon", "Castor", "Chrysippus", "Daeadalus",
                      "Diomedes", "Eleusis", "Eunostus","Ganymede", "Hector",
                      "Iolaus", "Jason", "Meleager", "Odysseus", "Orpheus",
                      "Perseus", "Theseus"
                    };
    String guess;
    boolean found;

    System.out.println( "Pop quiz!" );
    System.out.print( "Name any *mortal* hero from Greek mythology: " );
    guess = keyboard.next();
    found = false;
    for ( String hero : heroes )
    {
      if ( guess.equals(hero) )
      {
        System.out.println( "That's one of them!" );
        found = true;
      }
    }

    if ( found == false )
    {
      System.out.println( "No, " + guess + " wasn't a Greek mortal hero." );
    }
  }
}
