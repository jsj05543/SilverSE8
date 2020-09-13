package main;
import Super;
import exercise.Q12.Sub;

class Super {    // �X�[�p�[�N���X
  public void print(String s) {
    System.out.println("Super print : " + s);
  }
  public void method(){ } 
}
class Sub extends Super {  // �T�u�N���X
  public void print(String s) {
    s = "�n���ꂽ������� " + s + " �ł�";
    System.out.println("Sub print   : " + s);
  }
  //void method(){ } //�R���p�C���G���[ 
}
class Sample6_2 {
  public static void main(String[] args) {
    Super s1 = new Super();
    s1.print("Java");    // 2�s�ڂ��Ăяo�����
    Sub s2 = new Sub();
    s2.print("Java");    // 8�s�ڂ��Ăяo�����
  }
}
