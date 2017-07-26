//Problem 4:Write a program that accepts radius of a circle and
//find its diameter, circumference, and area.
import java.util.Scanner;
public class Program {
 public static void main(String[] args) {
  double radius = 0.0;
  double dia = 0.0;
  double pi = 3.14;
  double area = 0.0;
  double cir = 0.0;

  Scanner sc = new Scanner(System.in);
  System.out.print("Enter value of radius: ");
  radius = sc.nextFloat();
  dia = radius * radius;
  area = pi * dia;
  cir = 2.0 * pi * radius;


  System.out.println();
  System.out.println("Diamter of Circle is "  + dia);
  System.out.println("Area of Circle is "  + area);
  System.out.println("Circumference of Circle is "  + cir);
 }
}
