public class Test {
  public static void main( String[] args ) {
    double a, b;
    int c;
    a = Math.random();
    b = a * 10;
    c = (int)b;
    System.out.println( "Math.random(): " + a );
    System.out.println( "a * 10: " + b );
    System.out.println( "(int)b: " + c );
  }
}
