package exercise.Q__11;
import java.util.*;
public class TestX11 {
  public static void main(String[] args) {
    List<String> list = 
             Arrays.asList("aaaaaa", "bbb", "cccc", "dddddddd");
    list.replaceAll(s -> s.length() > 5 ? s.substring(0, 5): s);
    System.out.println(list);
  }
}