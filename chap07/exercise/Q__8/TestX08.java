package exercise.Q__8;

class Foo {
  String val;
  Foo(String val) { this.val = val; }
}
public class TestX08 {
  public static void main(String[] args) { 
    Foo obj = new Foo("hello"); 
    String s = "hello";
    StringBuilder sb = new StringBuilder("hello");
    System.out.println(obj + " " + s + " " + sb);
  }
}
