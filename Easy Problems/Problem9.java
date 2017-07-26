//Problem 9: Write a program that accepts a number
//and outputs 1 to the input (1 to n).
import java.util.Scanner;
public class Problem9 {
 public static void main(String[] args) {
  int num = 0;
  int sum = 0;

  Scanner sc = new Scanner(System.in);
  System.out.print("Enter value of num: ");
  num = sc.nextInt();

  for(int x = 0; x <= num; x++){
   sum = sum + x;
  }

  System.out.println("The sum of 1 to " + String.valueOf(num) +
  " is " + String.valueOf(sum));
 }
}
