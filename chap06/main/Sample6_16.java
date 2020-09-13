package main;
class Sample6_16 {
  public static void main(String[] args) {
    int i1 = 100;
    Integer obj = i1; //Autoboxing
    int i2 = obj;     //Unboxing
    method(i2);       //int�^�Ń��\�b�h�̈����ɓn��
  }
  static void method(Integer obj) {//Integer�^�Ŏ󂯎��
    int i = obj + 100; //�v�Z���\
    System.out.println(i);
  }
}