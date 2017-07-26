//Problem 1: Write a program that accepts
//two numbers and find the sum.
import java.util.Scanner;
public class Program {
 public static void main(String[] args) {
  int num1 = 0;
  int num2 = 0;
  int sum = 0;

  Scanner sc = new Scanner(System.in);
  System.out.print("Enter value of num1: ");
  num1 = sc.nextInt();
  System.out.print("Enter value of num2: ");
  num2 = sc.nextInt();
  sum = num1 + num2;

  System.out.println();
  System.out.println("Sum is "  + sum);
 }
}
