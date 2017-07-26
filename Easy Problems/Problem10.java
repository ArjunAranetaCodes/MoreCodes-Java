//Problem 10: Write a program that accepts three numbers
//and outputs their average.
import java.util.Scanner;
public class Problem10 {
 public static void main(String[] args) {
  int num1 = 0;
  int num2 = 0;
  int num3 = 0;
  int ave = 0;

  Scanner sc = new Scanner(System.in);
  System.out.print("Enter value of num1: ");
  num1 = sc.nextInt();
  System.out.print("Enter value of num2: ");
  num2 = sc.nextInt();
  System.out.print("Enter value of num3: ");
  num3 = sc.nextInt();
  ave = (num1 + num2 + num3) / 3;

  System.out.println();
  System.out.println("Average is "  + ave);
 }
}
