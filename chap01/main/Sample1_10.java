package main;
class Sample1_10 {
  public static void main(String[] args) {
    int x = 100;
    x = 200;
    Sample1_10 dSample1_10=new Sample1_10();
    dSample1_10.method();
    
    Sample1_10 dSample1_101=new Sample1_10();
    dSample1_101.method();
  }
  public static void method() {
    //x = 300;
	  System.out.print("aa");
  }
}
