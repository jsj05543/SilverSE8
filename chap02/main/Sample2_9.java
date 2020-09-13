package main;
import java.util.ArrayList;

class Sample2_9 {
  public static void main(String[] args) {
    ArrayList array = new ArrayList();
    array.add(10);
    //int num = array.get(0); //�R���p�C���G���[
    int num = (Integer)array.get(0); //�L���X�g�̗��p
  }
}
