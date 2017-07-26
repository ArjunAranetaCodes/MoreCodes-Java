//Variables and Input
import java.util.Scanner;
public class basicinput {
 public static void main(String[] args) {
  String name = "";
  char sex;
  int age = 0;

  Scanner sc = new Scanner(System.in);
  System.out.print("What is your name? ");
  name = sc.nextLine();
  System.out.print("What is your sex? ");
  sex = sc.nextLine().charAt(0);
  System.out.print("What is your age? ");
  age = sc.nextInt();

  System.out.println();
  System.out.println("Name: " + name);
  System.out.println("Sex: " + sex);
  System.out.println("Age: " + age);
 }
}
