//Problem 2: Write a program that accepts two numbers
//and perform all arithmetic operations.
import java.util.Scanner;
public class Program {
 public static void main(String[] args) {
  int num1 = 0;
  int num2 = 0;
  int sum = 0;
  int diff = 0;
  int prod = 0;
  int quot = 0;

  Scanner sc = new Scanner(System.in);
  System.out.print("Enter value of num1: ");
  num1 = sc.nextInt();
  System.out.print("Enter value of num2: ");
  num2 = sc.nextInt();
  sum = num1 + num2;
  diff = num1 - num2;
  prod = num1 * num2;
  quot = num1 / num2;

  System.out.println();
  System.out.println("Sum is "  + sum);
  System.out.println("Difference is "  + diff);
  System.out.println("Product is "  + prod);
  System.out.println("Quotient is "  + quot);
 }
}
