package exercise.Q__2;
public class TestX02 {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};
    System.arraycopy(array, 2, array, 1, 2);
    System.out.println(array[2] + " " + array[4]);
    for(int i=0;i<array.length;i++) {
    	System.out.println(array[i]);
    }
  }
}
