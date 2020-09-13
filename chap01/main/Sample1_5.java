package main;
class Sample1_5 {
  public static void main(String[] args) {
    float x1 = 3_.1415F;     //コンパイルエラー
    float x2 = 3.1415F;     //コンパイルエラー
    long x3 = 999_99_9999_L; //コンパイルエラー
    int x4 = _52;            //コンパイルエラー
    int x5 = 5_2;            //OK
    int x6 = 52_;            //コンパイルエラー
    int x7 = 5_______2;      //OK
    int x8 = 0_x52;          //コンパイルエラー
    int x9 = 0x_52;          //コンパイルエラー
    int x10 = 0x5_2;         //OK 
    int x11 = 0_52;          //OK 
  }
}