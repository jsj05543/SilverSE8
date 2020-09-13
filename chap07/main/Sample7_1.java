package main;

class Foo71 { } 
class Sample7_1 {
  public static void main(String[] args) {
    int[] ary = {1, 2, 3};
    Class obj1 = ary.getClass();
    System.out.println(obj1.getName());
    Foo71 foo = new Foo71();
    Class obj2 = foo.getClass();
    System.out.println(obj2.getName());
  }
}
