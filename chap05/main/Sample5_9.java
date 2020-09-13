package main;
class Foo {
  static {
    System.out.println("Foo�N���X�Fstatic �C�j�V�����C�U");
  }
  Foo() { 
    System.out.println("Foo�N���X�F�R���X�g���N�^");
  }
}

public class Sample5_9 {
  static {
    System.out.println("Sample5_9�N���X�Fstatic �C�j�V�����C�U");
  }
  public static void main(String[] args) {
    System.out.println("Sample5_9�N���X�Fmain()���\�b�h");
    Foo f = new Foo();
  }
}
