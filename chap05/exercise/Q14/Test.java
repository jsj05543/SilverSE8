package exercise.Q14;
class Test {
  int val;
  static void x(int val) {
    val = 9;
    System.out.print(val + " ");
  }
  public static void main(String[] args) { 
    TestX15 test = new TestX15();
    test.val = 8;
    int val = 10;
    System.out.print(val + " ");
    x(val);
    System.out.print(val + " ");
    System.out.print(test.val + " ");
  }
}
