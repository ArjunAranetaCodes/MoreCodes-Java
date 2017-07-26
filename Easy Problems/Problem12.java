//Problem 12: Write a program that asks a user for their
//name and outputs a greeting with their name.
import java.util.Scanner;
public class Problem12{
 public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  String name = "";

  System.out.print("Enter name: ");
  name = scan.nextLine();
  System.out.print("Hello " + name);
 }
}
