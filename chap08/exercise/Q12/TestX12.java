package exercise.Q12;


public class TestX12 {
  private short s;
  private Integer   i;
  public TestX12(int i) {
    this.i = this.i + i + s;
    this.s = 0;
  }
  public void print() { System.out.println(" s = " + s + " : i = " + i); }
  public static void main(String[] args) {
    TestX12 t = new TestX12(5);
    t.print();
  }
}
