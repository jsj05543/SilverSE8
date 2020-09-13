package exercise.Q__7;

interface Z{ }
class Y extends X { public String toString() { return "Y"; } }
class X implements Z { public String toString() { return "X"; } }
public class TestX07 {
  public static void main(String[] args) {
    Y y = new Y();
    X x = y;
    Z z = x;
    System.out.print(x + " ");
    System.out.print((Y)x + " ");
    System.out.print(z + " ");
  }
}
