package exercise.Q__12;
import java.util.*;
public class TestX12 {
  public static void main(String[] args) {
    String[] ary = {"tokyo", "nagasaki", "mie", "nara"};
    List<String> city = Arrays.asList(ary);
    if(city.removeIf(str -> str.length() <=3)) {
      System.out.println(city);
    }
  }
}