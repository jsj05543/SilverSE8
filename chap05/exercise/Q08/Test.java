package exercise.Q08;
import exercise.Q06.Test;

class Test {
  static void methodA() {
    methodB();
    Test.methodB();
    methodC();
    Test.methodD();
  }
  static void methodB() { }
  void methodC() {
    methodB();
    Test.methodB();
    methodD();
    Test.methodD();
  }
  void methodD() { }
}
