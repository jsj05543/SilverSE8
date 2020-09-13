package exercise.Q09;
import exercise.Q14.A;
import exercise.Q14.B;

class A {
  private A(){ }
}
class B extends A {
  private B() { }
  void play() { }
  public static void main(String[] args) {
    B b = new B();
    b.play();
  }
}
