package exercise.Q__4;
public class TestX04 {
  public static void main(String[] args) { 
    String str = "JavaExam";
    StringBuilder sb = new StringBuilder("Java");
    sb.append("Exam");
    if(str.equals(sb.toString())){
      System.out.println("OK");
    }
  }
}
