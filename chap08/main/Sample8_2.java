package main;
class Sample8_2 {
  public static void main(String[] args) {
    int[] num = {10, 20, 30};
    for (int i = 0; i < 4; i++) {
      try {
        System.out.print("num :" + num[i]);
        System.out.println(" : " + (i+1) );
      } catch(ArrayIndexOutOfBoundsException e) {
        System.out.println("@@@@@@@@@@@@");
      }
    }
    System.out.println("-- end --");
  }
}
