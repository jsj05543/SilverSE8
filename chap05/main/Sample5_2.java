package main;
import Employee;

class Employee {
  int id;
  void setId(int i) {
    id = i;
  }
  int getId() {
    return id;
  }
}
class Sample5_2 {
    public static void main(String[] args) {
    // A����p�I�u�W�F�N�g���쐬
    Employee a = new Employee();
    // ID���Z�b�g����
    a.setId(100);

    // B����p�I�u�W�F�N�g���쐬
    Employee b = new Employee();
    // ID���Z�b�g����
    b.setId(200);

    // ���ꂼ���ID�̕\��
    System.out.println("A����F " + a.getId());
    System.out.println("B����F " + b.getId());
  }
}
