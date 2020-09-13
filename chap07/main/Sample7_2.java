package main;


class Foo72 { }

class Sample7_2 {
  public static void main(String[] args) {
    Foo72 f1 = new Foo72();   Foo72 f2 = new Foo72();
    System.out.println("f1.equals(f2)   : " + (f1.equals(f2)));

    Foo72 f3 = new Foo72();   Foo72 f4 = f3;
    System.out.println("f3.equals(f4)   : " + (f3.equals(f4)));
  }
}
