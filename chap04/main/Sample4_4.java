package main;
class Sample4_4 {
  public static void main(String[] args) {
    // while �̏ꍇ
    int count = 5;
    while (count != 5 && count > 0) {
        System.out.println("while    : count = " + count);
        count--;
    }

    // do-while �̏ꍇ
    count = 5;
    do {
        System.out.println("do-while : count = " + count);
        count--;
    } while (count != 5 && count > 0);
  }
}
