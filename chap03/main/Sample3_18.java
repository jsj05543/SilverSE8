package main;
class Sample3_18 {
  public static void main(String[] args) {
    int a = 10;
    if (a > 0) {
      System.out.println("A");
      if(a % 2 == 0) {
        System.out.println("B");
      }
    } else {
      if(a == 0) {
        System.out.println("C");
      } else {
        System.out.println("D");
      }
    }
  }
}
