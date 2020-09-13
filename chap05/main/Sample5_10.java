package main;
class Employee {
  //�C���X�^���X�ϐ���private�C���q���w��
  private int id;

  //�R���X�g���N�^��public�C���q���w�� 
  public Employee(int i) { id = i; }

  //���\�b�h��public�C���q���w��
  public int getId() { return id; }
}

public class Sample5_10 {
  public static void main(String[] args) {
    Employee emp = new Employee(100);

    //private�w�肳�ꂽ�����o�́A���N���X����A�N�Z�X�s��
    //System.out.println(
      // "private�w��̃C���X�^���X�ϐ��փA�N�Z�X : " +  emp.id);

    //public�w�肳�ꂽ�����o�́A���N���X����A�N�Z�X��
    System.out.println(
      "public�w��̃��\�b�h�փA�N�Z�X : " + emp.getId());
  }
}
