package main;
import java.io.FileReader;
class Sample8_5 {
  public static void main(String[] args) {
    //型変換
    int i = Integer.parseInt("10");

    //ファイル読み取り//コンパイルエラー
    FileReader r = new FileReader("Test.txt");
  }
}
