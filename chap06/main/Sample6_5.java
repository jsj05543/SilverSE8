package main;
import Sub;
import Super;

class Super {
  int num;
  public void methodA() { num += 100; }
  public void print() {System.out.println("num�l :" + num); }
}
class Sub extends Super {
  public void methodA() { num += 500; }
  public void methodB(int num) {
    methodA();        // 7�s�ڂ��Ăяo�����
    print(); // �X�[�p�[�N���X�̃��\�b�h�Ăяo��
    super.methodA();  // 3�s�ڂ��Ăяo�����
    print(); // �X�[�p�[�N���X�̃��\�b�h�Ăяo��
  }
}
class Sample6_5 {
  public static void main(String[] args) {
    Sub s = new Sub();
    s.methodB(0);
  }
}
