package exercise.Q__4;
public class TestX4{
  public static void main(String[] args) {
    int i = 5;
    int j = 10;
    int k = 15;
    if ( (i < j) || ( k-- > j) ) {
      System.out.println("First if, value of k: " + k);
    }
    if ( (i < j) && ( --k < j) ) {
      System.out.println("Second if, value of k: " + k);
    }
    System.out.println("Out of if, k:" + k);
  }
}
