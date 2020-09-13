package main;
class ArgTest {
  void method1(int num) { //�����Ƃ��Ċ�{�f�[�^�^���󂯎��
    num += 10;
    System.out.println("��`���@" + num);
  }
  void method2(int[] array) { //�����Ƃ��ĎQ�ƌ^���󂯎��
    array[0] += 10;
    System.out.println("��`���@" + array[0]);
  }
}
class Sample5_11 {
  public static void main(String[] args) {
    int num = 10;
    int[] array = {10,30};
    ArgTest obj = new ArgTest();

    obj.method1(num);
    System.out.println("�Ăяo����  " + num);

    obj.method2(array);
    System.out.println("�Ăяo����  " + array[0]);
  }
}
