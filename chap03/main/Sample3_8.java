package main;
class Sample3_8 {
  public static void main(String[] args) {
    int i1 = 100;     int i2 = 100;   int i3 = 127;
    byte b = 12;      char c = 'a';      
    float f = 10.0f;  double d = 10.0;
    boolean bl = true;

    System.out.println("i1 == i2 t  : " + ( i1 == i2 ));
    System.out.println("b  == i3 t  : " + ( b  == i3 ));
    System.out.println("f  ==  d t  : " + ( f  ==  d ));
    System.out.println("c  == 'a' t : " + ( c  == 'a'));
    System.out.println("bl == true :t " + ( bl == true ));
    System.out.println("bl == false: f" + ( bl == false));
  }
}
