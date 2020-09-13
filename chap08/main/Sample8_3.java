package main;
class Sample8_3 {
  public static void main(String[] args) {
    int[] num = {10, 20, 30};
    for (int i = 0; i < 4; i++) {
      try {
        System.out.print("num :" + num[i]);
        System.out.println(" : " + (i+1) );
      } catch(ArrayIndexOutOfBoundsException e) {
        System.out.println("@@@@@@@@@@@@");
      } finally {
        System.out.println("-- finallys");
      }
    }
    System.out.println("-- end --");
  }
}
