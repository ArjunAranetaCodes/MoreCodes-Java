//Problem 3: Write a program that accepts length and
//width of rectangle to find area.
import java.util.Scanner;
public class Program {
 public static void main(String[] args) {
  int length = 0;
  int width = 0;
  int area = 0;

  Scanner sc = new Scanner(System.in);
  System.out.print("Enter value of length: ");
  length = sc.nextInt();
  System.out.print("Enter value of width: ");
  width = sc.nextInt();
  area = length * width;

  System.out.println();
  System.out.println("Area of Rectangle is "  + area);
 }
}
