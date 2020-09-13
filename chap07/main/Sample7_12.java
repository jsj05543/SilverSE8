package main;
import java.time.LocalDate;

public class Sample7_12 {
  public static void main(String[] args) {
    LocalDate date = LocalDate.now();
    System.out.println("date     : " + date);
    System.out.println("3 days after    : " + date.plusDays(16));
    System.out.println("5 months after  : " + date.plusMonths(5));
    System.out.println("2 weeks afeter  : " + date.plusWeeks(2));
    System.out.println("10 year after   : " + date.plusYears(10));
    System.out.println("date     : " + date);
  }
}