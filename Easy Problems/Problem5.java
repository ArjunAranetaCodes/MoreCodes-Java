//Problem 5: Write a program that accepts that accepts temperature in
//Celcius and convert it to Farenheit.
import java.util.Scanner;
public class Program {
 public static void main(String[] args) {
  double celsius = 0.0;
  double farenheit = 0.0;

  Scanner sc = new Scanner(System.in);
  System.out.print("Enter value of celsius: ");
  celsius = sc.nextFloat();

  farenheit = (9.0/5.0) * celsius + 32.0;

  System.out.println();
  System.out.println(celsius + "C equals to "  + farenheit + "F");
 }
}
