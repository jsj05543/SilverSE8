package main;
class Foo76 { } 
class Bar76 {
  public String toString() {
    return "This is an object made from Bar.";
  }
}
class Sample7_6 {
  public static void main(String[] args) {
    String obj1 = "tanaka";
    StringBuilder obj2 = new StringBuilder("tanaka");
    Foo76 obj3 = new Foo76();
    Bar76 obj4 = new Bar76();
    System.out.println(obj1);
    System.out.println(obj2);
    System.out.println(obj3);
    System.out.println(obj4);
  }
}
