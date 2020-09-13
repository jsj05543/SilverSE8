package main;
class Foo4 {
  String name;
  Foo4(String name) { this.name = name; }
} 
class Sample7_7 {
  public static void main(String[] args) {
    Foo4[] ary = { new Foo4("tanaka"),
                  new Foo4("suzuki"),
                  new Foo4("yamada") };
    
    System.out.println(ary);
    System.out.println(ary[1]);
    System.out.println(ary[1].name);
  }
}
